package com.tutorial.junit.parameterized;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculateTest {

	private int expected;
	private int first;
	private int second;

	public CalculateTest(int expected, int first, int second) {
		this.expected = expected;
		this.first = first;
		this.second = second;
	}

	@Parameters
	public static Collection addedNumbers() {
		return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
				{ 7, 3, 4 }, { 9, 4, 5 } });
	}

	@Test
	public void sum() {
		Calculate cal = new Calculate();
		System.out.println("Addition with paramerter: " + first + " and "
				+ second);
		Assert.assertEquals(expected, cal.sum(first, second));
	}

}
