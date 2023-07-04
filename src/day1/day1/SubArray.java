package day1;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] Args) {

		int size = 1;
		/*
		 * 3. You are given array consisting of n integers. Your task is to find the
		 * maximum length of an increasing subarray of the given array.
		 * 
		 * A subarray is the sequence of consecutive elements of the array. Subarray is
		 * called increasing if each element of this subarray strictly greater than
		 * previous. i/p-5 1 7 2 11 15 o/p -3
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Array size : ");

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (count > size) {
				size = count;
			}
			count = 1;

			for (int j = i; j < arr.length - 1; j++) {

				if (arr[j] < arr[j + 1]) {

					count++;
				} else {
					break;
				}

			}

		}

		System.out.println("the size of sub array is : " + size);

	}

}
