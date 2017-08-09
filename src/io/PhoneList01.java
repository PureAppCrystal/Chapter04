package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

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
		
		
		
		// System.out.println( "" );
		// System.out.println( "" );
		
		BufferedReader br = null;
		try {
			String line;
			int count = 0;
			
			br = new BufferedReader( new InputStreamReader( new FileInputStream(file), "UTF-8" ) );
						
			System.out.println( "[ File Data ]" );
			while ( (line = br.readLine()) != null ) {
				//count++;
				//System.out.printf("%02d | %s \n", count, line);
				int index = 0;
				StringTokenizer st = new StringTokenizer(line, "\t ");
				
				while ( st.hasMoreTokens() ) {
					String s = st.nextToken();
					if ( index == 0 ) {
						System.out.print( s + " : " );
					} else if ( index == 1 ) {
						System.out.print( s + "-");
					} else if ( index == 2) {
						System.out.print( s + "-");
					} else {
						System.out.print( s );
					}
					index++;
				}
				System.out.println( "");
			}
		} catch ( UnsupportedEncodingException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				if ( br != null) { br.close(); }
			} catch ( IOException e ) {
				e.printStackTrace();
			}
		}

	}

}
