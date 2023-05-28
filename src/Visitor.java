public class Visitor {
	
	private static int MIN_DISCOUNT_VALUE = 0;
	private static int MAX_DISCOUNT_VALUE = 100;
	
	private String name;
	private double amountOfMoney;
	private int discount;

	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public double getAmountOfMoney() {
		return amountOfMoney;
	}
	
	public void setAmountOfMoney(final double amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		if (MIN_DISCOUNT_VALUE < discount && discount < MAX_DISCOUNT_VALUE) {
			this.discount = discount;
		} else {
			System.out.println(String.format(
					"Знижка повинна знаходитися в проміжку між %s - %s", 
					MIN_DISCOUNT_VALUE, 
					MAX_DISCOUNT_VALUE));
		}
	}
	
}
