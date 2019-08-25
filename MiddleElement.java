package com.selflearning;

public class MiddleElement {

	private Node orgnlNode;

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;
		}
	}

	private void add(Node newNode) {
		if (orgnlNode == null) {
			orgnlNode = newNode;
		} else {
			Node tempNode = orgnlNode;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}

	public void printElements() {
		Node node = orgnlNode;
		System.out.println("printing elements");
		while (node != null) {
			System.out.print(" " + node.value);
			node = node.next;
		}
	}

	// Loop through the linked list when fastPointer reaches the end
	// of the list then slowPointer will be at the middle node
	public void middleElement() {
		Node fastPointer = orgnlNode;
		Node slowPointer = orgnlNode;

		if (orgnlNode != null) {
			while (fastPointer != null && fastPointer.next != null) {
				fastPointer = fastPointer.next.next;
				slowPointer = slowPointer.next;
			}
			System.out.println("  middle ele :" + slowPointer.value);
		}
	}

	public static void main(String[] args) {
		MiddleElement element = new MiddleElement();
		element.add(new Node(10));
		element.add(new Node(11));
		element.add(new Node(25));
		element.add(new Node(13));
		element.add(new Node(14));
		element.add(new Node(55));
		element.add(new Node(75));
		element.add(new Node(155));

		element.printElements();
		element.middleElement();
	}

}
