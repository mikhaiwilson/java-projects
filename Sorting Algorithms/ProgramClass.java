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

        int unsortedIndexStart = 0;
        int lowestIndex = 0;

        for (int a = 0; a < inputArray.length; a++) {
            for (int i = unsortedIndexStart; i < inputArray.length; i++) {
                if (inputArray[i] < inputArray[lowestIndex]) {
                    lowestIndex = i;
                }
            }

            int unsortedIndexStartCache = inputArray[unsortedIndexStart];

            inputArray[unsortedIndexStart] = inputArray[lowestIndex];
            inputArray[lowestIndex] = unsortedIndexStartCache;

            unsortedIndexStart = unsortedIndexStart + 1;
            lowestIndex = unsortedIndexStart;
        }

        printArray(inputArray);
    }

    public static void program3(int[] inputArray) {
        // insertion sort
    }

    public static void printArray(int[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

    public static void main(String[] args) {
        // int[] array1 = {4, 451, 2, 123, 511, 120}; 
        // program1(array1);

        int[] array2 = {14, 12, 10, 7, 5, 4, 2};
        program2(array2);
    }
}
