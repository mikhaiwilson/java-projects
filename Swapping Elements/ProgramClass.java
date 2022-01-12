import java.util.Arrays;

public class ProgramClass {
	public static void printArray(int[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

	public static void reverseArray(int[] inputArray) {
		int arrayLength = inputArray.length;
		int endLoopIndex = (int) (Math.floor(arrayLength / 2) - 1); // tell me if you found anyone who did this.. big brain 
		
		// System.out.println("middle value index: " + endLoopIndex + " value: " + inputArray[endLoopIndex]);

		int indexCache;
		for (int i = 0; i <= endLoopIndex; i++) {
			indexCache = inputArray[i];

			inputArray[i] = inputArray[arrayLength - 1 - i]; // sets value on the left side of the midline to its corresponding value on the right side of the midline
			inputArray[arrayLength - 1 - i] = indexCache; // sets value on the right side of the midline to its corresponding value on the left side of the midline
		}

		printArray(inputArray);
	}

	public static void reorderArray(int[] inputArray) {
		int firstIndexCache = inputArray[0];

		for (int i = 0; i < inputArray.length - 1; i++) {
			inputArray[i] =  inputArray[i + 1];
		}

		inputArray[inputArray.length - 1] = firstIndexCache;

		printArray(inputArray);
	}

    public static void main(String[] args) {
		int[] array1 = {2, 3, 5, 6, 8, 10}; // becomes 10, 8, 6, 5, 3, 2
		int[] array2 = {2, 4, 5, 7, 10, 12, 14}; // becomes 14, 12, 10, 7, 5, 4, 2

		reverseArray(array1);
		reverseArray(array2);

		int[] array3 = {2, 3, 5, 6, 8, 10}; // becomes 3, 5, 6, 8, 10, 2

		reorderArray(array3);
    }
}