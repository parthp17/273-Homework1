package com.main.example.classes;

import java.util.Comparator;

public class EmployeeSortById implements Comparator<Employee>
{
	@Override
	public int compare(Employee emp1, Employee emp2)
	{
		return emp1.nEmployeeId.compareTo(emp2.nEmployeeId);
	}	
}
