package con_0723;

public class Circle {
	int radius; // 반지름
	double PI = 3.14; // 파이값 - 상수 = 안 바뀌는 값. 변수와는 대조 됨.
	
	public Circle() {
		
	}

	public Circle(int radius) { // double pI
		this.radius = radius;
	//	PI = pI;
	}
	
	// 입력된 반지름을 가진 원의 면적을 반환하는 메소드 circleArea
	public double circleArea() {
		return radius * radius * PI;
	}
	
}
