package com.main.example.classesmain;

import com.main.example.classes.ArrayMarks;

public class ArrayMarksMain
{
	public static void main(String [] args)
	{
		ArrayMarks objArrayMarks = new ArrayMarks();
		int[] nArray = {89,75,45,68,98};
		objArrayMarks.setnMarks(nArray);
		System.out.println("Total  :" + objArrayMarks.getTotal());
		System.out.println("Highest  :" + objArrayMarks.getHighest());
	}
}
