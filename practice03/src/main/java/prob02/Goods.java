package prob02;

public class Goods {
	 private String product;
	 private int price, num;
	
	public void setProduct(String product){
		this.product = product;
	}	
	public void setPrice(int price){
		this.price = price;
	}
	public void setNum(int num){
		this.num = num;
	}	
	
	public String getProduct(){
		return product;
	}
	public int getPrice(){
		return price;
	}
	public int getNum(){
		return num;
	}
}
