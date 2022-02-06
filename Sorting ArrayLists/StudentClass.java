import java.util.ArrayList;

public class StudentClass {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(3);
        array.add(5);
        array.add(123);
        array.add(23);
        array.add(33);
        array.add(41);
        array.add(912);

        System.out.println("before: " + array);
        problem1(array);

        System.out.println();

        System.out.println("before: " + array);
        problem2(array);

        System.out.println();

        System.out.println("before: " + array);
        problem3(array);
    }

    public static void problem1(ArrayList<Integer> inputArray) {
        // bubble sort

        for (int a = 0; a < inputArray.size(); a++) {
            for (int b = 0; b < inputArray.size() - 1; b++) {
                if (inputArray.get(b) > inputArray.get(b + 1)) {
                    int valueCache = inputArray.get(b + 1);

                    inputArray.set(b + 1, inputArray.get(b));
                    inputArray.set(b, valueCache);
                }
            }
        }

        System.out.println(inputArray);
    }

    public static void problem2(ArrayList<Integer> inputArray) {
        // selection sort

        int unsortedIndexStart = 0;
        int lowestIndex = 0;

        for (int a = 0; a < inputArray.size(); a++) {
            for (int b = unsortedIndexStart; b < inputArray.size(); b++) {
                if (inputArray.get(b) < inputArray.get(lowestIndex)) {
                    lowestIndex = b;
                }
            }

            int unsortedIndexStartCache = inputArray.get(unsortedIndexStart);

            inputArray.set(unsortedIndexStart, inputArray.get(lowestIndex));
            inputArray.set(lowestIndex, unsortedIndexStartCache);

            unsortedIndexStart = unsortedIndexStart + 1;
            lowestIndex = unsortedIndexStart;
        }

        System.out.println(inputArray);
    }

    public static void problem3(ArrayList<Integer> inputArray) {
        // insertion sort
       
        for (int currentPointer = 1; currentPointer < inputArray.size(); currentPointer++) {
            int insertIndex = -1;
            for (int possibleIndex = currentPointer - 1; possibleIndex >= 0; possibleIndex--) {
                if (inputArray.get(currentPointer) < inputArray.get(possibleIndex)) {
                    insertIndex = possibleIndex;
                }
            }
            
            if (insertIndex > -1) {
                for (int i = currentPointer - 1; i >= insertIndex; i--) { 
                    int previousIndexCache = inputArray.get(i);
                   
                    inputArray.set(i, inputArray.get(i + 1));

                    inputArray.set(i + 1, previousIndexCache);
                }
            }
        }

        System.out.println(inputArray);
    }

}