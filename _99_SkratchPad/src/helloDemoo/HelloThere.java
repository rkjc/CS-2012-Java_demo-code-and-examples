package helloDemoo;

public class HelloThere {
	
	static String nik = "jammin";
	
	public static void main(String[] args) {
		System.out.println("-- running --");
		System.out.println(DoingData.add7ToCount());
		// static
		// final 
		
		DoingData zonk = new DoingData();
		System.out.println(DoingData.add7ToCount());

		System.out.println("zonk zcount " + zonk.getZcount());
		
		System.out.println("zonk zcolor " + zonk.color);
		zonk.color = 65;
		System.out.println("zonk zcolor " + zonk.color);
		
		DoingData dd1 = new DoingData();
		DoingData dd2 = new DoingData();
		DoingData dd3 = new DoingData();

		DoingData dd4 = new DoingData();
		DoingData dd5 = new DoingData();

		System.out.println("----------------" );
		DoingData bleen = new DoingData();
		
		System.out.println("bleen zcount " + bleen.getZcount());
		System.out.println("bleen color " + bleen.color);
		
		System.out.println(DoingData.add7ToCount());
		
		
		System.out.println( Integer.MAX_VALUE );
		int bob = Integer.parseInt("87");
		
		
		nik = "jammin";
		
	}
	
	public void funfun() {
		
		String fred = nik + " earth"; 
		
	}

}
