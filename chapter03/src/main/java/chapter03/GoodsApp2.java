package chapter03;

import mypackage.Goods2;

public class GoodsApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods2 goods2 = new Goods2();

		// public
		goods2.name = "camera";

		// protected
		// *중요: 자식 접근이 가능
		// goods2.price = 10000;

		// default
		// goods2.countStock = 10;

		// private
		// goods2.countSold = 10;
	}

}
