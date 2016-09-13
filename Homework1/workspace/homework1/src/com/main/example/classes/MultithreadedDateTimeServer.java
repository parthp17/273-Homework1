package com.main.example.classes;

import java.io.*;
import java.net.*;
import java.util.Date;

public class MultithreadedDateTimeServer implements Runnable
{
	public static ServerSocket ssocMasterSocket;
	private Socket socChildsocket;
	private DataOutputStream dos;
	private static int nRequestCount = 0;

	public static int getnRequestCount()
	{
		return MultithreadedDateTimeServer.nRequestCount;
	}

	public MultithreadedDateTimeServer(Socket childSocket)
	{
		this.socChildsocket = childSocket;
	}

	public void run()
	{
		System.out.println("connected to " + this.socChildsocket.getInetAddress());
		try
		{
			String sDateTme = new Date().toString();
			this.dos = new DataOutputStream(socChildsocket.getOutputStream());
			this.dos.writeBytes(sDateTme);
			System.out.println("Time sent: " +sDateTme);
			this.doIncrementRequestCount();
			this.socChildsocket.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private synchronized void doIncrementRequestCount()
	{
		MultithreadedDateTimeServer.nRequestCount++;
		System.out.println("Number of request serviced: " + MultithreadedDateTimeServer.getnRequestCount());
	}
}
