package dsa;

import java.util.*;

public class selectionSort {

	public static void getArray(int arr[], int n) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			System.out.print("Enter " + (i + 1) + " number : ");
			arr[i] = sc.nextInt();
		}
	}

	public static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void selectionSorting(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
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
		selectionSorting(arr, n);
		printArray(arr, n);
	}
}
