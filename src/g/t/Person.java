package g.t;

public class Person implements IPerson {

	private String	name;
	private int		age;

	public Person( String name, int age ) {
		super( );
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString( ) {
		return name + " : " + age;
	}

	@Override
	public String getName( ) {
		return name;
	}

	@Override
	public int getAge( ) {
		return age;
	}

	public void setAge( int age ) {
		this.age = age;
	}
}