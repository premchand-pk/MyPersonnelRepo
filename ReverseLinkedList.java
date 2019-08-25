package com.selflearning;

public class ReverseLinkedList {

	static Node ognlNode;

	static class Node {

		int data;
		Node nextNode;

		Node(int d) {
			data = d;
			nextNode = null;
		}
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.nextNode;
		}
	}

	private void addElement(Node node) {

		if (ognlNode == null) {
			ognlNode = node;
		} else {
			Node tempNode = ognlNode;
			while (tempNode.nextNode != null) {
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = node;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node) {
		// For first node, previousNode will be null
		Node prev = null;
		Node current = node;
		Node nextNode = null;
		while (current != null) {
			nextNode = current.nextNode;
			// reversing the link
			current.nextNode = prev;
			// moving currentNode and previousNode by 1 node
			prev = current;
			current = nextNode;
		}
		node = prev;
		return node;
	}
	
	public Node reverseLinkedList(Node currentNode)
 {
		// For first node, previousNode will be null
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.nextNode;
			// reversing the link
			currentNode.nextNode = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
	
	public static void main(String[] args) {

		ReverseLinkedList list = new ReverseLinkedList();

		list.addElement(new Node(1)); list.addElement(new Node(15));
		list.addElement(new Node(20)); list.addElement(new Node(25));
		list.addElement(new Node(30)); list.addElement(new Node(39));
		list.addElement(new Node(40)); list.addElement(new Node(45));		
		
		System.out.println("Given Linked list");
		list.printList(ognlNode);
		ognlNode = list.reverse(ognlNode);
		System.out.println("\nReversed linked list 1st way ");
		list.printList(ognlNode);
		System.out.println("\nReversed linked list in 2nd way");
		list.reverseLinkedList(ognlNode);
		list.printList(ognlNode);
	}
}
