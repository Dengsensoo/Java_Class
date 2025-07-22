package java_chapter_06_20250722;

public class Triangle {
	
	// 삼각형의 추상화 -> 속성, 필드, 멤버변수
	int height;
	int width;
	String color;
	
	// 메소드
	// 삼각형 면적
	public double trangleArea() { // 메소드는 소문자로 시작하며, 괄호()를 무조건 해준다.
//		double area = height * width * 0.5;
//		return area;
		return height * width * 0.5;
	}
	
	// 삼각형의 color를 반환
	public String triangleColor() {
		System.out.println("삼각형의 색 : " + color);
		return color;
	}
}
