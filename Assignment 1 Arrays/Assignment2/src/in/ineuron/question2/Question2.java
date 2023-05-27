package in.ineuron.question2;
import java. util. Scanner;

import java.util.Arrays;

public class Question2 {
    public static int removeVal(int[] nums, int val) {
        
        int count = 0;
       
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
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
        //Arrays.sort(nums);
        System.out.println("Enter the Value to remove ");  
        int val = sc.nextInt();
       removeVal( nums, val);
       System.out.println(" After Removed val");
       for (int element: nums) {
        System.out.println(element);
        }
       

    }
    
}

