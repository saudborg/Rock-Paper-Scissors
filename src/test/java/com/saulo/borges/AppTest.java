package com.saulo.borges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest  {

	// Game 1 Rock x Rock
	@Test
	public void game1(){
		Hand hand1 = Hand.ROCK;
		Hand hand2 = Hand.ROCK;
		
		Result result = Game.rockPaperScissors(hand1, hand2);
		assertEquals(Result.DRAW, result);
	}
	
	// Game 2 Rock x Paper
	public void game2(){
		Hand hand1 = Hand.ROCK;
		Hand hand2 = Hand.PAPER;
		
		Result result = Game.rockPaperScissors(hand1, hand2);
		assertEquals(Result.PLAYER2_HAS_WON, result);
	}

	// Game 3 Rock x Scissor
	public void game3(){
		Hand hand1 = Hand.ROCK;
		Hand hand2 = Hand.SCISSOR;
		
		Result result = Game.rockPaperScissors(hand1, hand2);
		assertEquals(Result.PLAYER1_HAS_WON, result);
	}
	
	// Game 4 Paper x Rock
	public void game4(){
		Hand hand1 = Hand.PAPER;
		Hand hand2 = Hand.ROCK;
		
		Result result = Game.rockPaperScissors(hand1, hand2);
		assertEquals(Result.PLAYER1_HAS_WON, result);
	}
	
	// Game 5 Paper x Paper
	public void game5(){
		Hand hand1 = Hand.PAPER;
		Hand hand2 = Hand.PAPER;
		
		Result result = Game.rockPaperScissors(hand1, hand2);
		assertEquals(Result.DRAW, result);
	}
	
	// Game 6 Paper x Scissor
	public void game6(){
		Hand hand1 = Hand.PAPER;
		Hand hand2 = Hand.SCISSOR;
		
		Result result = Game.rockPaperScissors(hand1, hand2);
		assertEquals(Result.PLAYER2_HAS_WON, result);
	}
	
	// Game 7 Scissor x Rock
	public void game7(){
		Hand hand1 = Hand.SCISSOR;
		Hand hand2 = Hand.ROCK;
		
		Result result = Game.rockPaperScissors(hand1, hand2);
		assertEquals(Result.PLAYER2_HAS_WON, result);
	}
	
	// Game 8 Scissor x Paper
	public void game8(){
		Hand hand1 = Hand.SCISSOR;
		Hand hand2 = Hand.PAPER;
		
		Result result = Game.rockPaperScissors(hand1, hand2);
		assertEquals(Result.PLAYER1_HAS_WON, result);
	}
	
	// Game 9 Scissor x Scissor
	public void game9(){
		Hand hand1 = Hand.SCISSOR;
		Hand hand2 = Hand.SCISSOR;
		
		Result result = Game.rockPaperScissors(hand1, hand2);
		assertEquals(Result.DRAW, result);
	}



}
