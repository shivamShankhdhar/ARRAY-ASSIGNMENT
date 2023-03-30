package java_assignment;
import java.util.Scanner;
public class sum_of_array_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner u_input = new Scanner(System.in);
		System.out.println("How many values you wants to add in array");
		int array_size = u_input.nextInt();
		int[] arr = new int[array_size];
		for (int i =0; i<array_size;i++) {
			System.out.println("Enter " + (i+1) + " Number");
			arr[i] = u_input.nextInt();
		}
//		adding the elements of array
		int sum = 0;
		for(int j:arr) {
			sum = sum+j;
		}
		System.out.println("Sum of array Elements " + sum);
	}

}
