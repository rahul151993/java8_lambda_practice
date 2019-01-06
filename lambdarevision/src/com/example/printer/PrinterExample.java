package com.example.printer;

public class PrinterExample {
	
	public static void main(String args[])
	{
		//--*
		//-*-*
		//*-*-*
		int count  = 3;
		int i=0;
		while(i<count)
		{
			int spaceCounter=count-(i+1);
			int k=0;
			while(k<spaceCounter)
			{
				System.out.print(" ");
				k++;
			}
			int j=0;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
				System.out.println();
			i++;
		}
	}
}
