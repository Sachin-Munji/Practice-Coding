package practiceprograms.com.practice;

import java.util.Arrays;

public class TripletsWithSum {

	public static void main(String[] args) {

		int[] numsArr = { 1, 2, 5, 0, -2, -1 };

		/* 
		 * This code is for finding
		 * Triplets
		 * Which sums to zero 
		*/
		
		if (hasTriplets(numsArr, numsArr.length))
			System.out.println("We have triplets!!!!!");
		else
			System.out.println("Sorry we don't have triples");

	}

	private static boolean hasTriplets(int[] numsArr, int length) {

		Arrays.sort(numsArr);

		for (int i = 0; i < length - 2; i++) {

			// To check whether we have same target number
			if (numsArr[i] > 0 && numsArr[i] == numsArr[i + 1]) {
				continue;
			}
			int target = -numsArr[i];
			int lowEnd = i + 1;
			int highEnd = length - 1;

			while (lowEnd < highEnd) {
				if (numsArr[lowEnd] + numsArr[highEnd] == target) {
					return true;
				} else if (numsArr[lowEnd] + numsArr[highEnd] > target) {
					highEnd--;
				} else {
					lowEnd++;
				}
			}
		}
		return false;
	}

}
