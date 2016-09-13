package com.main.example.classes;

import java.util.Queue;

public class QueueTheatre 
{
	private Queue<String> line;
	public void addToline(String sName)
	{
		if(this.line != null)
		this.line.add(sName);
	}
	public String removeFromLine()
	{
		String sPerson = null;
		if(this.line != null && this.line.size() > 0)
		{
			sPerson = this.line.remove();
		}
		return sPerson;
	}
	public String getFirst()
	{
		String sPerson = null;
		if(this.line != null && this.line.size() > 0)
		{
			sPerson = this.line.peek();
		}
		return sPerson;
	}
	public Queue<String> getLine() {
		return line;
	}
	public void setLine(Queue<String> line) {
		this.line = line;
	}
	public String issueTicket()
	{
		String sPerson = null;
		if(this.line != null && this.line.size() > 0)
		{
			sPerson = this.line.poll();
		}
		return sPerson;
	}	
}
