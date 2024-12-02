package pollyZoo;

public class Collie extends Canine {
	
	public String bark() {
		return "bark bark";
	}
	
	@Override
	public String toString() {
		return "Collie dog named " + this.getName();
	}
}
