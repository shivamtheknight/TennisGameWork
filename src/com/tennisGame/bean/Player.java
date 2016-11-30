package com.tennisGame.bean;

import com.tennisGame.constant.GamePointConstant;

public class Player {
	
private int score;
private String name;

public Player(String pname){
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
 * 
 */
public void winChance(){
	this.score = this.score +1;
}

public String getScoreDescription(){
	return GamePointConstant.pointsDescription.get(score);
}
}

