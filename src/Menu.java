import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<Item> items = new ArrayList<>();
	
	public List<Item> getItems() {
		return items;
	}
	
	public void addItem(final Item Item) {
		items.add(Item);
	}
	
	public Item findItem(final String itemName) {
		for (final Item item : items) {
			if (item.getName().equals(itemName)) {
				return item;
			}
		}
		
		return null;
	}
	
}
