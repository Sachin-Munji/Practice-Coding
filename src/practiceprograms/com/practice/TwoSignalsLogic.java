package practiceprograms.com.practice;

public class TwoSignalsLogic {

	public static void main(String[] args) {
		
		int[] sig1 = {1,2,3,3,3,5,4};
		int[] sig2 = {1,2,3,4,3,5,4};
		
		printNoOfTimesUpdated(sig1, sig2);
		
	}

	private static void printNoOfTimesUpdated(int[] sig1, int[] sig2) {

		int minFreqVal = 0;
		int updateCount = 0;

		int minLengthVal = Math.min(sig1.length, sig2.length);

		for (int i = 0; i < minLengthVal; i++) {
			if (sig1[i] == sig2[i] && sig1[i] > minFreqVal) {
				updateCount++;
				minFreqVal = sig1[i];
			}
		}
		System.out.println(updateCount);
	}

}
