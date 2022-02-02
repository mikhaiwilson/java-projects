import java.util.ArrayList;

public class Program5 {
    public static void main(String[] args) { 
        //step 1
        ArrayList<String> myList = new ArrayList<String>();

        //step 2
        myList.add("x");
        myList.add("y");
        myList.add("z");

        //step 3
        String[] myString = {"a", "b", "c", "d", "e"};

        //step 4
        for(String text : myString) {
            myList.add(text);
        }
            
        //step 5
        myList.add("m");
        myList.add("n");
        myList.add("o");

        //step 6
        System.out.println(myList);
        System.out.println("The size of the ArrayList is " + myList.size());

        //step 7
        System.out.println("The first element is " + myList.get(0) + ". The fifth element is " + myList.get(4) + ". The last element is " + myList.get(myList.size() - 1) + ".");

        //step 8
        myList.set(4, "g");
        System.out.println(myList);

        //step 9
        for (int index = 0; index < myList.size(); index++) {
            if ((myList.get(index) == "g") || (myList.get(index) == "o")) {
                myList.remove(index);
            }
        }

        System.out.println(myList);
        System.out.println("The size of the ArrayList is " + myList.size());
    }
}