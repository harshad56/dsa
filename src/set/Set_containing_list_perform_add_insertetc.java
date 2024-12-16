package set;

import java.util.*;

public class Set_containing_list_perform_add_insertetc {
	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(69);
		s.add(57);
		s.add(10);
		s.add(18);
		s.add(90);
		s.add(151);
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(70);
		s1.add(35);
		s.addAll(s1);
		System.out.println("Set1: " + s);
		System.out.println("Set2: " + s1);
		System.out.println();
		System.out.println("After Adding set2 into set1: " + s);
		s.remove(10);
		s.remove(18);
		System.out.println("Set after removing elements: " + s);
		System.out.println();
		System.out.println("Does the Set contains: 57? " + s.contains(57));
		System.out.println("Does the Set contains: 18? " + s.contains(18));
	}
}
