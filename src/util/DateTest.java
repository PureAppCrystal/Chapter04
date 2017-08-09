package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		//현재 시간  - 1900년기준
		Date now = new Date();
		System.out.println( now.toString() );
		printDate1(now);
		printDate2(now);
		
		//특정 년월일 (2000/08/04)
		Date d1 = new Date(100, 7, 4);
		printDate2(d1);
		
		//특정 시간 ()
		Date d2 = new Date(100, 7, 4, 14, 30, 30);
		printDate2(d2);
		
		// 1970-01-01 00:00:00 기준 millisecond 값 세팅
		Date d3 = new Date( 24L * 60 * 60 * 1000 * 365 * 30 );
		printDate1(d3);
		
		
		
		
	}
	
	private static void printDate1( Date date ) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println( sdf.format(date) );
	}
	
	private static void printDate2( Date date ) {
		//연도
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDate();
		int hour = date.getHours();
		int minute = date.getMinutes();
		int second = date.getSeconds();
		
		System.out.println(
				(year+1900) + "년 " + 
				(month+1) + "월 " +
				day + "일 " +
				hour + "시 " +
				minute + "분 " +
				second + "초 "
				);
	}

}
