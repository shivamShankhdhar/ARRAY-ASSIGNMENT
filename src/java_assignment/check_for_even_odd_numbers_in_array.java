package java_assignment;

import java.util.Scanner;

public class check_for_even_odd_numbers_in_array {

	public static void main(String[] args) {
		Scanner u_input = new Scanner(System.in);
		System.out.println("How many Elements you wants in array");
		int even_numbers = 0;
		int odd_numbers = 0;
		int arr_size = u_input.nextInt();
		int[] arr = new int[arr_size];
		
		for(int i=0; i<arr_size; i++) {
			System.out.println("Enter value" + (i+1));
			arr[i] = u_input.nextInt();
		}
		for(int i: arr) {
			if(i%2 ==0) {
				even_numbers += 1;
			}
			else{
				odd_numbers += 1;
			}
		}
		System.out.println("Even Numbers in array " + even_numbers);
		System.out.println("Odd Numbers in array " + odd_numbers);
	}

}
