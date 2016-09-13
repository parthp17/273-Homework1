package com.main.example.classesmain;

import java.util.Stack;

import com.main.example.classes.ReverseStringStack;

public class ReverseStringStackMain
{

	public static void main(String[] args)
	{
		ReverseStringStack objReverseStringStack = new ReverseStringStack();
		objReverseStringStack.setObjStack(new Stack<String>());
		System.out.println(objReverseStringStack.reverseString("parth"));
	}
}
