package people;

class Employee extends Person {

	public Double payrate;

	
	public Employee() {
		super();
		System.out.println("(3) Employee's no-arg constructor is invoked");
	}

	
	public Employee(String s) {
		super(s);
		System.out.println(s);
	}
	
	@Override
	public void setName(String n) {
		System.out.println("happened in employee");
		super.name = n;
	}
}