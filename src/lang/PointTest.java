package lang;

public class PointTest {
	public static void main(String[] args) {
		Point p = new Point();
		System.out.println( p.getClass().getName() );  	//패키지 이름, 클래스 이름
		System.out.println( p.hashCode() );				//참조값.
		System.out.println( p.toString() );				//getClass().getName() + "@" + hashCode()
		System.out.println( p );						
		
		
		System.out.println("-----------------------------");
		/* String 객체와 비교 */
		String s = new String( "Hello" );
		System.out.println( s.getClass().getName() );  	//패키지 이름.클래스 이름
		System.out.println( s.hashCode() );				//참조값.
		System.out.println( s.toString() );				//안의 내용을 출력하도록 override 되있는거임.
		System.out.println( s );
		
		
		System.out.println("-----------------------------");
		/* String 객체와 비교 */
		Integer i = new Integer( 5 );
		System.out.println( i.getClass().getName() );  	//패키지 이름.클래스 이름
		System.out.println( i.hashCode() );				//참조값.
		System.out.println( i.toString() );				//안의 내용을 출력하도록 override 되있는거임.
		System.out.println( i );
	
		
		
	}
}
