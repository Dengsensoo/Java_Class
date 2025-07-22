package class_and_object_quiz;

public class Product { //	Product 클래스를 정의하세요.
	
	//	다음 필드를 포함합니다:
	String name; // (상품명)
	int price; // (가격)
	int quantity; // (수량)

	public int getTotalPrice() { // 메서드를 작성하여 총 가격(가격 × 수량)을 반환하세요.
		return price * quantity;
	}
	
	public String product_name() {
		return name;
	}
	
}
