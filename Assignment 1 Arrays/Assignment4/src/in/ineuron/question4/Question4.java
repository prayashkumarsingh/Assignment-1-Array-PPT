package in.ineuron.question4;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
	public static int[] addOne(int[] arr) {

        int i = arr.length - 1;

        while (i >=0 && arr[i] == 9) {
            i --;
        }
        

        if (i == -1) {
            int[] res = new int[arr.length + 1];
            res[0] = 1;
            return res;
        }
        

        int[] res = new int[arr.length];
        
        res[i] = arr[i] + 1;
        for (int j = 0; j < i; j ++) {
        	res[j] = arr[j];
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
       
       int [] res= addOne( nums);
       System.out.println("Indexes are");
       for (int element: res) {
        System.out.println(element);
         }
		

	}

}
