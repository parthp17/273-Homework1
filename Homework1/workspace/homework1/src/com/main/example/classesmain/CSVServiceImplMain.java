package com.main.example.classesmain;

import java.util.LinkedList;

import com.main.example.classes.CSVServiceImpl;
import com.main.example.interfaces.Service;

public class CSVServiceImplMain
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CSVServiceImpl objCSVServiceImpl = new CSVServiceImpl();
		String [] sData = {"parth,pandya"};
		objCSVServiceImpl.parseInput(sData);
		objCSVServiceImpl.executeService();
		objCSVServiceImpl.generateOutput();
	}
}
