package com.hollywood.idgenerator;

public class Id {

	private static int id = 1;
	
	public static int get()
	{
		return id++;
	}
	
}
