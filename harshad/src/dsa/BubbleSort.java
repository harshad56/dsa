package dsa;

import java.util.*;

public class BubbleSort {
	// print arr
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter numbers of elements you want insert : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array before sorting :");
		display(arr);

		// bubble Sort
		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("\nArray after sorting :");
		display(arr);
	}
}
