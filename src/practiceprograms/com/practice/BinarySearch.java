package practiceprograms.com.practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		/*
		 * Binary Search to return position at which given number is found
		 */

		int arr[] = { 1, 4, 5, 2, 6, 8, 9 };
		int size = arr.length;
		int num = 5;
		// Need to sort Array before passing it to the method as we split array into two
		// every time
		Arrays.sort(arr);
		int position = findNum(arr, size, num);
		if (position != -1)
			System.out.println("The given number is at " + position + " position(index)");
		else
			System.out.println("The given number is not found!!!");
	}

	private static int findNum(int[] arr, int size, int num) {

		int lowInd = 0;
		int highInd = size - 1;
		int midInd = lowInd + (highInd - lowInd / 2);

		while (lowInd <= highInd) {
			if (arr[midInd] == num) {
				return midInd;
			} else if (arr[midInd] > num) {
				highInd = midInd - 1;
			} else {
				lowInd = lowInd + 1;
			}
			midInd = lowInd + (highInd - lowInd / 2);
		}

		return -1;

	}

}
