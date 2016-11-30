package com.tennisGame.bean;

import com.tennisGame.constant.GamePointConstant;

/**
 * This player class contains player properties to maintain name and scores
 * 
 * @author shivam tripathi
 *
 */
public class Player {

	private int score;
	private String name;

	public Player(String pname) {
		this.name = pname;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Increase the score of player
	 */
	public void winChance() {
		this.score = this.score + 1;
	}
	
	/**
	 * 
	 * @return String as player game description
	 */
	public String getScoreDescription() {
		return GamePointConstant.pointsDescription.get(score);
	}
}
