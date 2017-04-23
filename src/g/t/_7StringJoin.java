package g.t;

import java.util.Arrays;
import java.util.List;

public class _7StringJoin {
	public static void main( String[] args ) {
		System.out.println( String.join( ", ", getArray( ) ) );
	}

	private static List< String > getArray( ) {
		return Arrays.asList( "Apple", "Banana", "Cat", "Duck", "Eagle", "Frog" );
	}

}
