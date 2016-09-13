package com.test.example.classses;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.example.classes.ArrayMarks;

public class ArrayMarksTest
{

	@Test
	public void testHighest()
	{
		ArrayMarks objArrayMarks = new ArrayMarks();
		int[] nArray = {89,75,45,68,98};
		assertEquals(0,objArrayMarks.getHighest());
		objArrayMarks.setnMarks(nArray);
		assertEquals(98, objArrayMarks.getHighest());
	}

	@Test
	public void testTotal()
	{
		ArrayMarks objArrayMarks = new ArrayMarks();
		int[] nArray = {89,75,45,68,98};
		assertEquals(0,objArrayMarks.getTotal());
		objArrayMarks.setnMarks(nArray);
		assertEquals(375, objArrayMarks.getTotal());
	}
}
