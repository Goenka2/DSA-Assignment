package day1;

public class LinkedList {

	public Node head;

	public boolean insertAtLast(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
			return true;
		}

		else {

			Node temp = head;

			while (true) {
				if (temp.getNext() != null) {

					temp = temp.getNext();
				} else {

					temp.setNext(newNode);

					return true;
				}
			}
		}

	}

	public boolean deleteAtLast() {

		if (head == null) {

			return false;
		}

		else {
			Node delete = head;
			Node temp = head;

			while (true) {
				if (delete.getNext() != null) {
					temp = delete;
					delete = delete.getNext();
				} else {

					if (delete == head) {

						temp = delete = head = null;
						
						return true;

					} else {
						temp.setNext(null);
						delete = null;

						return true;
					}

				}
			}
		}

	}

	public boolean insertAtBegin(int data) {

		Node temp = head;

		head = new Node(data);

		head.setNext(temp);

		return true;

	}
	
	public boolean reverseLinkedList() {
		
		Node prev = null;
		Node next = null;
		Node current  = head;
		
		while(current!=null) {
		next = current.getNext();
		current.setNext(prev);
		prev = current;
		current = next;
		}
		
		head = prev;
		
		
		return true;
		
	}

	public boolean deleteAtBegin() {

		Node temp = head;

		head = head.getNext();

		temp.setNext(null);

		temp = null;

		return true;

	}

	public boolean display() {

		Node temp = head;

		while (temp != null) {

			System.out.println(temp.getData());

			temp = temp.getNext();

		}
		return false;

	}

	class Node {

		private int data;
		private Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;

		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
