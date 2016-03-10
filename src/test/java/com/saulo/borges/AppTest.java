package com.saulo.borges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest  {

	// Jogo 1 Pedra x Pedra
	@Test
	public void game1(){
		Hand hand1 = Hand.ROCK;
		Hand hand2 = Hand.ROCK;
		
		Result result = Game.jokenpo(hand1, hand2);
		assertEquals(Result.DRAW, result);
	}
	
	// Jogo 2 Pedra x Papel
	public void game2(){
		Hand hand1 = Hand.ROCK;
		Hand hand2 = Hand.PAPER;
		
		Result result = Game.jokenpo(hand1, hand2);
		assertEquals(Result.PLAYER2_HAS_WON, result);
	}

	// Jogo 3 Pedra x Tesoura
	public void game3(){
		Hand hand1 = Hand.ROCK;
		Hand hand2 = Hand.SCISSOR;
		
		Result result = Game.jokenpo(hand1, hand2);
		assertEquals(Result.PLAYER1_HAS_WON, result);
	}
	
	// Jogo 4 Papel x Pedra
	public void game4(){
		Hand hand1 = Hand.PAPER;
		Hand hand2 = Hand.ROCK;
		
		Result result = Game.jokenpo(hand1, hand2);
		assertEquals(Result.PLAYER1_HAS_WON, result);
	}
	
	// Jogo 5 Papel x Papel
	public void game5(){
		Hand hand1 = Hand.PAPER;
		Hand hand2 = Hand.PAPER;
		
		Result result = Game.jokenpo(hand1, hand2);
		assertEquals(Result.DRAW, result);
	}
	
	// Jogo 6 Papel x Tesoura
	public void game6(){
		Hand hand1 = Hand.PAPER;
		Hand hand2 = Hand.SCISSOR;
		
		Result result = Game.jokenpo(hand1, hand2);
		assertEquals(Result.PLAYER2_HAS_WON, result);
	}
	
	// Jogo 7 Tesoura x Pedra
	public void game7(){
		Hand hand1 = Hand.SCISSOR;
		Hand hand2 = Hand.ROCK;
		
		Result result = Game.jokenpo(hand1, hand2);
		assertEquals(Result.PLAYER2_HAS_WON, result);
	}
	
	// Jogo 8 Tesoura x Papel
	public void game8(){
		Hand hand1 = Hand.SCISSOR;
		Hand hand2 = Hand.PAPER;
		
		Result result = Game.jokenpo(hand1, hand2);
		assertEquals(Result.PLAYER1_HAS_WON, result);
	}
	
	// Jogo 9 Tesoura x Tesoura
	public void game9(){
		Hand hand1 = Hand.SCISSOR;
		Hand hand2 = Hand.SCISSOR;
		
		Result result = Game.jokenpo(hand1, hand2);
		assertEquals(Result.DRAW, result);
	}



}
