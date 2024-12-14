package dsa;

import java.util.NoSuchElementException;

class LinkedListQueue {
	private Node front, rear;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public LinkedListQueue() {
		front = rear = null;
	}

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (rear == null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}

	public int dequeue() {
		if (front == null)
			throw new NoSuchElementException();
		int data = front.data;
		front = front.next;
		if (front == null)
			rear = null;
		return data;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public static void main(String[] args) {
		LinkedListQueue queue = new LinkedListQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Dequeued element: " + queue.dequeue());
		System.out.println("Dequeued element: " + queue.dequeue());
	}
}
