package practice.daily.com;

public class Day2RemoveElement {

	public static void main(String[] args) {
		System.out.println(removeElement(new int[] { 1, 2, 2, 2, 3, 3, 4, 4 }, 3));

	}
	
    public static int removeElement(int[] nums, int val) {
        int j = 0 ;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }
        return j;
    }

}
