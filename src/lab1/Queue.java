package lab1;

import java.util.Scanner;

public class Queue {
	private ListNode front;
	private ListNode rear;
	private int length;

	public Queue() {
		this.front = null;
		this.rear = null;
		this.length = 0;
	}

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public int lenght() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void enqueue(int data) {
		ListNode temp = new ListNode(data);
		if (isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}

		rear = temp;
		length++;
	}

	public void deque(int data) {
		ListNode temp = new ListNode(data);
		if (isEmpty()) {
			return;
		} else {
			temp.next = front;
			front = front.next;

			if (front == null)
				rear = null;
		}
		length--;
	}

	public void print() {
		if (isEmpty()) {
			return;
		}

		ListNode current = front;
		while (current != null) {
			System.out.println(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		try {
			Queue q = new Queue();
			Scanner sc = new Scanner(System.in);
			int dt = 0;
			System.out.println("Daraalliin hemjeeg oruulna uu?");
			int sz = sc.nextInt();
			for (int i = 1; i <= sz; i++) {
				System.out.println(i + "deh utgiig oruulna uu?");
				dt = sc.nextInt();
				q.enqueue(dt);
			}
			// q.deque(dt - 1);
			q.print();
			System.out.println(q.isEmpty());
			System.out.println(q.length);
		} catch (Exception ex) {
			System.out.println("Turliin utga buhel too baih ystoig anhaarna uu!!!");
		}

	}
}