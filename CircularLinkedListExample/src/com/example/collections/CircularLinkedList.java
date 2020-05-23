package com.example.collections;

public class CircularLinkedList {
	
	public Node head = null;
	public Node tail = null;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
			tail.next=head;
		}else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	public void display() {
		Node current = head;
		if(head==null) {
			System.out.println("List is Emplty");
		}else {
			do {
				System.out.println(" -- "+current.data);
				current = current.next;
				
			}while(current!=head);
		}
	}

	public static void main(String[] args) {

		CircularLinkedList list = new CircularLinkedList();
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(2);
		list.add(9);
		list.display();
	}

}
