package g.t;

import java.util.List;
import java.util.function.Predicate;

public interface IPerson {

	String getName( );

	int getAge( );

	default int sumAges( List< IPerson > persons, Predicate< IPerson > pred ) {
		return persons.stream( ).filter( pred ).mapToInt( p -> p.getAge( ) ).sum( );
	}

}
