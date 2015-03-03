package com.tutorial.junit.together;

import org.junit.Assert;
import org.junit.Test;

public class AddPencilsTest {

	String[] bag2 = { "Books, Notebooks", "Pens", "Pencils" };
	FirstDayAtSchool schoolBag=new FirstDayAtSchool();
	
	
	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils");
		Assert.assertArrayEquals(bag2, schoolBag.addPencils());
	}
	
}
