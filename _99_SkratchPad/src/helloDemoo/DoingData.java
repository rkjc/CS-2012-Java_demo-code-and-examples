package helloDemoo;

public class DoingData {
	
	public static final int PI = 3;
	
	private static int zcount = 0;

	public int color = 7;

	public DoingData() {
		zcount++;
	}
	
	public int getZcount() {
		return zcount;
	}

	public static int add7ToCount() {	
		int temmp = zcount + 7;
		return temmp;
	}
}
