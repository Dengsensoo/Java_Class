package quiz;

//1. 책의 이름과 가격을 필드로 가지는 Book 클래스를 만드시오. 

public class Book {
	//단 생성자에서 두 필드를 초기화 하도록 만들고, 책의 이름과 가격을 출력하는 printInfo 메서드를 포함하시오.
	String name;
	int price;
	
	public Book() {
		
	}
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String printInfo1() {
		return name;
	}
	
	public int printInfo2() {
		return price;
	}
}
