import java.util.*;

public class UseLinkList{
	public static void main(String[] args){
		MyLinkedList<Integer> myLList = new MyLinkedList<Integer>();
		myLList.add(10);
		myLList.add(15);
		myLList.add(25);
		System.out.println("Insertion Completed. ");
		System.out.println("Size is " +myLList.size());
		System.out.println("Element at index 1 is :" + myLList.get(1));

		MyLinkedList<String> myLList1 = new MyLinkedList<String>();
		myLList1.add("Shashi");
		myLList1.add("Kajal");
		myLList1.add("Soham");
		System.out.println("Insertion Completed. ");
		System.out.println("Size is " +myLList1.size());
		System.out.println("Element at index 1 is :" + myLList1.get(1));

		for(String str : myLList1){
			System.out.println("Element are :" + str);
		}

		myLList1.set(1,"Kaju");
		System.out.println("Element at index 1 is :" + myLList1.get(1));

		Iterator itr= myLList1.iterator();
		while(itr.hasNext()){
				System.out.println("Count 1" + itr.next());
				itr.remove();
		}
		System.out.println("Size is " +myLList1.size());
	}
}