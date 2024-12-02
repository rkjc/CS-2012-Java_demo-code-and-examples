package people;

public class Person extends Object {

	public String name;

	public Person() {
		super();	
		System.out.println("(1) Person's no-arg constructor is invoked");	
	}
	
	public Person(String name) {
		super();
		this.name = name;
		System.out.println("(1) Person's no-arg constructor is invoked");	
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		System.out.println("happened in person");
		this.name = n;
	}

	public void setName(int n) {
		if (n == 1) {
			this.name = "one";
		} else {
			this.name = "bob";
		}
	}
	
	@Override
	public String toString() {
		return name;
	}

}