package dsa;

class SinglyLinkedList {
	// Node class to represent each node in the list
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	// Method to append a new node to the list
	public void append(int data) {
		Node
		//
		newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}

	// Method to delete a node by value
	public void delete(int key) {
		Node temp = head;
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		Node prev = null;
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			return;
		prev.next = temp.next;
	}

	// Method to print the list
	public void printList() { Node temp = head; while
	
		(temp != null) {
	System.out.print(temp.data+" -> ");
	temp=temp.next;}System.out.println("None");}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.printList(); 
		list.printList(); 
	}
}
