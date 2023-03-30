package java_assignment;

import java.util.Scanner;

public class average_of_array_elements {

	public static void main(String[] args) {
		Scanner u_input = new Scanner(System.in);
		System.out.println("How many values you wants to add in array");
		int array_size = u_input.nextInt();
		int[] arr = new int[array_size];
		for (int i =0; i<array_size;i++) {
			System.out.println("Enter " + (i+1) + " Number");
			arr[i] = u_input.nextInt();
		}
		int sum = 0;
		int avg = 0;
		for(int j:arr) {
			sum = sum+j;
		}
		avg = sum / arr.length;
		System.out.println("Average of array elements is " + avg);

	}

}
