package com.linkedlist;

public class Main {
	public static void main(String[] args) {
		Node head = new Node(56);
		Node second = new Node(30);
		Node third = new Node(70);
		head.next = second;
		second.next = third;
		third.next = null;

		System.out.println(head.data + " " + second.data + " " + third.data);
	}
}
