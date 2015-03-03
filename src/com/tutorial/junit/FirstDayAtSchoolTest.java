package com.tutorial.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
@Ignore
public class FirstDayAtSchoolTest {

	String[] bag1 = { "Books, Notebooks", "Pens" };
	String[] bag2 = { "Books, Notebooks", "Pens", "pencils" };
	FirstDayAtSchool schoolBag = new FirstDayAtSchool();

	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside prepareMyBag");
		Assert.assertArrayEquals(bag1, schoolBag.prepareMyBag());
	}
	
	
	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils");
		Assert.assertArrayEquals(bag2, schoolBag.addPencils());
	}

}
