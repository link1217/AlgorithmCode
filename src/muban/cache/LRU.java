import java.util.HashMap;
import java.util.Map;

class LRUCache {
    class Node<K, V> {
        K key;
        V val;
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

        public void insert(Node<K, V> node) {
            if (this.next != null) {
                this.next.pre = node;
                node.next = this.next;
            }
            node.pre = this;
            this.next = node;
        }
    }

    class LRU<K, V> {
        int capacity;
        Node<K, V> head;
        Node<K, V> tail;
        Map<K, Node<K, V>> cacheMap;

        public LRU(int capacity) {
            this.capacity = capacity;
            this.cacheMap = new HashMap<>();
        }

        public Node<K, V> get(K key) {
            Node<K, V> node = cacheMap.get(key);
            if (node == null || node == tail) {
                return node;
            }
            if (node == head) {
                head = head.next;
            }
            node.remove();
            tail.insert(node);
            tail = node;
            return node;
        }

        public void put(K key, V val) {
            Node<K, V> node = cacheMap.getOrDefault(key, new Node<>(key, val));
            node.val = val;
            cacheMap.put(key, node);
            if (tail == null) {
                head = node;
                tail = node;
                return;
            }
            get(key);
            if (cacheMap.size() > capacity) {
                remove(head.key);
            }
        }

        public void remove(K key) {
            Node<K, V> node = cacheMap.remove(key);
            if (node == null) {
                return;
            }
            if (node == head) {
                head = head.next;
            }
            if (node == tail) {
                tail = tail.pre;
            }
            node.remove();
        }
    }
}