package day1;

public class TesterLL {

public static void main(String[] args) {
	
	LinkedList ll = new LinkedList();
	
	ll.insertAtLast(20);
	ll.insertAtLast(30);
	ll.insertAtLast(40);
	ll.insertAtLast(50);
	ll.insertAtLast(60);
	ll.insertAtLast(10);
	ll.insertAtLast(25);
//	ll.deleteAtLast();
//	ll.deleteAtLast();
//	ll.deleteAtLast();
//	ll.deleteAtLast();
//	ll.deleteAtLast();
//	ll.deleteAtLast();
//	ll.deleteAtLast();
//	ll.insertAtBegin(20);
//	ll.insertAtBegin(30);
	ll.reverseLinkedList();

	
	ll.display();
	
	
	
}
}
