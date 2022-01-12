import java.util.Scanner;

public class GradeConversions {
public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int userInputInt = userInput.nextInt();
    if (userInputInt >= 90){
        System.out.print("Letter grade: A");
    }
    else if (userInputInt >= 80){
        System.out.print("Letter grade: B");
    }
    else if (userInputInt >= 70){
        System.out.print("Letter grade: C");
    }
    else if (userInputInt >= 60){
        System.out.print("Letter grade: D");
    }
    else if (userInputInt >= 0){
        System.out.print("Letter grade: F");
    }
    else {
        System.out.print("Numerical grade cannot be less than 0");
    }
    userInput.close();
  }
}
