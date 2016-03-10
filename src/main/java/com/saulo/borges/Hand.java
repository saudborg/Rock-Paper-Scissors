package com.saulo.borges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Hand {

	SCISSOR(1), PAPER(2), ROCK(3);

	private int weight;

	private Hand(int weigth) {
		this.weight = weigth;
	}

	public int getWeight() {
		return weight;
	}

	private static final List<Hand> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final Random RANDOM = new Random();

	public static Hand getARandomHand() {
		return VALUES.get(RANDOM.nextInt(VALUES.size()));
	}

}
