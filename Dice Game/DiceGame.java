public class DiceGame {
	static public int rollDie() {
		return (int)((Math.random() * 6) + 1);
	}
	
	static public int totalRoll(int Roll1, int Roll2) {
		return (Roll1 + Roll2);
	}
	
	static public void winner(int player1Score, int player2Score) {
		if (player1Score > player2Score) {
			System.out.println("Player 1 won with a score of " + player1Score + "!");
		}
		else if (player2Score > player1Score) {
			System.out.println("Player 2 won with a score of " + player2Score + "!");
		}
	}
	
	public static void main(String[] args) {
		int player1Score = 0;
		int player2Score = 0;
		while ((player1Score < 100) && (player2Score < 100)) {
			int player1Roll1 = rollDie();
			int player1Roll2 = rollDie();
			int player1Roll = totalRoll(player1Roll1, player1Roll2);
			
			int player2Roll1 = rollDie();
			int player2Roll2 = rollDie();
			int player2Roll = totalRoll(player2Roll1, player2Roll2);
			
			if (player1Roll > player2Roll) {
				player1Score = player1Score + (player1Roll - player2Roll);
			}
			else if (player2Roll > player1Roll) {
				player2Score = player2Score + (player2Roll - player1Roll);
			}
		} 
		
		winner(player1Score, player2Score);
	}
}