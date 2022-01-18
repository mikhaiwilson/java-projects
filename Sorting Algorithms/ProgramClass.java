import java.util.Arrays;

public class ProgramClass {
    public static void program1(int[] inputArray) {
        // bubble sort

        for (int a = 0; a < inputArray.length; a++) {
            for (int b = 0; b < inputArray.length - 1; b++) {
                if (inputArray[b] > inputArray[b + 1]) {
                    int valueCache = inputArray[b + 1];
                    inputArray[b + 1] = inputArray[b];
                    inputArray[b] = valueCache;
                }
            }
        }

        printArray(inputArray);
    }

    public static void program2(int[] inputArray) {
        // selection sort
    }

    public static void program3(int[] inputArray) {
        // insertion sort
    }

    public static void printArray(int[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

    public static void main(String[] args) {
        int[] array1 = {4, 451, 2, 123, 511, 120}; 
        program1(array1);
    }
}
