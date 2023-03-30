package java_assignment;
import java.util.Scanner;
public class reverse_array {

	public static void main(String[] args) {
		
		Scanner u_input = new Scanner(System.in);
		System.out.println("How many Elements you wants in array");
		int arr_size = u_input.nextInt();
		int[] arr = new int[arr_size];
		
		for(int i=0; i<arr_size; i++) {
			System.out.println("Enter value" + (i+1));
			arr[i] = u_input.nextInt();
		}
//		array created
//		now reverse logic
		int[] reversed_arr = new int[arr_size];
		for(int i=0; i<arr_size; i++) {
			reversed_arr[arr_size-i-1] = arr[i];
		}
		for(int i:arr) {
			System.out.print(" " + i);
		}
		System.out.println();
		for(int i:reversed_arr) {
			System.out.print(" " + i);
		}
	}

}
