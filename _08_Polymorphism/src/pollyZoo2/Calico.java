package pollyZoo2;

import pollyZoo.Cat;

public class Calico extends Cat {

	
	
	Calico (){
		varstuff = "kaksjhdff";
	}
	
	public String meow() {
		return "meow meow";
	}
	
	
	@Override
	public String toString() {
		return "Calico cat named " + this.getName();
	}
	
}
