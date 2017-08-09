package lang;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I Say \"Hello\" ";
		System.out.println( s );
		
		char c = '\'';
		System.out.println( c );
		
		String path = "d:\\bigdata";
		System.out.println(path);
		
		// \t \n \r \b ...
		System.out.println("");
		System.out.print("\n");
		
		// + 연산이 가능 
		String s1 = "Hello"+" World";
		String s2 = "Hello";
		s2 += " World";
		
		//내부 문자 배열 가져오기
		char[] cs = s2.toCharArray();
		System.out.println(cs);
	}

}
