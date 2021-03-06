package chapter03;

public class Goods {
	public static int countofGoods;
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public Goods() {
		countofGoods = countofGoods + 1;
	}

	public Goods(String name, int price, int countStock, int countSold) {
		Goods.countofGoods++;

		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		// 데이터 보호
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		System.out.println(
				"name:" + name + ", price:" + price + ", countStock:" + countStock + ", countSold:" + countSold);
	}

	public int calcDiscountPrice(double discountRate) {
		return (int) (discountRate * price);
	}

}
