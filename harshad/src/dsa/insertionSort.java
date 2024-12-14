package dsa;

import java.util.*;

public class insertionSort {
	public static void getArray(int arr[], int n) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + (i + 1) + " number : ");
			arr[i] = sc.nextInt();
		}
	}

	// printing array
	public static void printArray(int arr[], int n) {
		for (int i = 1; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void insertionSorting(int arr[], int n) {

		for (int i = 0; i < n - 1; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many elements you want to enter : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		getArray(arr, n);

		System.out.println("\nBefore sorting : ");
		printArray(arr, n);

		System.out.println("\nAfter Sorting : ");
		insertionSorting(arr, n);
		printArray(arr, n);
	}

}
