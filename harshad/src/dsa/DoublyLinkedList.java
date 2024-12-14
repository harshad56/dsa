package dsa;

class DoublyLinkedList {
	// Node class to represent each node in the list 
	static class Node { int data;
	Node next, prev;

	Node(int data) {             this.data = data;             this.next = this.prev = null; 
        }}

	Node head;

	// Method to append a new node at the end
	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		newNode.prev = last;
	}

	public void delete(int key) {
		Node temp = head;
		if (temp != null && temp.data == key) {
			head = temp.next;
			if (head != null)
				head.prev = null;
			return;
		}
		while (temp != null && temp.data != key) {
			temp = temp.next;
		}
		if (temp == null)
			return;
		if (temp.next != null)
			temp.next.prev = temp.prev;
		if (temp.prev != null)
			temp.prev.next = temp.next;
	}

	// Method to print the list forward 
	public void printList() { Node temp = head;
	
	while (temp != null) {
	System.out.print(temp.data+" <-> ");temp=temp.next;

	}System.out.println("None");}

	public void printReverse() {
		Node temp = head;
		if (temp == null)
			return;
		while (temp.next != null) {
			temp = temp.next;
		}
		while (temp != null) {
			System.out.print(temp.data + " <-> ");
			temp = temp.prev;
		}
		System.out.println("None");
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.printList(); // Output: 10 <-> 20 <-> 30 <-> None 
		list.printReverse(); // Output: 30 <-> 20
							// <-> 10 <-> None 
		list.delete(20);
		list.printList(); // Output: 10 <-> 30 <-> None
	}
}
