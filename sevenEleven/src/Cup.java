
public class Cup extends Item{
	int mySize;
	Boolean isFilled = false;
	
	public Cup(String cupName, double cupPrice, int cupSize) {
		super(cupName, cupPrice);
		mySize = cupSize;
	}
	
	public int getCupSize() {
		return mySize;
	}
	
	public boolean getFilled() {
		return isFilled;
	}
	
	public void setFilled(Boolean f) {
		isFilled = f;
	}
}
