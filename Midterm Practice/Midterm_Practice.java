public class Midterm_Practice {
    public static void problemOne() {
        System.out.println("problem 1:");

        int numberArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numberArray.length; i++) {
            int remainder = (numberArray[i] % 2);
            String evenString;

            if (remainder == 0) {
                evenString = "even";
            } else {
                evenString = "odd";
            }

            String str = numberArray[i] + " - " + evenString;

            System.out.println(str);
        }
    }

    public static void problemTwo() {
        System.out.println("\nproblem 2:");

        int problemTwoArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int arrayHalfPoint = (problemTwoArray.length / 2);
        int arraySum = 0;
        int arrayProduct = 1;

        for (int i = 0; i <= arrayHalfPoint; i++) {
            arraySum = (arraySum + problemTwoArray[i]);
        }
        System.out.println("Sum of the first half of array: " + arraySum);

        for (int i = arrayHalfPoint; i < problemTwoArray.length; i++) {
            arrayProduct = (arrayProduct * problemTwoArray[i]);
        }
        System.out.println("Product of the second half of array: " + arrayProduct);
    }

    public static void problemThree() {
        System.out.println("\nproblem 3:");

        String originalString = "Chicken finger";

        for (int i = originalString.length(); i >= 1; i--) {
            System.out.print(originalString.substring(i - 1, i));
        }
    }

    private static void replaceIfSmaller(String[] array, int currentIndex) {
        int previousIndex = (currentIndex - 1);

        String previousIndexValue = array[previousIndex];
        String currentIndexValue = array[currentIndex];

        if ((array[currentIndex].length()) < (array[previousIndex].length())) {
            array[previousIndex] = currentIndexValue;
            array[currentIndex] = previousIndexValue;
        }
    }

    public static void extraCredit() {
        System.out.println("\nextra credit:");

        String array1[] = {"Hello", "my", "name", "is", "Astroboy"};
        String array2[] = array1;
        
        for (int a = 1; a < array2.length; a++) { // this second loop took me the longest to think about until i actually visualized it. pseudocode really helps
            for (int i = 1; i < array2.length; i++) {
                replaceIfSmaller(array2, i);
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(" " + array2[i]);
        }
    }

    public static void main(String args[]) {
        problemOne();
        problemTwo();
        problemThree();
        extraCredit();
    }
} 