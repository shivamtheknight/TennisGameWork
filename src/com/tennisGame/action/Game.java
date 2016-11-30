package com.tennisGame.action;

import com.tennisGame.bean.Player;

/**
 * This game class called to perform game action on every event
 * 
 * @author shivam tripathi
 *
 */
public class Game {

	private Player player1;
	private Player player2;

	/**
	 * @param Player,
	 *            Player This constructor takes two Player object as a parameter
	 *            in initialize game object
	 */
	public Game(Player p1, Player p2) {
		this.player1 = p1;
		this.player2 = p2;
	}

	/**
	 * This method maintains game score on behalf of players attribute values.
	 * 
	 * @return String as Game score to display on DashBoard
	 */
	public String getScore() {
		if (player1.getScore() >= 3 && player2.getScore() >= 3) {
			if (Math.abs(player2.getScore() - player1.getScore()) >= 2) {
				return getLeadiningPlayer().getName() + " Won";
			} else if (player1.getScore() == player2.getScore()) {
				return "Deuce";
			} else {
				return "Advantage " + getLeadiningPlayer().getName();
			}
		} else {
			return player1.getScoreDescription() + " - " + player2.getScoreDescription();
		}

	}
	/**
	 * @return Player who is leading in the game
	 */
	public Player getLeadiningPlayer() {

		if (player1.getScore() > player2.getScore())
			return player1;
		else
			return player2;
	}
}
