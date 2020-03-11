package ig.hackerrank.solution;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

public class RemoveDublicatesFromList {

	public static Node removeDuplicates(Node head) {
		// Write your code here

		if (head != null) {
			Node k = head;
			Node p = head;

			while (p != null) {
				Node n = p.next;
				while (n != null) {
					if (p.data == n.data) {
						if (n.next == null) {
							p.next = null;
						} else {
							p.next = n.next;
						}
					}
					n = n.next;
				}
				p = p.next;
			}
		}

		return head;
	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		sc.close();
		head = removeDuplicates(head);
		display(head);

	}

}
