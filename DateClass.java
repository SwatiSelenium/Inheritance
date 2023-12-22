package Inheritance;

import java.util.Date;

public class DateClass 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime()+ 1000*60*60*24*5);//5 days, 1day=24hrs, 1 hr=60 min, 1 min=60sec, 1 sec=1000ms
		System.out.println(d2);
		String formatofdate = d2.toString();
		int length = formatofdate.length();
		System.out.println(length);
		String year = formatofdate.substring(24, 28);
		System.out.println(year);
		String month = formatofdate.substring(4, 7);
		System.out.println(month);
		String day = formatofdate.substring(8, 10);
		System.out.println(day);
		String time = formatofdate.substring(11, 19);
		System.out.println(time);
		String format1 = day.concat(month).concat(year);
		System.out.println(format1);
		String format2 = day.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format2);
		String format3 = day.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format3);
	}

}
