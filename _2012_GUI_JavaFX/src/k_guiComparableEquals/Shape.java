package k_guiComparableEquals;

public abstract class Shape {
	
	private int numSides;
	
	public abstract Double getArea();
	
	public abstract void setColor(String clr);
	
	public int getSides() {
		return numSides;
	};
	
	public void setSides(int sides) {
		this.numSides = sides;
	};
	
}
