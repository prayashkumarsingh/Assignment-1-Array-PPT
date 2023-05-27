package in.ineuron.question7;

import java.util.*;

public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store in A1: ");

		int nn = sc.nextInt();

		int[] A1 = new int[nn];
		System.out.println("Enter the elements of the array A1: ");
		for (int i = 0; i < nn; i++) {

			A1[i] = sc.nextInt();
		}
		int n = A1.length;
		int[] A2 = new int[n];
		int j = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (A1[i] != 0) {
				A2[j] = A1[i];
				j++;
			} else {
				count++;
			}
		}
		while (count > 0) {
			A2[j] = 0;
			count--;
			j++;
		}
		for (int i = 0; i < n; i++) {
			A1[i] = A2[i];
		}

		for (int i = 0; i < n; i++) {
			System.out.print(A1[i] + " ");
		}
	}
}
