package com.tutorial.junit.rules;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class NameRuleTest {

	@Rule
	public TestName name=new TestName();
	
	@Test
	public void testA(){
		System.out.println(name.getMethodName());
		Assert.assertEquals("testA", name.getMethodName());
	}
	
	@Test
	public void testB(){
		System.out.println(name.getMethodName());
		Assert.assertEquals("testB", name.getMethodName());
	}
	
}
