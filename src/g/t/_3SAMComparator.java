package g.t;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _3SAMComparator {

	// 3

	public static void main( String[] args ) {

		before( getArray( ) );
		System.out.println( );
		after( getArray( ) );
	}

	private static void after( List< String > values ) {

		Comparator< String > comp = ( o1, o2 ) -> {
			return o1.length( ) - o2.length( );
		};

		Collections.sort( values, comp );

		print( values );

	}

	private static void before( List< String > values ) {

		Collections.sort( values, new Comparator< String >( ) {

			@Override
			public int compare( String o1, String o2 ) {
				return o1.length( ) - o2.length( );
			}

		} );

		print( values );

	}

	public static void print( List< String > values ) {
		System.out.println( );
		values.forEach( System.out::print );
		values.forEach( _3SAMComparator::printWithSpace );
	}

	private static void printWithSpace( String str ) {
		System.out.print( str + " " );
	}

	private static List< String > getArray( ) {
		return Arrays.asList( "Apple", "Banana", "Cat", "Duck", "Eagle", "Frog" );
	}

}
