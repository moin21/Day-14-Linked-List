package com.linkedlist;

public class Main {
	public static void main(String[] args) {
		/**
		 * Calling addFist method to create new nodes and assigning values to it using method param.
		 */
		LinkedListService list = new LinkedListService();
		list.addLast(70);
		list.addLast(30);
		list.addLast(56);
		list.printList();
	}
}
