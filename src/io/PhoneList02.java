package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {

		File file = new File( "./phone.txt" );
		if ( file.exists() == false ) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println( "====== File Info ======" );
		System.out.println( "Path           : " + file.getAbsolutePath() );
		System.out.println( "Size           : " + file.length() + "Bytes" );
		System.out.println( "LastModified   : " + sdf.format( new Date( file.lastModified() ) ) );
		System.out.println( "" );
		
		
		Scanner scanner = null;
		try {
			scanner = new Scanner( file );
			while ( scanner.hasNextLine() ) {
				//System.out.println(scanner.nextLine());
				String name = scanner.next();
				String num1 = scanner.next();
				String num2 = scanner.next();
				String num3 = scanner.next();
				System.out.printf("%s\t: %s - %s - %s \n",name, num1, num2, num3);
				
			}
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			if ( scanner != null) { scanner.close(); }
		}
	}

}
