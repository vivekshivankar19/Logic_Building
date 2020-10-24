package DS.sorting;

import java.util.Scanner;

class Node{
	public int data;
	public Node next;
	
	public Node(int value) {
		data = value;
		next = null;
	}
}

class SinglyLL{
	public Node head;
	
	public SinglyLL() {
		head = null;
	}
	
	public void insertFisrt(int no) {
		Node newn = new Node(no);
		if(head == null) {
			head = newn;
		}else {
			newn.next = head;
			head = newn;
		}
	}
	

	public void insertLast(int no) {
		Node newn = new Node(no);
		
		if(head == null) {
			head = newn;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newn;
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public int count() {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public void deleteFirst() {
		if(head == null) {
			return;
		}else {
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(head == null) {
			return;
		}else {
			
			if(head.next == null) {
				head = null;
			}else {
			
				Node temp = head;
				
				while(temp.next.next != null) {
					temp = temp.next;
				}
				temp.next = null;
			}
		}
	}
	
	public void insertAtPos(int pos, int value) {
		
		int count  = count();
		if(count < pos || count < 0) {
			return;
		}
		
		if(pos == 1) {
			insertFisrt(value);
		}else if(pos == count) {
			insertLast(value);
		}else {
			Node newn = new Node(value);
			if(head == null) {
				head = newn;
			}else {
				Node temp = head;
				int i = 1;
				for(i = 1; i < pos-1 ; i++) {
					temp = temp.next;
				}
				
				newn.next = temp.next;
				temp.next = newn;
			}
		}
	}
}

public class SSLinkedList {

	public static void main(String[] args) {
		System.out.println(" Inside Main");
		SinglyLL ss = new SinglyLL();
		
		Scanner sc  = new Scanner(System.in);
		int choice = 1;
		
		while(choice > 0) {
			System.out.println("=========================");
			System.out.println("Enter ur choice : ");
			System.out.println("=========================");
			System.out.println("1 : Insert First");
			System.out.println("2 : Insert Last");
			System.out.println("3 : Delete First");
			System.out.println("4 : Delete First");
			System.out.println("5 : insert at pos");
			System.out.println("6 : Count First");
			System.out.println("0 : Exit");
			System.out.println("=========================");
			choice = sc.nextInt();
			int value = 0;
			switch(choice) {
				
				case 1: 
					System.out.println(" Insert first option");
					System.out.println("Enter valuee in LL");
					value = sc.nextInt();
					ss.insertFisrt(value);
				break;
				case 2: 
					System.out.println("Select Insert last option");
					System.out.println("Enter value in LL");
					value = sc.nextInt();
					ss.insertLast(value);
				break;
				case 3: 
					System.out.println("Select delete first option");
					ss.deleteFirst();
				break;
				case 4: 
					System.out.println("Select delete last option");
					ss.deleteLast();
				break;
				case 6: 
					System.out.println("Select count option");
					System.out.println("count in List is : "+ ss.count());
					ss.display();
				break;
				case 5: 
					System.out.println("Select insert at pos option");
					System.out.println("Enter index");
					int v = sc.nextInt();
					System.out.println("Enter value in LL");
					value = sc.nextInt();
					ss.insertAtPos(v, value);
				break;
				case 0: 
					System.out.println("Select exit option");
				break;
				default: 
					System.out.println("Enter correct value again!!!");
				break;
			}
		}
		
		sc.close();
		System.out.println("Thanks for visiting the Vivek.");
	}

}
