package com.tutorial.junit.together;

import org.junit.Assert;
import org.junit.Test;

import com.tutorial.junit.FirstDayAtSchool;

public class PrepareMyBagTest {

	String[] bag1 = { "Books, Notebooks", "Pens" };
	FirstDayAtSchool schoolBag = new FirstDayAtSchool();

	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside prepareMyBag");
		Assert.assertArrayEquals(bag1, schoolBag.prepareMyBag());
	}
	
	
}
