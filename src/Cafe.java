import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cafe {

	private final String name;
	private String address;

	private LocalTime open;
	private LocalTime close;

	private Menu menu;
	
	private List<Visitor> visitors = new ArrayList<>();
	
	private List<Order> orders = new ArrayList<>();
	
	public Cafe(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public LocalTime getOpen() {
		return open;
	}

	public void setOpen(final LocalTime open) {
		this.open = open;
	}

	public LocalTime getClose() {
		return close;
	}

	public void setClose(final LocalTime close) {
		this.close = close;
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public void setMenu(final Menu menu) {
		this.menu = menu;
	}
	
	public List<Visitor> getVisitors() {
		return visitors;
	}
	
	public void addVisitor(final Visitor visitor) {
		visitors.add(visitor);
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public void addOrder(final Order order) {
		orders.add(order);
	}
	
	public void showMenu() {
		if (menu == null) {
			return;
		}
		
		for (final Item item : menu.getItems()) {
			System.out.println(String.format("%s: ціна - %s", item.getName(), item.getPrice()));
		}
	}

}
