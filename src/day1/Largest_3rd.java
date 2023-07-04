package day1;

import java.util.Scanner;

//2. You will be given an array and you need to find the third largest 
public class Largest_3rd {

	public static void main(String[] args) {
	
		
		int first = 0 ;
		int second = 0;
		int third = 0;
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Array size : ");

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		

		first = second = third= arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {

			
			if(first<arr[i+1]) { // 10 50
				
				third = second;
				second = first;
				first=arr[i+1];
				
			}
			
		}
		
		

		
		System.out.println("Third Largest No. is "+first +" " +  second +" "+third);

	}

}


// 50 20 70 90 80 20 
// large = 50
// small = 20

