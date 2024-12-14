package dsa;

import java.util.EmptyStackException;

class LinkedListStack {
	private Node top;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public LinkedListStack() {
		top = null;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}

	public int pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		int data = top.data;
		top = top.next;
		return data;
	}

	public int peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Top element: " + stack.peek());

		System.out.println("Popped element: " + stack.pop());

		System.out.println("Top element after pop: " + stack.peek());

		System.out.println("Is the stack empty? " + stack.isEmpty());

		System.out.println("Popped element: " + stack.pop());

		System.out.println("Is the stack empty now? " + stack.isEmpty());
	}
}
