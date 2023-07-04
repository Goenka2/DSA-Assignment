package day1;

//1. Write a Java program to find the index of an array element.

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Array size : ");

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the Element to Search the index : ");
		int elem = sc.nextInt();
		int index = 0;

		for (int i = 0; i < arr.length; i++) {

			if(arr[i] == elem) {
				
				index = i;
				break;
				
			}
		}
		
		System.out.println("Index of "+elem+" is : "+index);

	}

}
