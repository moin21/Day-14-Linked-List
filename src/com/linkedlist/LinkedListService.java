package com.linkedlist;

public class LinkedListService {
	static Node head;

	/**
	 * Method to addNode at start of LinkedList: First checked if list is empty, if
	 * empty, new node will be the head. If not new node created will be the head
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
	 * Method to addNode at last of the list First we will check if list is empty,
	 * if empty, new node will be the head. if not, we will move to last node by
	 * checking current.next = null, and than currentNode.next will be the new node.
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
	 * Method to add a node at any specific place in linked list first we will check
	 * if the user input for node position is existing Then we will move to that
	 * position by moving currentNode, than create new node using currentNode.next
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
	public static int count = 1;

	public int searchList(int key) {

		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.data == key) {
				System.out.println(count);
				currentNode = currentNode.next;
				count++;
				return count;
			}

			else {
				System.out.println("No result found");

			}
		}
		return count;
	}

	/**
	 * Method to search a value in linked list and than add a new node to it by
	 * calling existing method.
	 * 
	 * @param key - value that needs to be searched
	 */
	public void searchListAndAdd(int key) {
		int count = searchList(key);
		addAtSpecificPosition(key, count - 1);
	}

	/**
	 * Method to delete specific node from Linked List Here we take 2 variable
	 * currNode and prevNode and assign currNode and prevNode to head Then we have
	 * checked if currNode data is equal to the data given If equal then we are
	 * assigning the prevNode next to the currNode next we are changing the prevNode
	 * to currNode and currNode as currNode.next If not found that we are displaying
	 * the alert
	 * 
	 * @param data
	 */
	public void deleteNode(int data) {
		Node currentNode = head;
		Node previousNode = head;

		while (currentNode != null) {
			if (currentNode.data == data) {
				previousNode.next = currentNode.next;
				return;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		System.out.println(" Unable to find the node for value " + data);

	}

	/**
	 * Method to display the size of the LinkedList 1. Here we are traversing in the
	 * LinkedLst with currNode.next and incrementing the counter 2. So the total
	 * node in the LinkedList will be the total value of counter
	 */
	public void size() {
		Node currentNode = head;
		int count = 0;

		while (currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}

		System.out.println("The size of the LinkedList is : " + count);
	}

	/**
	 * Method to sort Linked list by comparing current node to next node First we
	 * define current node as head for start and currentNode.next as nextNode now
	 * compare data of currentNode and nextNode, if currentNode.data > nextNode.data
	 * we swap them else we move to the next node assigning it as current node
	 */
	public void sortList() {
		Node currentNode = head, nextNode = null;
		int temp;

		if (head == null) {
			return;
		} else {
			while (currentNode != null) {
				// Node index will point to node next to current
				nextNode = currentNode.next;

				while (nextNode != null) {
					// If current node's data is greater than index's node data, swap the data
					// between them
					if (currentNode.data > nextNode.data) {
						temp = currentNode.data;
						currentNode.data = nextNode.data;
						nextNode.data = temp;
					}

					nextNode = nextNode.next;
				}
				currentNode = currentNode.next;
			}
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
	}
}
