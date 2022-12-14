package Linkedlist.Link;

import java.util.LinkedList;

public class Insertlist {

	public static void main(String[] args) {

		System.out.println("Welcome to the Linked List Program");

		System.out.println("Adding elements 70,30,56 to Linked List :");
		Insertlist linkedList = new Insertlist();
		linkedList.add(70);
		linkedList.add(30);
		linkedList.add(56);
		System.out.println("Displaying the list of elements :");
		linkedList.display();
		System.out.println();

		System.out.println("Appending elements 56,30,70 to Linked List :");
		Insertlist linkedList1 = new Insertlist();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);
		System.out.println("Displaying the list of elements :");
		linkedList1.display();
		System.out.println();

		System.out.println("Inserting 30 between 56 and 70 element into list:");
		LinkedList<Integer> linkedList2 = new LinkedList<>();
		linkedList2.add(70);
		linkedList2.add(56);
		System.out.println("Before insertion: ");
		linkedList2.display();
		linkedList2.insert(56, 30);
		System.out.println();
		System.out.println("After insertion: ");
		linkedList2.display();
		System.out.println();

	}

}