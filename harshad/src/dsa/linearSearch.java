package dsa;

import java.util.Scanner;

public class linearSearch {
	public static int searching(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] array = new int[n];

		System.out.println("\nEnter the elements of the array:");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		System.out.print("\nEnter the element to search for: ");
		int key = sc.nextInt();

		int result = searching(array, key);

		if (result == -1) {
			System.out.println("\nElement not found in the array.");
		} else {
			System.out.println("\nElement found at index: " + result);
		}
	}
}
