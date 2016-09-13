package com.main.example.classesmain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.main.example.classes.*;

import com.main.example.classes.Employee;

public class EmployeeSortMain
{
	public static void main(String[] args)
	{
		List<Employee> lsEmployee  = new ArrayList<Employee>();
		lsEmployee.add(new Employee("Parth",new Integer(1)));
		lsEmployee.add(new Employee("Ishan",new Integer(4)));
		lsEmployee.add(new Employee("Kemy",new Integer(2)));
		lsEmployee.add(new Employee("Chubby",new Integer(3)));
		for(Employee emp : lsEmployee)
			System.out.println(emp.sFirstName +"	" +emp.nEmployeeId);
		System.out.println("*******sort by id********");
		EmployeeSortById objEmployeeSortById = new EmployeeSortById();
		Collections.sort(lsEmployee, objEmployeeSortById);
		for(Employee emp : lsEmployee)
			System.out.println(emp.sFirstName +"	" +emp.nEmployeeId);
		
			System.out.println("*******sort by name********");
		EmployeeSortByName objEmployeeSortByName = new EmployeeSortByName();
		Collections.sort(lsEmployee, objEmployeeSortByName);
		for(Employee emp : lsEmployee)
			System.out.println(emp.sFirstName +"	" +emp.nEmployeeId);
	}
}
