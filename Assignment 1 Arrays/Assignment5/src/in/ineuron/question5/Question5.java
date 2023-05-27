package in.ineuron.question5;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
	 public static void mergeArrays(int[] nums1, int[] nums2, int n1, int n2, int[] nums3){
	        int i = 0; 
	        int j = 0; 
	        int k = 0; 
	         
	       
	        while(i < n1){  
	        	nums3[k++] = nums1[i++];  
	        }   
	        while(j < n2){  
	            nums3[k++] = nums2[j++];  
	        }  
	         
	       
	        Arrays.sort(nums3);  
	    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in nums1: ");  

        int n=sc.nextInt();  

        int[] nums1 = new int[n];  
        System.out.println("Enter the elements of the array nums1: ");  
        for(int i=0; i<n; i++)  
        {  
   
            nums1[i]=sc.nextInt();  
        } 
        int n1 = nums1.length;
        
        System.out.print("Enter the number of elements you want to store in nums2: ");  

        int nn=sc.nextInt();  

        int[] nums2 = new int[nn];  
        System.out.println("Enter the elements of the array nums2: ");  
        for(int i=0; i<n; i++)  
        {  
   
            nums2[i]=sc.nextInt();  
        } 
        int n2 = nums2.length;
 
        int nums3[] = new int[n1 + n2];
        mergeArrays(nums1, nums2, n1, n2, nums3);
 
        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(nums3[i] + " ");

	}

}
