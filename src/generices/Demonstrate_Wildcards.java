package generices;

import java.util.*;

public class Demonstrate_Wildcards {
	private static double sum(List<? extends Number> list)

	{
		double sum = 0.0;
		for (Number i : list) {
			sum = sum + i.doubleValue();
		}
		return sum;
	}

	private static void show(List<? super Integer> list) {
		list.forEach((x) -> {

			System.out.print(x + " ");

		});

	}

	public static void main(String[] args)

	{
		System.out.println("Upper Bounded : ");
		List<Integer> list1 = Arrays.asList(4, 2, 7, 5, 1, 9);
		System.out.println("List 1 Sum : " + sum(list1));
		List<Double> list2 = Arrays.asList(4.7, 2.4, 7.3, 5.4, 1.5, 9.2);
		System.out.println("List 2 Sum : " + sum(list2));
		System.out.println("\nLower Bounded : ");
		List<Integer> list3 = Arrays.asList(4, 2, 7, 5, 1, 9);
		System.out.println("Only Classes With Integer Superclass will be Accepted : ");
		show(list3);
	}
}
