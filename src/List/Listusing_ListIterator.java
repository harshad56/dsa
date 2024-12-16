package List;

import java.util.*;

public class Listusing_ListIterator {
	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		mylist.add("harshad");
		mylist.add("aniket");
		mylist.add("yash");
		mylist.add("Sahil");
		mylist.add("omkar");
		System.out.println("Traversing through iterator");
		System.out.println("Original List:");
		Iterator itr = mylist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.reverse(mylist);
		System.out.println(); // space between two lines
		System.out.println("Reversed List:");
		Iterator itr1 = mylist.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
