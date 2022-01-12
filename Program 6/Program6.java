import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a positive number:");
		
		int requestedNumber = userInput.nextInt();
		int calculationCache = requestedNumber;
		
		for (int currentInteration = requestedNumber - 1; currentInteration >= 1; currentInteration--) {
			calculationCache = calculationCache * currentInteration;
		}
		
		System.out.println(requestedNumber + "'s factorial is " + calculationCache + ".");
		
		userInput.close();
	}
}