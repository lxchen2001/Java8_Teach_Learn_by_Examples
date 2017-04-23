package g.t;

public class _2CustomSAMTests {

	// 2

	public static void main( String[] args ) {

		noArgs( );
		withArgs( );
	}

	private static void noArgs( ) {

		SingleAbstractMethod sam = ( ) -> {
			System.out.println( "Doing something..... " );
		};

		sam.doSomething( );
	}

	private static void withArgs( ) {

		SingleAbstractMethodWithArgs sam = ( s1, s2 ) -> {
			System.out.println( "Result is : " + ( s1.length( ) + s2.length( ) ) );
		};

		sam.doSomething( "hello", "hi" );
	}

}
