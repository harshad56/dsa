package dsa;

import java.util.ArrayList;

public class MinHeap {
	private ArrayList<Integer> heap;

	public MinHeap() {
		heap = new ArrayList<>();
	}

	public void insert(int value) {
		heap.add(value);
		reheapUp(heap.size() - 1);
	}

	public int delete() {
		if (heap.isEmpty()) {
			throw new IllegalStateException("Heap is empty");
		}
		int root = heap.get(0);
		heap.set(0, heap.remove(heap.size() - 1));
		reheapDown(0);
		return root;
	}

	private void reheapUp(int index) {
		int parent = (index - 1) / 2;
		while (index > 0 && heap.get(index) < heap.get(parent)) {
			swap(index, parent);
			index = parent;
			parent = (index - 1) / 2;
		}
	}

	private void reheapDown(int index) {
		int leftChild, rightChild, smallest;
		while (index < heap.size()) {
			leftChild = 2 * index + 1;
			rightChild = 2 * index + 2;
			smallest = index;

			if (leftChild < heap.size() && heap.get(leftChild) < heap.get(smallest)) {
				smallest = leftChild;
			}
			if (rightChild < heap.size() && heap.get(rightChild) < heap.get(smallest)) {
				smallest = rightChild;
			}
			if (smallest == index) {
				break;
			}
			swap(index, smallest);
			index = smallest;
		}
	}

	private void swap(int i, int j) {
		int temp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, temp);
	}

	public void printHeap() {
		System.out.println(heap);
	}

	public static void main(String[] args) {
		MinHeap minHeap = new MinHeap();
		minHeap.insert(10);
		minHeap.insert(5);
		minHeap.insert(20);
		minHeap.insert(2);

		minHeap.printHeap();

		System.out.println("Deleted: " + minHeap.delete());
		minHeap.printHeap();
	}
}
