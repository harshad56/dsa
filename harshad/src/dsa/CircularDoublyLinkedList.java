package dsa;

class CircularDoublyLinkedList {
	
	static class Node {
		int data;
		Node next, prev;

		Node(int data) {
			this.data = data;
			this.next = this.prev = null;
		}
	}

	Node head;

	// Method to append a new node to the list (at the end)
	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			newNode.next = newNode.prev = head; // Circular link
			return;
		}
		Node last = head;
		while (last.next != head) {
			last = last.next;
		}
		last.next = newNode;
		newNode.prev = last;
		newNode.next = head;
		head.prev = newNode;
	}

	// Method to insert a node at the front
	public void insertAtFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			newNode.next = newNode.prev = head; // Circular link return;
		}
		Node last = head.prev; // Last node (previous of head)
		newNode.next = head;
		newNode.prev = last;
		//
		last.next = newNode;
		head.prev = newNode;
		head = newNode; // New node becomes the head
	}

	// Method to delete a node by value
	public void delete(int key) {
		if (head == null)
			return; // List is empty

		Node temp = head;
		if (temp.data == key) { // If head is the node to be deleted
			if (temp.next == head) { // Only one node
				// in the list
				head = null;
			} else {
				Node last = head.prev;
				head = temp.next;
				last.next = head;
				head.prev = last;
			}
			return;
		}

		// Traverse the list to find the node to delete
		while (temp != head && temp.data != key)

		{
			temp = temp.next;
		}
		if (temp == head)
			return; 

		
		temp.prev.next = temp.next;

		temp.next.prev = temp.prev;
	}

	
	public void printListForward() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node temp = head;
		do {
			System.out.print(temp.data + " <-> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("Back to head");
	}

	// Method to print the list in reverse direction
	public void printListBackward() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node temp = head.prev;
		do {
			System.out.print(temp.data + " <-> ");
			temp = temp.prev;
		} while (temp != head.prev);
		System.out.println("Back to tail");
	}

	public static void main(String[] args) {
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();

		// Appending nodes
		list.append(10);
		list.append(20);
		list.append(30);
		list.printListForward(); 
		list.printListBackward(); 
									

		// Inserting node at the front
		list.insertAtFront(5);
		list.printListForward(); 
		list.printListBackward(); 
									

		// Deleting node with value 20
		list.delete(20);
		list.printListForward();
		list.printListBackward(); 

		// Deleting head node (5)
		list.delete(5);
		list.printListForward(); 
		list.printListBackward(); 
									
	}
}
