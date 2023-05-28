import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Cafe cafe = new Cafe("Mirage");
		cafe.setAddress("Львів, вулиця Липинського 2А");
		cafe.setOpen(LocalTime.of(8, 0));
		cafe.setOpen(LocalTime.of(23, 0));
		
		final Menu menu = new Menu();
		menu.addItem(new Dish("Панкейки", 120));
		menu.addItem(new Dish("Салат Цезар", 240));
		menu.addItem(new Dish("Сирники", 140));
		menu.addItem(new Dish("Піца", 180));
		
		final Drink beer = new Drink("Пиво", 45);
		beer.setVolume(0.3);
		
		final Drink juice = new Drink("Сік", 45);
		juice.setVolume(0.5);
		
		final Drink tea = new Drink("Чай", 45);
		tea.setVolume(0.4);
		
		menu.addItem(beer);
		menu.addItem(juice);
		menu.addItem(tea);
		
		cafe.setMenu(menu);

		boolean nextVisitor = true;

		while (nextVisitor) {
			Scanner scanner = new Scanner(System.in);
			final Visitor visitor = new Visitor();
			Order order = null;
			
			System.out.println("Введіть своє ім'я");
	        visitor.setName(scanner.nextLine());

	        System.out.println("Введіть суму доступних грошей");
	        visitor.setAmountOfMoney(scanner.nextDouble());
	        
	        System.out.println("Введіть знижку");
	        visitor.setDiscount(scanner.nextInt());
	        
	        System.out.println();
	        cafe.showMenu();
	        System.out.println();
	        
	        System.out.println("Будете щось замовляти true or false ?");
	        boolean hasOrder = scanner.nextBoolean();
	        if (hasOrder) {
	        	order = new Order(visitor);
	        	
	        	cafe.addVisitor(visitor);
	        	cafe.addOrder(order);
	        }
	        
			while (hasOrder) {
				scanner = new Scanner(System.in);
				
				System.out.println("Що бажаєте замовити ?");
				final String itemName = scanner.nextLine();
				final Item item = menu.findItem(itemName);

				if (item == null) {
					System.out.println(String.format("%s не знайдено в меню", itemName));
				} else {
					order.addItem(item);
				}
				
	        	System.out.println("Будете щось замовляти true or false ?");
	        	hasOrder = scanner.nextBoolean();
	        }
	        
	        System.out.println("Є ще відвідувачі true or false ?");
	        nextVisitor = scanner.nextBoolean();
		}

		System.out.println("Have nice day");
	}
	
}
