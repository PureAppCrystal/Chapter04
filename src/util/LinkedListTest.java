package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		//insert
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		//roop
		int length = list.size();
		for ( int i = 0; i<length; i++   ) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		//remove
		list.remove(1);
		
		//roop2
		System.out.println("---------------------------");
		Iterator<String> it = list.iterator();
		while( it.hasNext() ) {
			String s = it.next();
			System.out.println(s);
		}
		
		
		//rrop3
		System.out.println("---------------------------");
		for( String s : list ) {
			System.out.println(s);
		}

	}

}
