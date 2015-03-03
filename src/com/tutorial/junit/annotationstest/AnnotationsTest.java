package com.tutorial.junit.annotationstest;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsTest {

	private ArrayList<Integer> list;
	
	@BeforeClass
	public static void onceExecutedBeforeAll(){
		System.out.println("@BeforeClass Annotation used");
	}
	
	@Before
	public void executedBeforeEach(){
		list=new ArrayList<Integer>();
		System.out.println("@Before Annotation used");
	}
	
	@AfterClass
	public static void onceExecutedAfterAll(){
		System.out.println("@AfterClass Annotation used");
	}
	
	@After
	public void executedAfterEach(){
		list.clear();
		System.out.println("@After Annoation used");
	}
	
	@Test
	public void emptyCollection(){
		Assert.assertTrue(list.isEmpty());
		System.out.println("@Test Annotation used");
	}
	
	@Test
	public void oneItemCollection(){
		list.add(1);
		System.out.println("@Test Annotation used");
		Assert.assertEquals(1, list.size());
	}
	
	@Ignore
	public void executionIgnored(){
		System.out.println("@Ignore is ignored");
	}
}
