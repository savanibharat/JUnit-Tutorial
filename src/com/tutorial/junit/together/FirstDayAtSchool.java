package com.tutorial.junit.together;

import java.util.Arrays;

public class FirstDayAtSchool {

	public String[] prepareMyBag() {

		String[] schoolBag = { "Books, Notebooks", "Pens" };
		System.out.println("The school bag contains "
				+ Arrays.toString(schoolBag));
		return schoolBag;
	}

	public String[] addPencils() {

		String[] schoolBag = { "Books, Notebooks", "Pens", "Pencils" };
		System.out.println("Now School bag contains "+Arrays.toString(schoolBag));
		return schoolBag;
	}

}
