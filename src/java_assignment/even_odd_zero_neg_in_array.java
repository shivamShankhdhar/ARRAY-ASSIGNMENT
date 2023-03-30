package java_assignment;
import java.util.Scanner;
public class even_odd_zero_neg_in_array {

	public static void main(String[] args) {
		Scanner u_input = new Scanner(System.in);
		System.out.println("How Many Elements you wants in array");
		int arr_size = u_input.nextInt();
		int even = 0;
		int odd = 0;
		int zero = 0;
		int positive = 0;
		int negative = 0;
		int[] arr = new int[arr_size];
		for (int i=0; i<arr_size; i++) {
			System.out.println("Enter number " + (i+1));
			arr[i] = u_input.nextInt();	
			if(arr[i]>0) {
				positive += 1;
				if(arr[i] % 2==0) {
					even += 1;
				}
				else {
					odd += 1;
				}
			}
			else if(arr[i] == 0) {
				zero += 1;
			}
			else {
				negative += 1;
				if(arr[i] % 2==0) {
					even += 1;
				}
				else {
					odd += 1;
				}
			}
		}
		System.out.println("Positive Count " + positive);
		System.out.println("Negative Count(s) " + negative);
		System.out.println("zero Count " + zero);
		System.out.println("Even Count " + even);
		System.out.println("Odd Count " + odd);
	}
}
