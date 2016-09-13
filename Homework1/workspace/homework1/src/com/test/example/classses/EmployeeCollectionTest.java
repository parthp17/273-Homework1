package com.test.example.classses;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.main.example.classes.Employee;
import com.main.example.classes.EmployeeSortById;
import com.main.example.classes.EmployeeSortByName;

public class EmployeeCollectionTest
{
	static List<Employee> lsEmployee;
	static Employee temp;
	@BeforeClass
	public static void Load()
	{
		lsEmployee  = new ArrayList<Employee>();
		temp = new Employee("Parth",new Integer(1));
		lsEmployee.add(temp);
		lsEmployee.add(new Employee("Ishan",new Integer(4)));
		lsEmployee.add(new Employee("Kemy",new Integer(2)));
		lsEmployee.add(new Employee("Chubby",new Integer(3)));
	}
	
	@Test
	public void testSortByName()
	{
		EmployeeSortByName objEmployeeSortByName = new EmployeeSortByName();
		Collections.sort(lsEmployee, objEmployeeSortByName);
		assertEquals(temp,lsEmployee.get(3));
	}
	@Test
	public void testSortById()
	{
		EmployeeSortById objEmployeeSortById = new EmployeeSortById();
		Collections.sort(lsEmployee, objEmployeeSortById);
		assertEquals(temp,lsEmployee.get(0));
	}
}
