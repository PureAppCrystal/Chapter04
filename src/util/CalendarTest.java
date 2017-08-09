package util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDate( cal );

		
		Calendar cal2 = Calendar.getInstance();
		cal2.set( Calendar.YEAR, 2013);
		cal2.set( Calendar.MONTH, 03);
		cal2.set( Calendar.DATE, 10);
		printDate( cal2 );
		
		cal2.set(2013, 03, 10);
		cal2.add(Calendar.DATE, 1580);
		printDate( cal2 );
		
		
	}
	
	
	
	
	
	public static void printDate(Calendar cal) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토", };
		
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);  //0~11
		int date  = cal.get(Calendar.DATE);
		
		int hour   = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//1(일) ~ 7(토)
		int day = cal.get( Calendar.DAY_OF_WEEK );
		
		
		System.out.println(
				year + "년 " + 
				(month+1) + "월 " +
				date + "일(" +
				days[ day-1 ] + ") " +
				hour + "시 " +
				minute + "분 " +
				second + "초 "
				);
		
		//System.out.println( days[ day-1 ] );
	}


}
