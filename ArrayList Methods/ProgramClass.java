import java.util.ArrayList;

public class ProgramClass {
    // make sure that main class is first
    // make sure that printing is done in the main method

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(3);
        array.add(4);
        array.add(4);
        array.add(5);
 
        System.out.println(array);
        program2(array);
        System.out.println(array);

    } 

    public static void program1(Integer[] inputArray) {
        int alreadyExists[] = new int [inputArray.length];
        ArrayList<Integer> preReturnArrayList = new ArrayList<>();

        for (int index = 0; index < inputArray.length; index++) {
            if (!(alreadyExists[inputArray[index]] == -1)) {
                alreadyExists[inputArray[index]] = -1; 
                preReturnArrayList.add(inputArray[index]);
            }  
        }

        Integer returnArray[] = new Integer [preReturnArrayList.size()];

        for (int index = 0; index < returnArray.length; index++) {
            returnArray[index] = preReturnArrayList.get(index);
        } 

        inputArray = returnArray;
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