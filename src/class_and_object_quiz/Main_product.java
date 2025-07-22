package class_and_object_quiz;

public class Main_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	main 메서드에서 상품을 생성하고 총 가격을 출력하세요.
		Product pro1 = new Product(); 
		pro1.name = "수박 10개";
		pro1.price = 20000;
		pro1.quantity = 10;
		String pro_name = pro1.product_name();
		System.out.println(pro_name);
		
		int total = pro1.getTotalPrice();
		System.out.println("총 가격: " + total);
		//	[실행 예시]
		//	총 가격: 200000
		
	}

}
