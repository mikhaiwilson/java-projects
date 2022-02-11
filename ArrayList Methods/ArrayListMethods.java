import java.util.ArrayList;

public class ArrayListMethods {
    // make sure that main class is first
    // make sure that printing is done in the main method

    public static void main(String[] args) {
        // ArrayList<Integer> array = new ArrayList<>();

        // array.add(2);
        // array.add(2);
        // array.add(2);
        // array.add(2);
        // array.add(3);
        // array.add(3);
        // array.add(4);
        // array.add(4);
        // array.add(5);
 
        // System.out.println(array);
        // program2(array);
        // System.out.println(array);

        int program1Testing[] = {1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7};

        
        program1Testing = program1(program1Testing);
        
        printArray(program1Testing);
        
    } 

    public static void printArray(int[] inputArray) {
        System.out.print("[");
        for (int index = 0; index < inputArray.length; index++) {
            System.out.print(inputArray[index] + ", ");
        }
        System.out.print("]\n");
    }

    public static int[] program1(int[] inputArray) {
        int alreadyExists[] = new int [inputArray.length];
        ArrayList<Integer> preReturnArrayList = new ArrayList<>();

        for (int index = 0; index < inputArray.length; index++) {
            if (!(alreadyExists[inputArray[index]] == -1)) {
                alreadyExists[inputArray[index]] = -1; 
                preReturnArrayList.add(inputArray[index]);
            }  
        }

        int returnArray[] = new int [preReturnArrayList.size()];

        for (int index = 0; index < returnArray.length; index++) {
            returnArray[index] = preReturnArrayList.get(index);
        } 

        return returnArray;
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
}