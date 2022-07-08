package muban.cache;

import java.util.HashMap;
import java.util.Map;

class LFUCache {
    class Node<K, V> {
        K key;
        V val;
        int frequency;
        Node<K, V> pre;
        Node<K, V> next;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }

        public void remove() {
            if (this.pre != null) {
                this.pre.next = this.next;
            }
            if (this.next != null) {
                this.next.pre = this.pre;
            }
            this.pre = null;
            this.next = null;
        }

        public void add(Node<K, V> node) {
            if (this.next != null) {
                this.next.pre = node;
                node.next = this.next;
            }
            node.pre = this;
            this.next = node;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", frequency=" + frequency +
                    '}';
        }
    }

    /**
     * 相同frequency的Node组成一个链表，head是最早的，tail是最新的，纵向连接这些链表，
     */
    class NodeList<K, V> {
        Node<K, V> head;
        Node<K, V> tail;
        NodeList<K, V> pre;
        NodeList<K, V> next;

        public NodeList(Node<K, V> node) {
            this.head = node;
            this.tail = node;
        }

        public void remove() {
            if (this.pre != null) {
                this.pre.next = this.next;
            }
            if (this.next != null) {
                this.next.pre = this.pre;
            }
            this.pre = null;
            this.next = null;
        }

        public void add(NodeList<K, V> nodeList) {
            if (this.next != null) {
                this.next.pre = nodeList;
                nodeList.next = this.next;
            }
            nodeList.pre = this;
            this.next = nodeList;
        }

        @Override
        public String toString() {
            return "NodeList{" +
                    "head=" + head +
                    ", tail=" + tail +
                    '}';
        }
    }

    /**
     * headList是frequency最小的节点链表  cacheMap是节点缓存  frequencyMap是frequency对应的节点链表
     */
    class LFU<K, V> {
        int capacity;
        NodeList<K, V> headList;
        Map<K, Node<K, V>> cacheMap;
        Map<Integer, NodeList<K, V>> frequencyMap;

        public LFU(int capacity) {
            this.capacity = capacity;
            this.cacheMap = new HashMap<>();
            this.frequencyMap = new HashMap<>();
        }

        public Node<K, V> getCache(K key) {
            Node<K, V> node = cacheMap.get(key);
            addFrequency(node);
            return node;
        }

        public void putCache(K key, V val) {
            Node<K, V> node = cacheMap.getOrDefault(key, new Node<>(key, val));
            node.val = val;
            cacheMap.put(key, node);
            addFrequency(node);
            if (cacheMap.size() > capacity) {
                removeCache(headList.head.key);
            }
        }

        public void removeCache(K key) {
            Node<K, V> node = cacheMap.remove(key);
            if (node == null) {
                return;
            }
            NodeList<K, V> curNodeList = frequencyMap.get(node.frequency);
            if (node.equals(curNodeList.head)) {
                curNodeList.head = curNodeList.head.next;
            }
            if (node.equals(curNodeList.tail)) {
                curNodeList.tail = curNodeList.tail.pre;
            }
            if (curNodeList.head == null) {
                if (curNodeList.equals(headList)) {
                    headList = headList.next;
                }
                curNodeList.remove();
                frequencyMap.remove(node.frequency);
            }
            node.remove();
        }

        /**
         * 更新节点的frequency和对应的节点链表
         */
        public void addFrequency(Node<K, V> node) {
            if (node == null) {
                return;
            }
            // 移除node 更新curNodeList
            NodeList<K, V> curNodeList = frequencyMap.get(node.frequency);
            if (curNodeList != null) {
                if (node.equals(curNodeList.head)) {
                    curNodeList.head = curNodeList.head.next;
                }
                if (node.equals(curNodeList.tail)) {
                    curNodeList.tail = curNodeList.tail.pre;
                }
            }
            node.remove();
            // 添加node 更新newNodeList
            node.frequency++;
            NodeList<K, V> newNodeList = frequencyMap.get(node.frequency);
            if (newNodeList == null) {
                newNodeList = new NodeList<>(node);
            } else {
                newNodeList.tail.add(node);
                newNodeList.tail = node;
            }
            frequencyMap.put(node.frequency, newNodeList);
            // 更新curNodeList与newNodeList的连接
            if (curNodeList != null) {
                curNodeList.add(newNodeList);
                if (curNodeList.head == null) {
                    if (curNodeList.equals(headList)) {
                        headList = headList.next;
                    }
                    curNodeList.remove();
                    frequencyMap.remove(node.frequency - 1);
                }
            }
            if (headList == null) {
                headList = newNodeList;
            }
        }

        @Override
        public String toString() {
            return "LFU{" +
                    "cacheSize=" + cacheMap.size() +
                    ", headList=" + headList +
                    ", frequencyMap=" + frequencyMap +
                    '}';
        }
    }

    public static void main(String[] args) {
        LFU<Integer, Integer> lfu = new LFUCache().new LFU<>(3);
        lfu.putCache(1, 1);
        System.out.println(lfu);
        lfu.putCache(2, 2);
        System.out.println(lfu);
        lfu.putCache(3, 3);
        System.out.println(lfu);
        lfu.putCache(4, 4);
        System.out.println(lfu);
        lfu.putCache(2, 2);
        System.out.println(lfu.getCache(1));
        System.out.println(lfu);
        System.out.println(lfu.getCache(2));
        System.out.println(lfu);
        System.out.println(lfu.getCache(3));
        System.out.println(lfu.getCache(3));
        System.out.println(lfu);
    }
}