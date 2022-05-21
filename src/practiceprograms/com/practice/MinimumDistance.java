package practiceprograms.com.practice;

public class MinimumDistance {

	public static void main(String[] args) {
		/*
		 * This logic is to find minimum distance between two given numbers in an array
		 * provided traverses both ways
		 */

		int arr[] = { 3, 5, 6, 1, 9, 3, 5, 6, 2, 6, 3 };
		int x = 3, y = 6;
		System.out.println(
				"The minimum distance between " + x + " and " + y + " is " + minDistance(arr, arr.length, x, y));

	}

	public static int minDistance(int arr[], int n, int x, int y) {
		int distance = Integer.MAX_VALUE, foundIndex = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x || arr[i] == y) {
				if (foundIndex != -1 && arr[foundIndex] != arr[i]) {
					distance = Math.min(distance, i - foundIndex);
				}
				foundIndex = i;
			}
		}
		return distance == Integer.MAX_VALUE ? -1 : distance;
	}

}
