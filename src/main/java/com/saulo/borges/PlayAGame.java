package com.saulo.borges;

public class PlayAGame {

	private static final Integer NUM_ITERATIONS = 100;

	public static void main(String[] args) {
		
		StringBuffer iterations = new StringBuffer();
		iterations.append("\n\nIterations...");

		int player1Won = 0;
		int draw = 0;
		int player2Won = 0;

		for (int i = 0; i < NUM_ITERATIONS; i++) {

			Hand hand1 = Hand.getARandomHand();
			Hand hand2 = Hand.ROCK;
			
			Result result = Game.rockPaperScissors(hand1, hand2);

			iterations.append("\nGame " + i + "\t: Hand 1 [" + hand1 + "] \tx Hand 2 [" + hand2 + "] => \tResult: " + result);
			
			if (result.equals(Result.PLAYER1_HAS_WON))
				player1Won++;
			else if (result.equals(Result.DRAW))
				draw++;
			else
				player2Won++;
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append("Results                     \n");
		sb.append("                            \n");
		sb.append("PLAYER 1: \t\t " + player1Won + " \n");
		sb.append("PLAYER 2: \t\t " + player2Won + " \n");
		sb.append("DRAW:     \t\t " + draw + " ");
		
		System.out.println(sb.toString());
		System.out.println(iterations.toString());
		
		

	}

}
