package com.tennisGame.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.tennisGame.action.Game;
import com.tennisGame.bean.Player;

public class GameTest {
	Player harry;
	Player ron;
	Game game;

	@Before
	public void beforeGameStart() {
		harry = new Player("Harry");
		ron = new Player("Ron");
		game = new Game(harry, ron);
	}

	@Test
	public void checkLovescore() {
		Assert.assertEquals("Love - Love", game.getScore());
	}

	@Test
	public void testScores() {
		harry.winChance();
		Assert.assertEquals("Fifteen - Love", game.getScore());
		ron.winChance();
		ron.winChance();
		Assert.assertEquals("Fifteen - Thirty", game.getScore());
	}

	@Test
	public void testDeuce() {
		harry.winChance();
		harry.winChance();
		ron.winChance();
		ron.winChance();
		harry.winChance();
		ron.winChance();
		Assert.assertEquals("Deuce", game.getScore());
	}

	@Test
	public void testAdvantage() {
		harry.winChance();
		harry.winChance();
		harry.winChance();
		ron.winChance();
		ron.winChance();
		ron.winChance();
		harry.winChance();
		Assert.assertEquals("Advantage Harry", game.getScore());
	}

	@Test
	public void testWinner() {
		harry.winChance();
		harry.winChance();
		harry.winChance();
		ron.winChance();
		ron.winChance();
		ron.winChance();
		harry.winChance();
		harry.winChance();
		Assert.assertEquals("Harry Won", game.getScore());

	}
}