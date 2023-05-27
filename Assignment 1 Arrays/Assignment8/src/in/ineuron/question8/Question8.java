package in.ineuron.question8;

import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
	public static int[] findNums(int[] nums) {
		int N = nums.length, sum = N * (N + 1) / 2;
		int[] ans = new int[2];
		boolean[] bool = new boolean[N + 1];
		for (int num : nums) {
			sum -= num;
			if (bool[num])
				ans[0] = num;
			bool[num] = true;
		}
		ans[1] = sum + ans[0];
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");

		int n = sc.nextInt();

		int[] nums = new int[n];
		System.out.println("Enter the elements of the array nums: ");
		for (int i = 0; i < n; i++) {

			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);

		int[] ans = findNums(nums);
		System.out.println("Indexes are");
		for (int element : ans) {
			System.out.println(element);
		}
	}

}
