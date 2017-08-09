package lang;

public class WrapperClassTest {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Character c = new Character('a');
		Float f = new Float(3.14);
		Boolean b = new Boolean( true );
		
		
		//auto boxing
		Integer j = 10;
		
		//Auto unBoxing
		//int k = 2 + j.intValue();
		int k = 20 + j;
		
		System.out.println(i+ "," +k);
		swap(i, k);
		System.out.println(i+ "," +k);
	}
	
	public static void swap( Integer a, Integer b ) {
		int temp = a;
		//객체이지만 내부를 수정할 수 없다.
		a = b;
		b = temp;
	}

}
