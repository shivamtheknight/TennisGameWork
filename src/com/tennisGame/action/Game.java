package com.tennisGame.action;

import com.tennisGame.bean.Player;

public class Game {

	private Player player1;
	private Player player2;

	public Game(Player p1, Player p2) {
		this.player1 = p1;
		this.player2 = p2;
	}

	public String getScore(){
		if(player1.getScore() >= 3 && player2.getScore() >= 3){
			if(Math.abs(player2.getScore() - player1.getScore())>=2){
				return getLeadiningPlayer().getName() + " Won";
			} else if(player1.getScore() == player2.getScore()){
				return "Deuce";
			}
			else
			{
				return "Advantage " + getLeadiningPlayer().getName();
			}
		}
		else {
			return player1.getScoreDescription()+" - "+player2.getScoreDescription();
		}
		
	}
	
	public Player getLeadiningPlayer(){
		
		if(player1.getScore()>player2.getScore())
			return player1;
		else
			return player2;
	}
}
