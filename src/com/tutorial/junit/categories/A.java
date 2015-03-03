package com.tutorial.junit.categories;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class A {

	@Test
	public void a(){
		System.out.println("Class A, Method A");
		fail();
	}
	
	@Category(SlowTests.class)
	@Test
	public void b(){
		System.out.println("Class A, Method B");
	}
	
}
