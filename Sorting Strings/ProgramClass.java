import java.util.Arrays;

public class ProgramClass {
    public static void program1(String[] inputArray) {
        // bubble sort
        
        for (int a = 0; a < inputArray.length; a++) {
            for (int b = 0; b < inputArray.length - 1; b++) {
                if (inputArray[b].compareTo(inputArray[b + 1]) > 0) {
                    String valueCache = inputArray[b + 1];
                    inputArray[b + 1] = inputArray[b];
                    inputArray[b] = valueCache;
                }
            }
        }

        printArray(inputArray);
    }

    public static void program2(String[] inputArray) {
        // selection sort

        int unsortedIndexStart = 0;
        int lowestIndex = 0;

        for (int a = 0; a < inputArray.length; a++) {
            for (int b = unsortedIndexStart; b < inputArray.length; b++) {
                if (inputArray[b].compareTo(inputArray[lowestIndex]) > 0) {
                    lowestIndex = b;
                }
            }

            String unsortedIndexStartCache = inputArray[unsortedIndexStart];

            inputArray[unsortedIndexStart] = inputArray[lowestIndex];
            inputArray[lowestIndex] = unsortedIndexStartCache;

            unsortedIndexStart = unsortedIndexStart + 1;
            lowestIndex = unsortedIndexStart;
        }

        printArray(inputArray);
    }

    public static void printArray(String[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

    public static void main(String[] args) {
        String[] array1 = {"Zed", "Yield", "Chicklen", "Noob", "Xavier"}; 
        program1(array1);

        String[] array2 = {"Zed", "Yield", "Chicklen", "Noob", "Xavier"}; 
        program2(array2);
    }
}