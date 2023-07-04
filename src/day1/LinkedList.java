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
				} else if(delete.getNext()== null) {
					
					temp.setNext(null);
					
					if(delete == head) {
						
						delete = head = null;
						
					}
					
					return true;
					
					
				}
			}
		}

	}
	
	
	public boolean display() {
		
		Node temp = head;
		
		while(temp!=null) {
			
			
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
