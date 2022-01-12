import java.util.Scanner;

public class GradeConversion2 {
	public static void main(String[] args) {
		boolean started = false;
		boolean exited = false;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("To start the program, type \"start.\" Any other word will disable the program from use.");
		
		String userAction = userInput.nextLine();
		
		if (userAction.equals("start")) {
			started = true;
			System.out.println("Program started. To exit the program, type a number less than zero when prompted for a grade to convert. Your grade range is limited from zero to positive infinity.");
		}
		else {
			System.out.println("Program disabled.");
		}
		
		while (!exited && started) {
			System.out.println("Enter the grade you want to convert:");
			int inputedGrade = userInput.nextInt();
			
			if (inputedGrade >= 90){
				System.out.println("Letter grade: A");
			}
			else if (inputedGrade >= 80){
				System.out.println("Letter grade: B");
			}
			else if (inputedGrade >= 70){
				System.out.println("Letter grade: C");
			}
			else if (inputedGrade >= 60){
				System.out.println("Letter grade: D");
			}
			else if (inputedGrade >= 0){
				System.out.println("Letter grade: F");
			}
			else {
				System.out.println("Exiting program.");
				exited = true;
				userInput.close();
			}
		}		
	}
}
