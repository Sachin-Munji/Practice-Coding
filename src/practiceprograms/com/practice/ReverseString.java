package practiceprograms.com.practice;



public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using String Builder
		String str = "abcdef";
		StringBuilder revStr = new StringBuilder();
		revStr.append(str);
		StringBuilder reverseString = revStr.reverse();
		System.out.println(reverseString);
		
		//Without using any functions
		String strNew = "abcdefgh";
		char[] strArr = strNew.toCharArray();
		for(int i = strArr.length-1 ; i>=0 ; i--) {
			System.out.print(strArr[i]);
		}

	}

}
