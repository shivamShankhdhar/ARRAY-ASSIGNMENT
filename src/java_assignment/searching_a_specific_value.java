package java_assignment;
import java.util.Random;   
public class searching_a_specific_value {

	public static void main(String[] args) {
		int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65,  70, 75, 80, 85, 90, 95,  100};
		Random random = new Random();   
		int x = random.nextInt(100); 
		int flag = 0;
		for (int i:arr) {
			if(i == x) {
				System.out.println("Number " + x + " found in the array");
				flag +=1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Number " + x + " not found in the array");
		}
	}

}
