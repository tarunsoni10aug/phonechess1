package com.phonechess;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert; 


public class PhoneChessTest {
	private PhoneChess phoneChess;
	@Before

	public void setup()
	{
		phoneChess= new PhoneChess();
	}
	@Test
	public void calculateNumberOfPossibleCombinationsTest()
	{
		int result = phoneChess.calculateNumberOfPossibleCombinations("5", "knight");
		Assert.assertEquals(544, result);
	}
	@Test(expected = IllegalArgumentException.class)
	public void calculateNumberOfPossibleCombinationsExceptionTest()
	{
		phoneChess.calculateNumberOfPossibleCombinations("  ", "knight");
	}
}
