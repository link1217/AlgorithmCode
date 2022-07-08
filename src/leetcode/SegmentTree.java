package leetcode;

public class SegmentTree {

    class Node {
        int left;
        int right;
        int val;
        int mark;
        Node leftNode;
        Node rightNode;

        public Node(int l, int r) {
            left = l;
            right = r;
        }

        public Node getLeftNode() {
            if (leftNode == null) {
                leftNode = new Node(left, left + (right - left) / 2);
            }
            return leftNode;
        }

        public Node getRightNode() {
            if (rightNode == null) {
                rightNode = new Node(left + (right - left) / 2 + 1, right);
            }
            return rightNode;
        }

        public void pushDown(Node node) {
            if (node.mark > 0) {
                node.getLeftNode().val += (node.leftNode.right - node.leftNode.left) * node.mark;
                node.getLeftNode().mark += node.mark;
                node.getRightNode().val += (node.rightNode.right - node.rightNode.left) * node.mark;
                node.getRightNode().mark += node.mark;
                node.mark = 0;
            }
        }

        public void update(Node node, int lo, int hi, int val) {
            if (node.left > hi || node.right < lo) {
                return;
            }
            if (node.left >= lo && node.right <= hi) {
                node.mark += val;
                node.val += (node.right - node.left) * val;
                return;
            }
            pushDown(node);
            update(node.getLeftNode(), lo, hi, val);
            update(node.getRightNode(), lo, hi, val);
        }

        public int query(Node node, int lo, int hi) {
            if (node.left > hi || node.right < lo) {
                return 0;
            }
            if (node.left >= lo && node.right <= hi) {
                return node.val;
            }
            pushDown(node);

            return query(node.getLeftNode(), lo, hi) + query(node.getRightNode(), lo, hi);
        }
    }

}
