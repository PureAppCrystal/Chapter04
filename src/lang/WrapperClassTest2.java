package lang;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		System.out.println( Character.toLowerCase('a') );
		System.out.println( Character.isDigit('1') );
		System.out.println( Character.isDigit('@') );
		
		String s = "-1234.23";
		if ( s.matches("-?\\d+(\\.)") == false)  {  //-?  : - 가 있든지 없든지 , (\\.) : 소수 
			System.out.println("숫자가 아닙니다.");
		} else {
			System.out.println("숫자입니다");
			int i = Integer.parseInt(s);
		}
		
		
		System.out.println( isNumeric(s) );
		
		
		
		/*
		try {
			int i = Integer.parseInt( s );
		} catch ( NumberFormatException e ) {
			System.out.println("숫자가 아닙니다");
		}
		*/
		
		System.out.println( Integer.parseInt("1234", 10) );
		System.out.println( Integer.parseInt("A", 16) );
		System.out.println( Integer.toBinaryString( 255 ) );
		System.out.println( Integer.toHexString( 255 ) );
		System.out.println( Double.parseDouble("44.13e-16") );
		
		System.out.println( String.valueOf(123) );
		
		
		
		
		
		
		
	}

	public static boolean isNumeric(String s) {  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
