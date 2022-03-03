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
	 * Method to add a node at any specific place in linked list
	 * 
	 * @param data     - value to be added to the node
	 * @param position - position of node(starting from 1)
	 */
	void addAtSpecificPosition(int data, int position) {
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = null;

		if (position < 1) {
			System.out.print("\nposition should be >= 1.");
		} else if (position == 1) {
			newNode.next = head;
			head = newNode;
		} else {

			Node currentNode = new Node(data);
			currentNode = head;
			for (int i = 1; i < position - 1; i++) {
				if (currentNode != null) {
					currentNode = currentNode.next;
				}
			}

			if (currentNode != null) {
				newNode.next = currentNode.next;
				currentNode.next = newNode;
			} else {
				System.out.print("\nThe previous node is null.");
			}
		}
	}

	/**
	 * Method: Assigning head.next as head. This disconnects the head form linked
	 * list
	 * 
	 * @return - new head which is next to the previous head
	 */
	public Node deleteHeadNode() {
		System.out.println("Deleted node from start : " + head.data);
		head = head.next;
		return head;
	}

	/**
	 * Method to delete last node It first finds the second last node using while
	 * loop. Then redirects this currentHead to null
	 * 
	 */
	public void deleteLastNode() {

		if (head == null || head.next == null) {
			return;
		}

		Node currentHead = head;
		while (currentHead.next.next != null) {
			currentHead = currentHead.next;
		}

		currentHead.next = null;

	}

	/**
	 * Method to match every node existing with key provided and print the position
	 * if matched.
	 * 
	 * @param key - Value we want to search in nodes
	 * 
	 */
	public void searchList(int key) {
		int count = 1;
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.data == key)
				System.out.println(count);
			currentNode = currentNode.next;
			count++;
		}
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
