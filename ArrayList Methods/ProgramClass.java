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
        program1(array);
        System.out.println(array);

    } 

    public static void program1(ArrayList<Integer> inputArray) {

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