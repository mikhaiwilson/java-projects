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
            for (int b = unsortedIndexStart; b < inputArray.length; b++) {
                if (inputArray[b] < inputArray[lowestIndex]) {
                    lowestIndex = b;
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
       
        for (int currentPointer = 1; currentPointer < inputArray.length; currentPointer++) {
            // find value to the left that is smaller
            int insertIndex = -1;
            for (int possibleIndex = currentPointer - 1; possibleIndex >= 0; possibleIndex--) {
                if (inputArray[currentPointer] < inputArray[possibleIndex]) {
                    insertIndex = possibleIndex;
                }
            }
            
            if (insertIndex > -1) { // replacing everything beforehand
                for (int i = currentPointer - 1; i >= insertIndex; i--) { 
                    int previousIndexCache = inputArray[i];
                   
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = previousIndexCache;
                }
            }
        }

        printArray(inputArray);
    }

    public static void printArray(int[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

    public static void main(String[] args) {
        int[] array1 = {4, 451, 2, 123, 511, 120}; 
        program1(array1);

        int[] array2 = {14, 12, 10, 7, 5, 4, 2, 12931923, 2, 2, 1423012301, 129, 1238};
        program2(array2);

        int[] array3 = {5, 4, 3, 9, 129, 20302, 1123, 14, 999, 777};
        program3(array3);
    }
}
