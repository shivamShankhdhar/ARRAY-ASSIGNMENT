package java_assignment;

public class equality_of_two_arrays {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {10,20,80,40,50};
		int flag = 1;
		for (int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				flag = 0;
				System.out.println("Arrays are not same");
				break;
			}
		}
		if(flag == 1) {
			System.out.println("Arrays are same");
		}
	}

}
