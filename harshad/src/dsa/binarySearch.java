package dsa;

import java.util.*;

public class binarySearch {
	public static int searching(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input array size
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		// Input array elements
		System.out.println("\nEnter " + n + " sorted elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Input target element to search for
		System.out.print("\nEnter the element to search for: ");
		int target = sc.nextInt();

		// Sort array (optional if array is guaranteed sorted by user)
		Arrays.sort(arr);

		// Perform binary search
		int result = searching(arr, target);

		// Output the result
		if (result == -1) {
			System.out.println("\nElement not present in array");
		} else {
			System.out.println("\nElement found at index " + result);
		}
	}
}
