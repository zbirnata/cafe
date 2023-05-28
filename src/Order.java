import java.util.ArrayList;
import java.util.List;

public class Order {

	private final Visitor visitor;
	private List<Item> items = new ArrayList<>();

	public Order(final Visitor visitor) {
		this.visitor = visitor;
	}
	
	public Visitor getVisitor() {
		return visitor;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void addItem(final Item item) {
		if (visitor.getAmountOfMoney() >= item.getPrice()) {
			items.add(item);
			
			visitor.setAmountOfMoney(visitor.getAmountOfMoney() - item.getPrice());
	
			System.out.println("Покупка успішна");
			System.out.println("Залишок грошей -" + visitor.getAmountOfMoney() + "грн");
		} else {
			System.out.println("Не достатньо коштів !");
		}
	}

}
