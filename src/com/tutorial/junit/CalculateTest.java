package com.tutorial.junit;

import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {

	Calculate calculate=new Calculate();
	int sum=7;
	@Test
	public void test() {
		Assert.assertEquals(7,calculate.sum(3, 4));
	}

}
