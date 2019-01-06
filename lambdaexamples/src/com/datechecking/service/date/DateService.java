package com.datechecking.service.date;

import java.util.LinkedHashMap;

public class DateService {
	
	public LinkedHashMap<Integer, Integer> monthDay = null;
	public int getTotalDays(String inputDate) {
		System.out.println("The Input Date is = "+inputDate);
		String array[]=inputDate.split("-");
	    monthDay  = new LinkedHashMap<>();
		monthDay.put(1, 31);
		monthDay.put(2, 28);
		monthDay.put(3, 31);
		monthDay.put(4, 30);
		monthDay.put(5, 31);
		monthDay.put(6, 30);
		monthDay.put(7, 31);
		monthDay.put(8, 31);
		monthDay.put(9, 30);
		monthDay.put(10, 31);
		monthDay.put(11, 30);
		monthDay.put(12, 31);
		if(Integer.parseInt(array[0])<=monthDay.get(Integer.parseInt(array[1])))
		{
			int totalDaysCount = 0;
			totalDaysCount = totalDaysCount+getYears(Integer.parseInt(array[2]))+getMonths(Integer.parseInt(array[1]))+getDays(Integer.parseInt(array[0]));
			return totalDaysCount;
		}
		else
		{
			return 0;
		}
	}
	public int getYears(int year) {
		if(year>0&&year>2018) {
			int diff = year-2018;
			
			return 365*diff+isLeap(year);
		}
		else
			return 0;
	}
	
	public int getMonths(int month) {
		int monthsDays = 0;
		if(month>0) {
			for(int i=0;i<month-1;i++)
			{
				System.out.println(monthDay.get(i+1));
				monthsDays=monthsDays+monthDay.get(i+1);
			}
		}
		return monthsDays;
	}
	public int getDays(int days) {
		if(days>0)
			return days;
		else
			return 0;
	}
	public int isLeap(int year) {
		if(year%4==0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
