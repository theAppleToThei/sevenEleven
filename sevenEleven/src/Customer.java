import java.util.ArrayList;

public class Customer {
	
	String myName;
	double myWallet;
	String myFavoriteFlavor;
	ArrayList<Item> myCart;
	
	public Customer(String name, double wallet, String favoriteFlavor) {
		myName = name;
		myWallet = wallet;
		myFavoriteFlavor = favoriteFlavor;
		myCart = new ArrayList<Item>();
	}
	
	public String getName() {
		return myName;
	}
	
	public double getSpareChange() {
		return myWallet;
	}
	
	public void setSpareChange(double change) {
		myWallet = myWallet + change;
	}
	
	public String favoriteFlavor() {
		return myFavoriteFlavor;
	}
	
	public void addToCart(Item i) {
		myCart.add(i);
	}
	
	public Item getCartItem(int i) {
		return myCart.get(i);
	}
	
	public ArrayList<Item> getCart() {
		return myCart;
	}
	
	public double getCartPrice() {
		double price = 0.00;
		for(int i = 0; i < myCart.size(); i++) {
			price += myCart.get(i).getPrice();
		}
		return price;
	}

}
