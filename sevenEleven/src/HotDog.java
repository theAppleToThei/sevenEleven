
public class HotDog extends Item {
	boolean inBun = false;
	
	public HotDog(String name, double price) {
		super(name, price);
	}
	
	public void setBun(boolean b) {
		inBun = b;
	}
}
