package java_assignment;

public class max_min_value {

	public static void main(String[] args) {
//		logic for max and min value is ---->>>
//		- first sort the array in increasing order
//		- FIRST value = MINIMUM
//		- LAST value = MAXIMUM
//		-----------------------------------
		int[] arr = {20,12,30,45,10,96,50,17,35};
		
//		sorting the array with BUBBLE SORT 
		
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Minimum Value  = "+ arr[0]);
		System.out.println("Maximum Value  = "+ arr[arr.length-1]);
	}
}
