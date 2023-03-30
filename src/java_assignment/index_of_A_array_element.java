package java_assignment;

public class index_of_A_array_element {

	public static void main(String[] args) {
		int[] arr = {12, 15, 16, 14, 17, 18, 19, 20};
		int ele = 20;
		int flag =0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				System.out.println("Index number of " + ele + " is " + i);
				flag +=1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Number " + ele + " not in the array");
		}

	}

}
