package polyApp;

public class PolymorphMain {

	public static void main(String[] args) {
		
		//myMethod1( new Student() );
		//myMethod1( new Person() );
		//myMethod1( new Object() );
		//myMethod1( new Integer("56") );
		Object obStu1 = new Student();
		Object obPer1 = new Person();
		
		GraduateStudent zork = new GraduateStudent();
		Person pers1 = new Person();
		
		myMethod1( pers1 );
		myMethod1( zork );
		
	}


	public static void myMethod1( Person myob ) {
		System.out.println("myMethod1 Person");
		System.out.println(myob.toString());
	}
	
	public static void myMethod1( Student myob ) {
		System.out.println("myMethod1 Student");
		System.out.println(myob.toString());
	}
}

