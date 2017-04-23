package g.t;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _4PredicateTests {

	public static void main( String[] args ) {

		before( );

		after( );
	}

	private static void before( ) {
		List< Integer > list = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9 );

		// 1
		System.out.println( "Print all numbers:" );
		System.out.println( "Printing... " );
		for ( Integer n: list ) {
			System.out.println( n );
		}
		System.out.println( "Printing Completed !" );

		// 2
		System.out.println( "Print even numbers:" );
		System.out.println( "Printing... " );
		for ( Integer n: list ) {
			if ( n % 2 == 0 ) {
				System.out.println( n );
			}
		}
		System.out.println( "Printing Completed !" );

		// 3
		System.out.println( "Print numbers greater than 3:" );
		System.out.println( "Printing... " );
		for ( Integer n: list ) {
			if ( n > 3 ) {
				System.out.println( n );
			}
		}
		System.out.println( "Printing Completed !" );

	}

	private static void after( ) {
		List< Integer > list = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9 );

		// 1
		System.out.println( "Print all numbers:" );
		evalAndPrint( list, n -> true );

		// 2
		System.out.println( "Print even numbers:" );
		evalAndPrint( list, n -> {
			return n % 2 == 0;
		} );

		// 3
		System.out.println( "Print numbers greater than 3:" );
		evalAndPrint( list, n -> n > 3 );

		// 3
		System.out.println( "Print numbers greater than 3:" );
		evalAndPrint( list, n -> n < 2 );
	}

	public static void evalAndPrint( List< Integer > list, Predicate< Integer > predicate ) {
		System.out.println( "Printing... " );
		for ( Integer n: list ) {

			if ( predicate.test( n ) ) {
				System.out.println( n );
			}
		}
		System.out.println( "Printing Completed !" );
	}
}
