//https://www.javatpoint.com/binary-search-in-java
package com.practice.searchingnsorting;

public class BinarySearchRecurssive {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int elementToSearch = 232;
		int last = arr.length - 1;
		System.out.println("last : " + last);
		int x = binarySearch(arr, 0, last, elementToSearch);
		if (x == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at position : " + x);
		}
	}

	public static int binarySearch(int arr[], int first, int last,
			int elementToSearch) {
		if (last > first) {
			int middleElement = first + (last - first) / 2;
			if(elementToSearch == arr[middleElement])
				return middleElement;				   
			System.out.println("Mid ele " + middleElement);
			if (arr[middleElement] > elementToSearch) {
				return binarySearch(arr, 1, middleElement, elementToSearch);
			} else {
				return binarySearch(arr, middleElement + 1, last,
						elementToSearch);
			}
		}
		return -1;
	}
}
