package in.ineuron.question1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 {

    public static int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        
        Map<Integer, Integer> map = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
           
            if (map.containsKey(nums[i])) {
               
                res[0] = i;
              
                res[1] = map.get(nums[i]);
            }
          
            else {
                
                map.put(target - nums[i], i);
            }
        }
        return res;
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
        System.out.println("Enter the target element ");  
        int target = sc.nextInt();
       int [] res= twoSum( nums, target);
       System.out.println("Indexes are");
       for (int element: res) {
        System.out.println(element);
         }
       

    }
}
