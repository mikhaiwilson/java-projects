public class Program4 {
    public static void programNum1(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = (sum + i);
        }
        System.out.println(sum);
    }

    public static void programNum2(int[] array) {
        int smallestNumber = Integer.MAX_VALUE;
        int currentIndex = 0;
        for (int i: array) {
            if (i < smallestNumber) {
                smallestNumber = i;
            }
            currentIndex = (currentIndex + 1);
        }
        System.out.println("The array's smallest number is " + smallestNumber);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        programNum1(array1);

        int[] array2 = {41, 192391, 129, 20201, 29};
        programNum2(array2);
    }
}