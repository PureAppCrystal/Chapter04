package lang;

public class EqualTest {

	public static void main(String[] args) {
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(20, 30);
		Point p3 = p2;
		
		// == 연산자에서 두개의 항이 객체 참조변수인 경우, 두 객체의 동일 여부확인(동일성)
		System.out.println( p1 == p2 );
		System.out.println( p2 == p3 );
		
		System.out.println("");
		System.out.println( p1.hashCode() );
		System.out.println( p2.hashCode() );
		System.out.println( p3.hashCode() );
		
		// 두 객체의 동질성 비교를 할 때에는, eqauls 메소드를 사용
		// eqauls가 오버라이드가 안된 경우에는 == 완전히 동일
		System.out.println("");
		System.out.println( p1.equals(p2) );
		System.out.println( p2.equals(p3) );
		
		
		
		
		
		/* String 객체와 비교 */
		System.out.println("--------------------------");
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = s2;
		
		// == 는 해쉬코드(참조값)을 비교 한다.
		System.out.println( s1 == s2 );
		System.out.println( s2 == s3 );
		
		// String의 eqauls는 오버라이드 되어있어 속 데이터를 비교한다.
		System.out.println("");
		System.out.println( s1.equals(s2) );
		System.out.println( s2.equals(s3) );
		
		System.out.println("-----------------------------");
		/* HasCode() 비교 */
		System.out.println( s1.hashCode()  );
		System.out.println( s2.hashCode()  );
		System.out.println("-----------------------------");
		System.out.println( System.identityHashCode(s1));
		System.out.println( System.identityHashCode(s2));
		
		
		
		
		
		
		/* String Literal */
		System.out.println("-----------------------------");
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = str2;
		
		
		
		System.out.println( str1 == str2 );
		System.out.println( str2 == str3 );
		
		System.out.println("-----------------------------");
		str1 = "Hello2";
		System.out.println( str1 == str2 );
		System.out.println( str2 == str3 );
		
		
		
		
		
				
				

	}

}
