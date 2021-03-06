import java.util.ArrayList;

public class ArrayListsContinued {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);

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
        int arrayLength = inputArray.size();
		int endLoopIndex = (int) (Math.floor(arrayLength / 2) - 1);

		int indexCache;
		for (int i = 0; i <= endLoopIndex; i++) {
			indexCache = inputArray.get(i);

            inputArray.set(i, inputArray.get(arrayLength - 1 - i));
            inputArray.set(arrayLength - 1 - i, indexCache);
		}

		System.out.println("after problem 1: " + inputArray);
    }

    public static void problem2(ArrayList<Integer> inputArray) {
        int firstIndexCache = inputArray.get(0);

		for (int i = 0; i < inputArray.size() - 1; i++) {
            inputArray.set(i, inputArray.get(i + 1));
		}

        inputArray.set(inputArray.size() - 1, firstIndexCache);

		System.out.println("after problem 2: " + inputArray);
    }

    public static void problem3(ArrayList<Integer> inputArray) {
        int evenNum = 1;
        int oddNum = 0;

        for (Integer number : inputArray) {
            if ((number % 2) == 0) {
                evenNum = (evenNum * number);
            } else {
                oddNum = (oddNum + number);
            }
        }

        System.out.println("The product of all even numbers in the arraylist: " + evenNum);
        System.out.println("THe sum of all odd numbers in the arraylist: " + oddNum);
    }
}
