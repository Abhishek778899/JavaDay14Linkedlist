package Linkedlist.Link;

public class Deletelinkdedlist {

	public static void main(String[] args) {

		System.out.println("Welcome to the Linked List Program");

		System.out.println("Adding elements 70,30,56 to Linked List :");
		Deletelinkdedlist linkedList = new Deletelinkdedlist();
		linkedList.add(70);
		linkedList.add(30);
		linkedList.add(56);
		System.out.println("Displaying the list of elements :");
		linkedList.display();
		System.out.println();

		System.out.println("Appending elements 56,30,70 to Linked List :");
		Deletelinkdedlist linkedList1 = new Deletelinkdedlistt();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);
		System.out.println("Displaying the list of elements :");
		linkedList1.display();
		System.out.println();

		System.out.println("Inserting 30 between 56 and 70 element into list:");
		Deletelinkdedlist linkedList2 = new Deletelinkdedlist();
		linkedList2.add(70);
		linkedList2.add(56);
		System.out.println("Before insertion: ");
		linkedList2.display();
		linkedList2.insert(56, 30);
		System.out.println();
		System.out.println("After insertion: ");
		linkedList2.display();
		System.out.println();

		System.out.println("Deleting first node 56 from list of elements: 56,30,70 ");
		Deletelinkdedlist linkedList3 = new Deletelinkdedlist();
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

	}

}