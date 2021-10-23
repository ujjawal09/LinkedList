package basics;

public class LinkedList {

	static Node head = null;

	public static void addAtBeg(int data) {
		Node temp = new Node(data);
		if (head == null)
			head = temp;
		else {
			temp.next = head;
			head = temp;
		}

	}

	public static void printLinkedList() {
		Node temp = head;
		if(temp==null)
			System.out.println("Linked List doesn't exsist");
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void addAtPos(int pos, int data) {
		Node p = head;
		Node temp = new Node(data);
		pos--;
		while (--pos > 0) {
			p = p.next;
		}
		temp.next = p.next;
		p.next = temp;

	}

	public static void deleteAtPos(int pos) {
		
		
		Node p = head;
		pos--;
		while (--pos > 0) {
			p = p.next;
		}
		p.next = p.next.next;

	}

	public static  void destroyLinkedList() {
		head = null;
	}
	
	public static void reverseLinkedList() {
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			head=curr;
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
	
		
		
	}
	
	
	public static void foldALinkedList() {
		// i/p =====> 2->5->10->12
		// o/p =====> 2->12->5->10
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;			
		}
		Node prev=null;
		Node curr=slow;
		
		Node temp=null;
		while(curr!=null) {
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;			
		}
		
		Node first=head;
		Node second=prev;
		while(second.next!=null) {
			temp=first.next;
			first.next=second;
			first=temp;
			temp=second.next;
			second.next=first;
			second=temp;
			
		}
		
		
		
	}
	public static void main(String[] args) {
		addAtBeg(5);
		addAtBeg(10);
		addAtBeg(15);
		addAtPos(2, 11);
		//deleteAtPos(2);
		printLinkedList();
		//reverseLinkedList();
		foldALinkedList();		
		System.out.println("-------------------------------");
		printLinkedList();		
	}

}
