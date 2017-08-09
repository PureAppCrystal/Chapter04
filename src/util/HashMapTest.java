package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("둘리",  60);
		map.put("마이콜", 30);
		map.put("도우넛", 40);
		map.put("길동",  90);
		
		//중복
		map.put("둘리",  70);
		
		//삭제
		map.remove("마이콜");
		
		int score = map.get("둘리");
		System.out.println( score );
		
		//평균
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		int sum = 0;
		
		while( it.hasNext() ) {
			String key = it.next();
			System.out.println( key );
			sum += map.get( key );
		}
		
		System.out.println( "평균 : "+ (sum / keySet.size())  );
	}

}
