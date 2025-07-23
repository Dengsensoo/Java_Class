package method;

public class Rectangle { 
	int width;
	int height;
	String color;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	// 메소드 오버로딩 - 매개 변수를 다르게 하거나 타입을 다르게 하면 오버로딩이고, 다양하게 할 수 있다.
	public int rectArea() {
		return width * height;
	}
	
	public int rectArea(int width, int height) {
		return width * height;
	}
	
	public int rectArea(int width) {
		return width * this.height;
	}
	
}
