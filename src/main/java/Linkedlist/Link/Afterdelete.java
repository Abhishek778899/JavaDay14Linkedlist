package Linkedlist.Link;

public class Afterdelete {

	public static void main(String[] args) {

		System.out.println("Welcome to the Linked List Program");

		System.out.println("UC1 to UC2: Adding elements 70,30,56 to Linked List :");
		Afterdelete<Integer> linkedList = new Afterdelete();
		linkedList.add(70);
		linkedList.add(30);
		linkedList.add(56);
		System.out.println("Displaying the list of elements :");
		linkedList.display();
		System.out.println();

		System.out.println("UC3: Appending elements 56,30,70 to Linked List :");
		Afterdelete<Integer> linkedList1 = new Afterdelete();
		linkedList1.append(56);
		linkedList1.append(30);
		linkedList1.append(70);
		System.out.println("Displaying the list of elements :");
		linkedList1.display();
		System.out.println();

		System.out.println("UC4: Inserting 30 between 56 and 70 element into list:");
		Afterdelete<Integer> linkedList2 = new Afterdelete<>();
		linkedList2.add(70);
		linkedList2.add(56);
		System.out.println("Before insertion: ");
		linkedList2.display();
		linkedList2.insert(56, 30);
		System.out.println();
		System.out.println("After insertion: ");
		linkedList2.display();
		System.out.println();

		System.out.println("UC5: Deleting first element 56 from list of elements: 56,30,70 ");
		Afterdelete<Integer> linkedList3 = new Afterdelete<>();
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

		System.out.println("UC6: Deleting last element 70 from list of elements: 56,30,70 ");
		Afterdelete<Integer> linkedList4 = new Afterdelete<>();
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

		System.out.println("UC7: Searching element 30 from list of element: 56,30,70 ");
		Afterdelete<Integer> linkedList5 = new Afterdelete();
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

		System.out.println("UC8 to UC9:");
		System.out.println("UC8 :Inserting element 40 after 30 into list of elements: 56,30,70");
		Afterdelete<Integer> linkedList6 = new Afterdelete<>();
		linkedList6.add(70);
		linkedList6.add(30);
		linkedList6.add(56);
		System.out.println("Before insertion: ");
		linkedList6.display();
		System.out.println();
		System.out.println("Searching element 30 from list...");
		keyFound = linkedList6.search(30);

		if (keyFound) {
			System.out.println("Element 30 exists in list");
		} else {
			System.out.println("Element 30 doesn't exist in list");
		}

		linkedList6.insert(30, 40);
		System.out.println();
		System.out.println("After insertion: ");
		linkedList6.display();
		System.out.println();

		System.out.println("UC9: Searching element 40 and removing 40 from list:");
		System.out.println("UC9: Searching element 40 list...");
		keyFound = linkedList6.search(40);

		if (keyFound) {
			System.out.println("Element 40 exists in list");
		} else {
			System.out.println("Element 40 doesn't exist in list");
		}

		System.out.println("Removing element 40 from list...");
		linkedList6.deleteElement(40);
		linkedList6.display();
		System.out.println();
		System.out.println("UC9: Size of linked list: " + linkedList6.size());

	}

}