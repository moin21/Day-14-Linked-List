package com.linkedlist;

public class Main {
	public static void main(String[] args) {
		/**
		 * Calling addFist method to create new nodes and assigning values to it using method param.
		 */
		LinkedListService list = new LinkedListService();
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		list.deleteLastNode();
		list.printList();
	}
}
