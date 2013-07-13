import java.util.ArrayList;
import java.util.Random;


public class SevenEleven {

	ArrayList<Customer> customers = new ArrayList<Customer>();
	ArrayList<Cup> cups = new ArrayList<Cup>();
	ArrayList<HotDog> rotisserie = new ArrayList<HotDog>();
	
	Customer joe = new Customer("Joe", 10, "Starberry Hot Chocolate");

	public SevenEleven() {
		customers.add(joe);
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Big Gulp", 1.79, 64));
		cups.add(new Cup("Tiny Gulp", 1.62, 32));
		cups.add(new Cup("Tiny Gulp", 1.62, 32));
		cups.add(new Cup("Tiny Gulp", 1.62, 32));
		cups.add(new Cup("Tiny Gulp", 1.62, 32));
		cups.add(new Cup("Tiny Gulp", 1.62, 32));
		cups.add(new Cup("Sip", 1.32, 32));
		cups.add(new Cup("Sip", 1.32, 32));
		cups.add(new Cup("Sip", 1.32, 32));
		cups.add(new Cup("Sip", 1.32, 32));
		cups.add(new Cup("Sip", 1.32, 32));
		cups.add(new Cup("Sip", 1.32, 32));
		cups.add(new Cup("Large", 1.00, 20));
		cups.add(new Cup("Large", 1.00, 20));
		cups.add(new Cup("Large", 1.00, 20));
		cups.add(new Cup("Large", 1.00, 20));
		cups.add(new Cup("Large", 1.00, 20));
		cups.add(new Cup("Large", 1.00, 20));
		cups.add(new Cup("Large", 1.00, 20));
		cups.add(new Cup("Medium", 0.50, 20));
		cups.add(new Cup("Medium", 0.50, 20));
		cups.add(new Cup("Medium", 0.50, 20));
//		cups.add(new Cup("7ElevenDay Cup", 0.00, 8));
		
		rotisserie.add(new HotDog("Big Bite", 2.99));
		rotisserie.add(new HotDog("Big Bite", 2.99));
		rotisserie.add(new HotDog("Big Bite", 2.99));
		rotisserie.add(new HotDog("Big Bite", 2.99));
		
		fillCup(joe, cups.get(new Random().nextInt(cups.size())));
		hotDogGet(joe, rotisserie.get(new Random().nextInt(rotisserie.size())));
		checkOut(joe);
	}
	
	public static void main(String[] args) {
		new SevenEleven();
	}
	
	public void hotDogGet(Customer c, HotDog h) {
		rotisserie.remove(h);
		h.setBun(true);
		c.addToCart(h);
	}
	
	public void fillCup(Customer c, Cup cup) {
		cups.remove(cup);
		cup.setFilled(true);
		c.addToCart(cup);
	}
	
	public void checkOut(Customer c) {
		if(c.getSpareChange() >= c.getCartPrice()) {
		c.setSpareChange(c.getCartPrice());
		} else {
//			returnItems();
		}
		for (int j = 0; j < c.getCart().size(); j++) {
			System.out.println(c.getCartItem(j).getName() + "          \n$" + c.getCartItem(j).getPrice());
		}
		System.out.println("Your total today is: $" + c.getCartPrice());
		System.out.println("Thank you! Have a nice day!");
	}

}
