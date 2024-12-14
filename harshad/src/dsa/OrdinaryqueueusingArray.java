package dsa;

public class OrdinaryqueueusingArray {
	private int[] queue;
	private int front, rear, size, capacity;

	public OrdinaryqueueusingArray(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full! Cannot enqueue " + element);
			return;
		}
		rear = (rear + 1) % capacity;
		queue[rear] = element;
		size++;
		System.out.println(element + " added to the queue");
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty! Cannot dequeue");
			return -1;
		}
		int element = queue[front];
		front = (front + 1) % capacity;
		size--;
		return element;
	}

	public int front() {
		if (isEmpty()) {
			System.out.println("Queue is empty! No front element");
			return -1;
		}
		return queue[front];
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {

		OrdinaryqueueusingArray q = new OrdinaryqueueusingArray(5);

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);

		q.enqueue(60);

		System.out.println("Dequeued element: " + q.dequeue());
		System.out.println("Dequeued element: " + q.dequeue());

		System.out.println("Front element: " + q.front());

		q.enqueue(60);
		q.enqueue(70);

		System.out.println("Current size of the queue: " + q.getSize());
	}

}
