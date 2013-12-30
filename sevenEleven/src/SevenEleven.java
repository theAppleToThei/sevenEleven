import java.util.ArrayList;
import java.util.Random;


public class SevenEleven {

	ArrayList<Customer> customers = new ArrayList<Customer>();
	ArrayList<Cup> cups = new ArrayList<Cup>();
	ArrayList<HotDog> rotisserie = new ArrayList<HotDog>();
	
	Customer joe = new Customer("Joe", 10, "Starberry Hot Chocolate");
	Customer mark = new Customer("Mark", 30, "Coke");
	Customer rob = new Customer("Rob", 0, "Revenge");

	public SevenEleven() {
		customers.add(joe);
		stockStore();
		
		fillCup(joe, cups.get(new Random().nextInt(cups.size())));
		hotDogGet(joe, rotisserie.get(new Random().nextInt(rotisserie.size())));
		checkOut(joe);
		
		customers.add(mark);
		hotDogGet(mark, rotisserie.get(new Random().nextInt(rotisserie.size())));
		checkOut(mark);
		
		customers.add(rob);
		hotDogGet(rob, rotisserie.get(new Random().nextInt(rotisserie.size())));
		steal(rob);
	}

	private void stockStore() {
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
		
		//Coming soon: Lotto tickets
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

		printReceipt(c);
	}
	
	public void steal(Customer c) {
		System.out.println("--STOLEN ITEM DETECTED--\n--ACTIVATING ALARM--");
		customers.remove(c);
	}

	private void printReceipt(Customer c) {
		System.out.println("7/Eleven\n");
		System.out.println("Customer: " + c.getName());
				for (int j = 0; j < c.getCart().size(); j++) {
					System.out.println(c.getCartItem(j).getName() + "          \n$" + c.getCartItem(j).getPrice());
				}
				System.out.println("Your total today is: $" + c.getCartPrice());
				System.out.println("Thank you! Have a nice day!\n\n----------------------\n");
	}

}
