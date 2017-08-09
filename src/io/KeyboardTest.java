package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
				
		try {
			br = new BufferedReader(  new InputStreamReader( System.in, "UTF-8") );
			
			while ( true ) {
				String line = br.readLine();

				if ( ( line == null )  || ( line.equals("quit") ) ) {
					break;
				} else {
					System.out.println(">>" + line );
				}
			}
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 charset : " + e);
			e.printStackTrace();
		} catch ( IOException e ) {
			System.out.println("IO에러 : " + e);
			
		} finally {
			try {
				if ( br != null) { br.close(); }
			} catch (IOException e ) {
				e.printStackTrace();
			}
		}

	}

}
