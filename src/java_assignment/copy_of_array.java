package java_assignment;

public class copy_of_array {

	public static void main(String[] args) {
		int[] arr = {12, 15, 13, 16, 18, 17, 19, 15, 16, 20, 25, 26, 28, 26, 36};
		int[] arr_copied = new int[arr.length];
		for(int i =0; i<arr.length; i++) {
			arr_copied[i] = arr[i];
		}
		System.out.println(" First Array ");
		for (int i =0; i<arr.length; i++) {
			
			System.out.print(" "+ arr[i]);
		}
		System.out.println();
		System.out.println("Second Array");
		
		for (int i =0; i<arr.length; i++) {
			
			System.out.print(" "+ arr_copied[i]);
		}
	}

}
