import java.util.Scanner;

public class ScoreChart {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the number of people on the team:");
		
		int teamAmount = userInput.nextInt();
		double teamSum = 0;
		
		int highScore = Integer.MIN_VALUE;
		String highScorePlayer = "Nobody";
		
        int lowScore = Integer.MAX_VALUE;
        String lowScorePlayer = "Nobody";
		
		for (int x = 1; x <= teamAmount; x++) {
			System.out.println("Enter player " + x + "'s name:");
			String playerName = userInput.next();
			
			System.out.println("Enter player " + x + "'s score:");
			int playerScore = userInput.nextInt();
			
			if (playerScore > 300) {
				playerScore = 300;
			} else if (playerScore < 0 ) {
				playerScore = 0;
			}
			
			if (playerScore > highScore) {
				highScore = playerScore;	
				highScorePlayer = playerName;
			} 
			
			if (playerScore < lowScore) {
				lowScore = playerScore;
				lowScorePlayer = playerName;
			}
			
			teamSum = teamSum + playerScore;
		}
		
		double teamAverage = teamSum / teamAmount;
		
		System.out.println("\nHigh score: " + highScore + " (" + highScorePlayer + ")\nLow score: " + lowScore + " (" + lowScorePlayer + ")\nTeam average: " + teamAverage + "\nTeam sum: " + teamSum);
		userInput.close();
	}
}

// Program output: 
// High score: 214 (Enid)
// Low score: 73 (Anna)
// Team average: 142.8
// Team sum: 714.0