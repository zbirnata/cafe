public class Drink extends Item {

	private double volume;
	
	public Drink(final String name, final double price) {
		super(name, price);
	}

	public double getVolume() {
		return volume;
	}
	
	public void setVolume(final double volume) {
		this.volume = volume;
	}
	
}
