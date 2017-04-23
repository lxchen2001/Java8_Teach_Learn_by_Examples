package g.t;

public class _1ExistingSingleAbstractMethod {

	// 1

	public static void main( String[] args ) {
		before( );
		after( );
	}

	private static void before( ) {

		// create instance
		Runnable r = new Runnable( ) {

			@Override
			public void run( ) {
				System.out.println( "Before Running ... " );

			}
		};

		// run
		new Thread( r ).start( );

	}

	private static void after( ) {
		// create instance
		Runnable r = ( ) -> System.out.println( "After Running ..." );

		// run
		new Thread( r ).start( );
	}
}
