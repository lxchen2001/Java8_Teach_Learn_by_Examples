package g.t;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class _5PredicateTests2 {

	public static void main( String[] args ) {

		before( );
		// intermediate( );
		// almostComplete( );
		// after( );

	}

	private static void before( ) {
		List< Person > persons = getPersons( );

		for ( Person person: persons ) {
			if ( person.getAge( ) > 25 ) {
				System.out.println( person );
			}
		}
	}

	private static void intermediate( ) {
		List< Person > persons = getPersons( );

		Predicate< Person > isAgeGt25 = new Predicate< Person >( ) {
			public boolean test( Person t ) {
				return ( t.getAge( ) > 25 );
			};
		};

		for ( Person person: persons ) {
			if ( isAgeGt25.test( person ) ) {
				System.out.println( person );
			}
		}
	}

	private static void almostComplete( ) {
		List< Person > persons = getPersons( );

		Predicate< Person > isAgeGt25 = ( p ) -> {
			return p.getAge( ) > 25;
		};

		printPersons( persons, isAgeGt25 );
	}

	private static void after( ) {
		List< Person > persons = getPersons( );

		// Predicate< Person > isAgeGt25 = ( p ) -> p.getAge( ) > 25;
		// printPersons( persons, isAgeGt25 );

		printPersons( persons, ( p ) -> p.getAge( ) > 25 );
		printPersons( persons, ( p ) -> p.getName( ).startsWith( "R" ) && p.getAge( ) > 30 );
	}

	private static void printPersons( List< Person > persons, Predicate< Person > pred ) {
		persons.forEach( p -> {
			if ( pred.test( p ) ) {
				System.out.println( p );
			}
		} );
	}

	private static List< Person > getPersons( ) {
		List< Person > persons = new ArrayList<>( );
		persons.add( new Person( "Ram", 21 ) );
		persons.add( new Person( "Hari", 29 ) );
		persons.add( new Person( "Shyam", 27 ) );
		persons.add( new Person( "Geeta", 23 ) );
		persons.add( new Person( "Rita", 45 ) );
		persons.add( new Person( "Sita", 34 ) );
		persons.add( new Person( "Ramesh", 50 ) );
		return persons;
	}

}
