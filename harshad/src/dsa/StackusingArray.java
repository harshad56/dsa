package dsa;

class Stack {
	private int[] stack;
	private int top;
	private int capacity;

	public Stack(int size) {
		capacity = size;
		stack = new int[capacity];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack Overflow!");
		} else {
			stack[++top] = element;
			System.out.println("Pushed " + element + " into stack.");
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow!");
		} else {
			System.out.println("Popped " + stack[top--] + " from stack.");
		}
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
		} else {
			System.out.println("Top element is " + stack[top]);
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
		} else {
			System.out.print("Stack elements: ");
			for (int i = top; i >= 0; i--) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}
}

public class StackusingArray {
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.peek();
		stack.display();
		stack.pop();
		stack.display();
	}
}
