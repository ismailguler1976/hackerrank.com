package guler.solutions;
import java.util.Scanner;

class NodeII {
	int data;
	NodeII next;

	NodeII(int d) {
		data = d;
		next = null;
	}
}

public class SolutionLinkedList {
	public static NodeII insert(NodeII head, int data) {
		// Complete this method
		if(head == null) {
			head = new NodeII(data);
		} else {
			NodeII temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new NodeII(data);
		}
		return head;
	}

	public static void display(NodeII head) {
		NodeII start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		NodeII head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}
