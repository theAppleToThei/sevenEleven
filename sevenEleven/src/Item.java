public abstract class Item {

	String myName;
	double myPrice;
	
	public Item(String itemName, double itemPrice) {
		myName = itemName;
		myPrice = itemPrice;
	}
	
	public String getName() {
		return myName;
	}
	
	public double getPrice() {
		return myPrice;
	}

}
