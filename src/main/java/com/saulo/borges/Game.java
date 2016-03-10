package com.saulo.borges;

public class Game {

	/**
	 * This method will deduct the value in the first hand from the second hand
	 * 
	 * SCISSOR (1), PAPER (2), ROCK (3);
	 * 
	 * Result 	= Hand(1) - Hand(2)
	 * 	0 		= Rock - Rock		(Draw)
	 * 	1 		= Rock - Paper		(Lose)
	 * 	2 		= Rock - Scissor	(Win)
	 * 	-1 		= Paper - Rock		(Win)
	 * 	0 		= Paper - Paper		(Draw)
	 * 	1 		= Paper - Scissor	(Lose)
	 * 	-2 		= Scissor - Rock	(Lose)
	 * 	-1 		= Scissor - Paper	(Win)
	 * 	0 		= Scissor - Scissor (Draw)
	 * 
	 * Result = 0 		-> Draw
	 * Result = 1 or -2 -> Lose
	 * Result = 2 or -1 -> Win
	 * 
	 * @param hand1
	 * @param hand2
	 * @return result
	 */
	public static Result rockPaperScissors(Hand hand1, Hand hand2) {
		if (hand1.getWeight() - hand2.getWeight() == 0){
			return Result.DRAW;
		} else if (hand1.getWeight() - hand2.getWeight() == 2 || 
					hand1.getWeight() - hand2.getWeight() == -1) {
			return Result.PLAYER1_HAS_WON;
		} else {
			return Result.PLAYER2_HAS_WON;
		}
	}

}
