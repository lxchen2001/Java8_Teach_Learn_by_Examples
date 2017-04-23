package g.t;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class _8DateTime {

	public static void main( String[] args ) {
		testZonedDateTime( );
	}

	public static void testLocalDateTime( ) {

		// Get the current date and time
		LocalDateTime currentTime = LocalDateTime.now( );
		System.out.println( "Current DateTime: " + currentTime );

		LocalDate date1 = currentTime.toLocalDate( );
		System.out.println( "date1: " + date1 );

		Month month = currentTime.getMonth( );
		int day = currentTime.getDayOfMonth( );
		int seconds = currentTime.getSecond( );

		System.out.println( "Month: " + month + "day: " + day + "seconds: " + seconds );

		LocalDateTime date2 = currentTime.withDayOfMonth( 10 ).withYear( 2012 );
		System.out.println( "date2: " + date2 );

		// 12 december 2014
		LocalDate date3 = LocalDate.of( 2014, Month.DECEMBER, 12 );
		System.out.println( "date3: " + date3 );

		// 22 hour 15 minutes
		LocalTime date4 = LocalTime.of( 22, 15 );
		System.out.println( "date4: " + date4 );

		// parse a string
		LocalTime date5 = LocalTime.parse( "20:15:30" );
		System.out.println( "date5: " + date5 );
	}

	public static void testZonedDateTime( ) {

		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime.parse( "2007-12-03T10:15:30+05:30[Asia/Kathmandu]" );
		System.out.println( "date1: " + date1 );

		ZoneId id = ZoneId.of( "Europe/Paris" );
		System.out.println( "ZoneId: " + id );

		ZoneId currentZone = ZoneId.systemDefault( );
		System.out.println( "CurrentZone: " + currentZone );
	}

	public static void testPeriod( ) {

		// Get the current date
		LocalDate date1 = LocalDate.now( );
		System.out.println( "Current date: " + date1 );

		// add 1 month to the current date
		LocalDate date2 = date1.plusMonths( 1 );
		System.out.println( "Next month: " + date2 );

		Period period = Period.between( date2, date1 );
		System.out.println( "Period: " + period );
	}

	public static void testDuration( ) {
		LocalTime time1 = LocalTime.now( );
		Duration twoHours = Duration.ofHours( 2 );

		LocalTime time2 = time1.plus( twoHours );
		Duration duration = Duration.between( time1, time2 );

		System.out.println( "Duration: " + duration );
	}

	public void testBackwardCompatability( ) {

		// Get the current date
		Date currentDate = new Date( );
		System.out.println( "Current date: " + currentDate );

		// Get the instant of current date in terms of milliseconds
		Instant now = currentDate.toInstant( );
		ZoneId currentZone = ZoneId.systemDefault( );

		LocalDateTime localDateTime = LocalDateTime.ofInstant( now, currentZone );
		System.out.println( "Local date: " + localDateTime );

		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant( now, currentZone );
		System.out.println( "Zoned date: " + zonedDateTime );
	}
}
