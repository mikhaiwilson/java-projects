import java.util.ArrayList;

public class ArrayListMethods {
    // this was not fun

    public static void main(String[] args) {
        System.out.println("program 1:");
        Integer[] array = {1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7};
        printArray(array);
        program1(array);
        printArray(array);

        // --------------------------------------------------------------------------- //
        // --------------------------------------------------------------------------- //
        
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

        // --------------------------------------------------------------------------- //
        // --------------------------------------------------------------------------- //
        
        System.out.println("\nprogram 3:");
        String nameString1 = "Wonda Wilkerson Chicken Mcdoodle Mikhai Wilson James Lebron Micheal Johnson Carl Madegascar Lucas Gale Micheal Chor";
        String[] firstNameArray = new String[8];
        String[] lastNameArray = new String[8];
        program3(nameString1, firstNameArray, lastNameArray);

        printArray(firstNameArray);
        printArray(lastNameArray);

        // --------------------------------------------------------------------------- //
        // --------------------------------------------------------------------------- //

        System.out.println("\nprogram 4:");
        String nameString = "Wonda Wilkerson Chicken Mcdoodle Mikhai Wilson James Lebron Micheal Johnson Carl Madegascar Lucas Gale Micheal Chor";
        ArrayList<String> firstNameArrayList = new ArrayList<>();
        ArrayList<String> lastNameArrayList = new ArrayList<>();
        program4(nameString, firstNameArrayList, lastNameArrayList);

        System.out.println(firstNameArrayList);
        System.out.println(lastNameArrayList);
    } 

    public static void printArray(Integer[] inputArray) {
        System.out.print("[");
        for (int index = 0; index < inputArray.length; index++) {
            if (!(inputArray[index] == null)) {
                System.out.print(inputArray[index] + ", ");
            } 
        }
        System.out.print("]\n");
    }

    public static void printArray(String[] inputArray) {
        System.out.print("[");
        for (int index = 0; index < inputArray.length; index++) {
            if (!(inputArray[index] == null)) {
                System.out.print(inputArray[index] + ", ");
            } 
        }
        System.out.print("]\n");
    }

    public static void program1(Integer[] inputArray) {
        int[] alreadyExists = new int [inputArray.length];

        for (int index = 0; index < inputArray.length; index++) {
            if (!(alreadyExists[inputArray[index]] == -1)) {
                alreadyExists[inputArray[index]] = -1; 
            } else {
                inputArray[index] = null;
            }   
        }
    }

    public static void program2(ArrayList<Integer> inputArray) {
        int alreadyExists[] = new int [inputArray.size()];

        for (int index = 0; index < inputArray.size(); index++) {
            if (alreadyExists[inputArray.get(index)] == -1) {
                inputArray.remove(index);
                index--;
            }
            
            alreadyExists[inputArray.get(index)] = -1; 
        }
    }

    public static void program3(String nameString, String[] firstNameArray, String[] lastNameArray) {
        int previous = 0;
        int count = 1;
        int firstNameIndex = 0;
        int lastNameIndex = 0;

        for (int i = nameString.indexOf(" "); i != -1; i = nameString.indexOf(" ", i + 1)) {
            if (count % 2 == 0) {
                lastNameArray[lastNameIndex] = nameString.substring(previous + 1, i);
                lastNameIndex++;
                count++;
                previous = i;
            } else {
                firstNameArray[firstNameIndex] = (nameString.substring(previous, i));
                firstNameIndex++;
                count++;
                previous = i;
            }
        }

        lastNameArray[lastNameArray.length - 1] = nameString.substring(previous, nameString.length());
    }

    public static void program4(String nameString, ArrayList<String> firstNameArrayList, ArrayList<String> lastNameArrayList) {
        int previous = 0;
        int count = 1;

        for (int i = nameString.indexOf(" "); i != -1; i = nameString.indexOf(" ", i + 1)) {
            if (count % 2 == 0) {
                lastNameArrayList.add(nameString.substring(previous + 1, i));
                count++;
                previous = i;
            } else {
                firstNameArrayList.add(nameString.substring(previous, i));
                count++;
                previous = i;
            }
        }

        lastNameArrayList.add(nameString.substring(previous, nameString.length()));
    }
}