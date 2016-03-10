package com.saulo.borges;

public enum Hand {
	
	SCISSOR (1), PAPER (2), ROCK (3);
	
	private int weight;
	
	private Hand(int weigth) {
		this.weight = weigth;
	}

	public int getWeight() {
		return weight;
	}

}
