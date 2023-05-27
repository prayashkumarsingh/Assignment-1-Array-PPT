package in.ineuron.question6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question6 {
	  public static boolean duplicate(int[] nums) {
	        Set<Integer> s = new HashSet<>();
	        for (Integer x: nums) {
	            if (s.contains(x)) {
	                return true;
	            }
	            s.add(x);
	        }
	        return false;
	  }
	    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");  

        int n=sc.nextInt();  

        int[] nums = new int[n];  
        System.out.println("Enter the elements of the array nums: ");  
        for(int i=0; i<n; i++)  
        {  
   
            nums[i]=sc.nextInt();  
        } 
        Arrays.sort(nums);
        System.out.println(duplicate(nums));
		

	}

}
