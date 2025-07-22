package constructor;

public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 가로 10 세로 20 -> 면적 출력
		Rectangle rect = new Rectangle();
		// 객체 선언 -> 생성자 호출
		rect.height = 20;
		rect.width = 10;
		int rectArea = rect.rectArea();
		System.out.println(rectArea);
		
		Rectangle rec2 = new Rectangle(100, 200);

	}

}
