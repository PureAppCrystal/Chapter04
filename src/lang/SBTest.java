package lang;

public class SBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println( sb.length() +":"+ sb.capacity() );
		System.out.println( sb );
		
		//문자열 추가
		sb.append(" is pencil" );
		System.out.println( sb );
		
		sb.insert(8, "my ");
		System.out.println( sb );
		
		sb.replace(8, 10, "your");
		System.out.println( sb );
		
		//버퍼크기조정
		sb.setLength(3);
		System.out.println( sb );
		System.out.println( sb.length() +":"+ sb.capacity() );
		
		//문자열 + 연산은 내부적으로 StringBuffer객체로 변환
		String s1 = "Hello" + " World" + 10 + true;
		String s2 = new StringBuffer( "Hello" ).append(" World").append( 10 ).append(true).toString();
		
		
		
		System.out.println( s1 );
		System.out.println( s2 );
		
		
	}

}
