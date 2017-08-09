package lang;

public class StringTest03 {

	public static void main(String[] args) {
		String s = "aBcAbCabcABC";
		System.out.println( s.charAt(2) );
		System.out.println( s.indexOf("abc") );
		System.out.println( s.lastIndexOf("ab") );
		System.out.println( s.indexOf("xyz") );
		System.out.println( s.length() );
		System.out.println( s.replace('a', 'R') );
		System.out.println( s.replaceAll("abc", "123") );
		System.out.println( s.substring(0, 3) );
		System.out.println( s.toUpperCase() );
		
		
		
		String str1 = " abcd ";
		System.out.println("---" + str1 + "---");
		System.out.println("---" + str1.trim() + "---");
		
		//split
		String [] tokens = str1.split(",");
		for ( String token : tokens ) {
			System.out.println(token);
		}
		
		//split 이 없는 경우 원본을 리턴 
		tokens = "abcdefg".split(",");
		for( String token : tokens ) {
			System.out.println(token);
		}
		
		//
		tokens = "".split(",");
		System.out.println(tokens.length);
		System.out.println("---"+tokens[0]+"---");
		

	}

}
