package dsa;

import java.util.NoSuchElementException;

class LinkedListPriorityQueue {
	private Node head;

	class Node {
		int data, priority;
		Node next;

		Node(int data, int priority) {
			this.data = data;
			this.priority = priority;
			this.next = null;
		}
	}

	public LinkedListPriorityQueue() {
		head = null;
	}

	public void enqueue(int data, int priority) {
		Node newNode = new Node(data, priority);
		if (head == null || head.priority < priority) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null && current.next.priority >= priority) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public int dequeue() {
		if (head == null)
			throw new NoSuchElementException();
		int data = head.data;
		head = head.next;
		return data;
	}

	public static void main(String[] args) {
		LinkedListPriorityQueue queue = new LinkedListPriorityQueue();
		queue.enqueue(10, 2);
		queue.enqueue(20, 1);
		queue.enqueue(30, 3);

		System.out.println("Dequeued element: " + queue.dequeue());
		System.out.println("Dequeued element: " + queue.dequeue());
	}
}
