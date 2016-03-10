package com.saulo.borges;

public enum Result {
	
	PLAYER1_HAS_WON(1, "Player 1 has won"), //
	DRAW (0 , "Draw"), //
	PLAYER2_HAS_WON (-1, "Player 1 has lost");
	
	private int value;
	
	private String msgAsPlayer1;
	
	private Result(int value, String msg){
		this.setValue(value);
		this.setMsgAsPlayer1(msg);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getMsgAsPlayer1() {
		return msgAsPlayer1;
	}

	public void setMsgAsPlayer1(String msgAsPlayer1) {
		this.msgAsPlayer1 = msgAsPlayer1;
	}
	
}
