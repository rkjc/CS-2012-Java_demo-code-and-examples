package pollyZoo;

public class Cat extends Feline {

	protected String varstuff = "default";
	
	public void printStuff() {
		System.out.println(varstuff);
	}
	
	
	public void printMeow() {
		System.out.println("MEOW!");
	}
}
