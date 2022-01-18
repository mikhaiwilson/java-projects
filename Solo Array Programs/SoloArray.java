import java.util.Arrays;
public class SoloArray {

	
	public static void main(String[] args) {
		int myArray01[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int myArray02[] = new int [11];
		
		for (int i = 0; i < myArray01.length; i++) {
			myArray02[i] = myArray01[myArray01.length - i - 1];
		}
		
		System.out.println("Array02: " + Arrays.toString(myArray02));
		
		int myArray03[] = {0, 1, 2, 4, 5};
		
		for (int i = 0; i < myArray03.length; i = i + 1) {
			myArray03[i] = ((i * 5) + 1);
		}
		
		System.out.println("Array03: " + Arrays.toString(myArray03));
	}
}