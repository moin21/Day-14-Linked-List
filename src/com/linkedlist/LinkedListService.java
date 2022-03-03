package com.linkedlist;

public class LinkedListService {
	Node head;

	/**
	 * Method to addNode at start of LinkedList:
	 * 
	 * @param data - data to be added is used as parameter
	 * @return - if list is empty it head = newNode and return.
	 */
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	/**
	 * Method to addNode at last of the list
	 * 
	 * @param data - data to be added is used as parameter
	 * @return - if list is empty it head = newNode and return.
	 */
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}

	/**
	 * Method to Print list Here first we check if list is empty and give a message
	 * to user, if not we print every current Node starting from head, while
	 * changing to currentNode to next every time it prints one node.
	 */
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
}
