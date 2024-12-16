package set;

import java.util.*;

public class Set_containing_list_type_String {
	public static void main(String[] args) {
		
		List<String> mylist = new ArrayList<String>();
		mylist.add("Sahil");
		mylist.add("akash");
		mylist.add("shub");
		mylist.add("samir");
		System.out.println("Original list ");
		Iterator<String> itr = mylist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.reverse(mylist);
		System.out.println(" ");
		System.out.println("reversed list ");
		Iterator<String> itr1 = mylist.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
