package java_assignment;

public class linear_search_binary_search {

	public static void main(String[] args) {
		int[] arr = {12, 52, 63, 45, 15, 85, 19};
		int search_for = 2;
		int flag = 0;
		for(int i: arr) {
			if(i == search_for) {
				System.out.println("Element Found");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Element not Found");	
		}
		
	}

}
