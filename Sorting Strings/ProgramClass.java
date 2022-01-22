import java.util.Arrays;

public class ProgramClass {
    public static void program1(String[] inputArray) {
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

    }

    public static void printArray(String[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}

    public static void main(String[] args) {
        String[] array1 = {"Zed", "Yield", "Chicklen", "Noob", "Xavier"}; 
        program1(array1);
    }
}