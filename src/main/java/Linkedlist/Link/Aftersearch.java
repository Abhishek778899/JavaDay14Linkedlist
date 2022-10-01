package Linkedlist.Link;

import java.util.LinkedList;

public class Aftersearch {

	public static void main(String[] args) {

		System.out.println("Welcome to the Linked List Program");

		System.out.println("Adding elements 70,30,56 to Linked List :");
		Aftersearch<Integer> linkedList = new Aftersearch();
		linkedList.add(70);
		linkedList.add(30);
		linkedList.add(56);
		System.out.println("Displaying the list of elements :");
		linkedList.display();
		System.out.println();

		System.out.println("Appending elements 56,30,70 to Linked List :");
		Aftersearch<Integer> linkedList1 = new Aftersearch();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);
		System.out.println("Displaying the list of elements :");
		linkedList1.display();
		System.out.println();

		System.out.println("Inserting 30 between 56 and 70 element into list:");
		Aftersearch<Integer> linkedList2 = new Aftersearch<>();
		linkedList2.add(70);
		linkedList2.add(56);
		System.out.println("Before insertion: ");
		linkedList2.display();
		linkedList2.insert(56, 30);
		System.out.println();
		System.out.println("After insertion: ");
		linkedList2.display();
		System.out.println();

		System.out.println("Deleting first element 56 from list of elements: 56,30,70 ");
		Aftersearch<Integer> linkedList3 = new Aftersearch<>();
		linkedList3.add(70);
		linkedList3.add(30);
		linkedList3.add(56);
		System.out.println("Before deletion: ");
		linkedList3.display();
		linkedList3.pop();
		System.out.println();
		System.out.println("After deletion: ");
		linkedList3.display();
		System.out.println();

		System.out.println("Deleting last element 70 from list of elements: 56,30,70 ");
		Aftersearch<Integer> linkedList4 = new Aftersearch<>();
		linkedList4.add(70);
		linkedList4.add(30);
		linkedList4.add(56);
		System.out.println("Before deletion: ");
		linkedList4.display();
		linkedList4.popLast();
		System.out.println();
		System.out.println("After deletion: ");
		linkedList4.display();
		System.out.println();

		System.out.println("Searching element 30 from list of element: 56,30,70 ");
		Aftersearch<Integer> linkedList5 = new Aftersearch();
		linkedList5.add(70);
		linkedList5.add(30);
		linkedList5.add(56);
		System.out.println("Displaying the list of elements :");
		linkedList5.display();
		System.out.println();
		System.out.println("Searching element 30 from list...");
		boolean keyFound = linkedList5.search(30);

		if (keyFound) {
			System.out.println("Element 30 exists in list");
		} else {
			System.out.println("Element 30 doesn't exist in list");
		}

		System.out.println();

		System.out.println("Inserting element 40 after 30 into list of elements: 56,30,70");
		Aftersearch<Integer> linkedList6 = new Aftersearch<>();
		linkedList6.add(70);
		linkedList6.add(30);
		linkedList6.add(56);
		System.out.println("Before insertion: ");
		linkedList6.display();
		linkedList6.insert(30, 40);
		System.out.println();
		System.out.println("After insertion: ");
		linkedList6.display();
		System.out.println();

	}

}
