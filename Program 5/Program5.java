import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a positive number:");
		
		int maxNumber = userInput.nextInt();
		
		for (int x = 1; x <= maxNumber; x++) {
			if (x == maxNumber) {
				System.out.print(x + ".");
				break;
			}
			System.out.print(x + ", ");
		}
		
		userInput.close();
	}
}