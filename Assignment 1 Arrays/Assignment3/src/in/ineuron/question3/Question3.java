package in.ineuron.question3;

import java.io.*;
import java.util.Scanner;

class Question3 {

	static int find_index(int[] nums, int n, int K) {

		for (int i = 0; i < n; i++)

			if (nums[i] == K)
				return i;

			else if (nums[i] > K)
				return i;

		return n;
	}


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements you want to store: ");  

	        int c=sc.nextInt();  

	        int[] nums = new int[c];  
	        System.out.println("Enter the elements of the array nums: ");  
	        for(int i=0; i<c; i++)  
	        {  
	   
	            nums[i]=sc.nextInt();  
	        } 
	        
	        System.out.println("Enter the  Target Value ");  
	        int K = sc.nextInt();
	        int n= nums.length;

		System.out.println("The Index of Target Value is or will be  "+  find_index(nums, n, K));
	}
}
