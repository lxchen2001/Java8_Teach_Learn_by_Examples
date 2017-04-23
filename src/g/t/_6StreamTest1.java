package g.t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _6StreamTest1 {

	public static void main( String[] args ) {

		// increaseAgesBy5(getPersons());
		// sumAges(getPersons());
		// findGreatestOfGreaterThan25(getPersons());
		// printAllEndingWithe(getArray());
		// printAllEndingWitheWithSeparater(getArray());
		// collectToObjectEndingWithe(getArray());
		// firstEndingWithe( getArray( ) );
		// firstLengthOfFirstEndingWithe( getArray( ) );
		// firstLengthOfFirstStartingAndEndingWithe( getArray( ) );
		//
		// avg( getArray( ) );
		// sumOfEndingWithe( getArray( ) );
		// avgOfEndingWithe( getArray( ) );
	}

	private static void increaseAgesBy5( List< Person > persons ) {
		System.out.println( persons );
		persons.forEach( p -> p.setAge( p.getAge( ) + 5 ) );
		System.out.println( persons );

	}

	private static void sumAges( List< Person > persons ) {
		int sum = persons.stream( ).mapToInt( p -> p.getAge( ) ).sum( );

		System.out.println( sum );

		int sum2 = persons.stream( ).limit( 3 ) // first three
				.mapToInt( p -> p.getAge( ) ).sum( );

		int sum3 = persons.stream( ).skip( 2 ) // start from 2
				.mapToInt( p -> p.getAge( ) ).sum( );
	}

	private static void findGreatestOfGreaterThan25( List< Person > persons ) {
		int max = persons.stream( ).filter( p -> p.getAge( ) > 25 ).filter( p -> p.getName( ).startsWith( "P" ) ).mapToInt( p -> p.getAge( ) ).max( ).orElse( 0 );

		System.out.println( max );
	}

	private static void printAllEndingWithe( List< String > values ) {

		List< String > value = values.stream( ).filter( v -> v.endsWith( "e" ) ).collect( Collectors.toList( ) );

		System.out.println( value );
	}

	private static void printAllEndingWitheWithSeparater( List< String > values ) {

		String ops = values.stream( ).filter( v -> v.endsWith( "e" ) ).collect( Collectors.joining( " ... " ) );

		System.out.println( ops );
	}

	private static void collectToObjectEndingWithe( List< String > values ) {

		List< Value > ops = values.stream( ).filter( v -> v.endsWith( "e" ) ).map( Value::new ).collect( Collectors.toList( ) );

		System.out.println( ops );
	}

	private static void firstEndingWithe( List< String > values ) {

		String value = values.stream( ).filter( v -> v.endsWith( "e" ) ).findFirst( ).orElse( "" );

		System.out.println( value );
	}

	private static void firstLengthOfFirstStartingAndEndingWithe( List< String > values ) {

		Integer len = values.stream( ).filter( v -> v.endsWith( "e" ) ).filter( v -> v.startsWith( "E" ) ).findFirst( ).map( v -> v.length( ) ).orElse( 0 );

		System.out.println( len );
	}

	private static void firstLengthOfFirstEndingWithe( List< String > values ) {

		Integer len = values.stream( ).filter( v -> v.endsWith( "e" ) ).findFirst( ).map( v -> v.length( ) ).orElse( 0 );

		System.out.println( len );
	}

	private static void avg( List< String > values ) {

		double l = values.stream( ).mapToInt( v -> v.length( ) ).average( ).getAsDouble( );

		System.out.println( l );
	}

	private static void sumOfEndingWithe( List< String > values ) {

		double l = values.stream( ).filter( v -> v.endsWith( "e" ) ).mapToInt( v -> v.length( ) ).sum( );

		System.out.println( l );
	}

	private static void avgOfEndingWithe( List< String > values ) {

		double l = values.stream( ).filter( v -> v.endsWith( "e" ) ).mapToInt( v -> v.length( ) ).average( ).orElse( 0.0d );

		System.out.println( l );
	}

	private static List< String > getArray( ) {
		return Arrays.asList( "Apple", "Banana", "Cat", "Duck", "Eagle", "Frog", "Ganesh", "Heroine", "Ink" );
		// return Arrays.asList( "Appl", "Ink" );
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
