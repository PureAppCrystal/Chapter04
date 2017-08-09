package util;

import java.util.Enumeration;
import java.util.Vector;

public class VoctorTest {

	public static void main(String[] args) {
		// 1.1
		
		Vector<String> v = new Vector<String>();
		//List<> list = new Vector<>();
		//List<> list = new LinkedList<>();
		//List<> list = new ArrayList<>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우넛");
		
		//순회1
		Enumeration<String> e = v.elements();
		while ( e.hasMoreElements() ) {
			String s = e.nextElement();
			System.out.println( s );
		}
		
		//삭제
		v.removeElementAt( 1 );
		
		
		//순회2
		System.out.println("--------------------------");
		int count = v.size();
		for ( int i = 0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println( s );
		}
		

	}

}
