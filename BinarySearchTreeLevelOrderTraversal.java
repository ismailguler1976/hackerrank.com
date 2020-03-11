package ig.hackerrank.solution;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinarySearchTreeLevelOrderTraversal {

	static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		String result = "";
		if (root != null) {
			queue.add(root);
		}
		while (!queue.isEmpty()) {
			Node t = queue.poll();
			result += t.data + " ";
			if (t.left != null) {
				queue.add(t.left);
			}
			if (t.right != null) {
				queue.add(t.right);
			}
		}
		System.out.println(result);

	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		levelOrder(root);
	}

}
