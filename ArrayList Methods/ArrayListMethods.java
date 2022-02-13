import java.util.ArrayList;

public class ArrayListMethods {
    // make sure that main class is first
    // make sure that printing is done in the main method

    public static void main(String[] args) {
        // System.out.println("program 1:");
        // int array[] = {1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7};
        // printArray(array);
        // array = program1(array);
        // printArray(array);

        System.out.println("\nprogram 2:");
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
 
        System.out.println(arrayList);
        program2(arrayList);
        System.out.println(arrayList);
        
    } 

    public static void printArray(int[] inputArray) {
        System.out.print("[");
        for (int index = 0; index < inputArray.length; index++) {
            if (index == (inputArray.length - 1)) {
                System.out.print(inputArray[index]);
            } else {
                System.out.print(inputArray[index] + ", ");
            }
            
        }
        System.out.print("]\n");
    }

    public static void program1(Integer[] inputArray) {
        int alreadyExists[] = new int [inputArray.length];
        // ArrayList<Integer> preReturnArrayList = new ArrayList<>();

        for (int index = 0; index < inputArray.length; index++) {
            if (!(alreadyExists[inputArray[index]] == -1)) {
                alreadyExists[inputArray[index]] = -1; 
            } else {
                inputArray[index] = null;

                // move everything in list down by one?
            }   
        }
    }

    public static void program2(ArrayList<Integer> inputArray) {
        int alreadyExists[] = new int [inputArray.size()];

        for (int index = 0; index < inputArray.size(); index++) {
            if (alreadyExists[ inputArray.get(index) ] == -1) {
                inputArray.remove(index);
                index--;
            }
            
            alreadyExists[inputArray.get(index)] = -1; 
        }
    }

    public static void program3() {

    }

    public static void program4() {
        
    }
}