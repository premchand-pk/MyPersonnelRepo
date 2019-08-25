//https://java2blog.com/implement-singly-linked-list-in-java/
package com.selflearning;

class Node {
	public int data;
	public Node next;

	public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
}

public class SinglyLinkedList {
	private Node nodeInstance;

	public boolean isEmpty() {
		return (nodeInstance == null);
	}

	// used to insert a nodeInstance at the start of linked list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = nodeInstance;
		nodeInstance = newNode;
	}

	// used to delete nodeInstance from start of linked list
	public Node deleteFirst() {
		Node temp = nodeInstance;
		nodeInstance = nodeInstance.next;
		return temp;
	}

	// Use to delete nodeInstance after particular nodeInstance
	public void deleteAfter(Node after) {
		Node temp = nodeInstance;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next = temp.next.next;
	}

	// used to insert a nodeInstance at the start of linked list
	public void insertLast(int data) {
		Node current = nodeInstance;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

	// For printing Linked List
	public void printLinkedList() {
		System.out.println("Printing LinkedList (nodeInstance --> last) ");
		Node currentNode = nodeInstance;
		while (currentNode != null) {
			currentNode.displayNodeData();
			currentNode = currentNode.next;
		}
	}
	
	public int lengthofLinkedList() {
		Node tempNode = nodeInstance;
		int count = 0;
		while(tempNode != null ) {
			tempNode = tempNode.next;
			count++;
		}
		return count; 		
	}

	public static void main(String[] args) {
		SinglyLinkedList myLinkedlist = new SinglyLinkedList();
		myLinkedlist.insertFirst(13);
		myLinkedlist.insertFirst(11);
		myLinkedlist.insertFirst(15);
		myLinkedlist.insertFirst(12);
		myLinkedlist.insertLast(2);
		// Linked list will be
		// 2 -> 1 -> 7 -> 6 -> 5
		myLinkedlist.printLinkedList();
		Node nodeInstance = new Node();
		nodeInstance.data = 12;
		myLinkedlist.deleteAfter(nodeInstance);
		System.out.println("after deleting :-> "); 
		myLinkedlist.printLinkedList();

//		 After deleting nodeInstance after 1,Linked list will be
		// 2 -> 1 -> 6 -> 5
		
		int size = myLinkedlist.lengthofLinkedList();
		System.out.println("size : " + size); 		
	}
}

