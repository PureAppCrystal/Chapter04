package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		Reader reader = null;
		InputStream is= null;
		
		
		try {
			 reader = new FileReader( "./text.txt" );
			 is = new FileInputStream( "./text.txt" );
			 
			 //FileReader 
			 int count = 0;
			 int data = -1;
			 while ( ( data = reader.read() ) != -1)  {
				 count++;
				 System.out.print( (char)data);
			 }
			 System.out.println("");
			 System.out.println("읽은 횟수 : "+count );
			 System.out.println("===========================");
			 
			 
			 //FileInputStram
			 count = 0;
			 data = -1;
			 
			 while ( ( data = is.read() ) != -1 ) {
				 count++;
				 System.out.print( (char)data );
			 }
			 
			 System.out.println("");
			 System.out.println("읽은 횟수 : "+count );
			 
			 
		} catch (FileNotFoundException e ) {
			System.out.println( "파일 없음 : " + e);
		} catch (IOException e ) {
			System.out.println( "IO에러 : "+e);
		} finally {
			try {
				if( reader != null) { reader.close(); }
				if( is != null)     { is.close();     }
			} catch( IOException e ) {
				e.printStackTrace();
			}
		}
		

	}

}
