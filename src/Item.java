public abstract class Item {

	private final String name;

	private final double price;
	
	public Item(final String name, final double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
}
