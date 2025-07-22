package class_and_object_quiz;

public class Main_temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (설계도 클래스의 명칭) (변수) = new (설계도)(); - 객체 선언
		Temperature cel = new Temperature();
		cel.celsius = 30;
		
		double conversion = cel.toFahrenheit();
		
		System.out.println("화씨 온도: " + conversion);
		// [실행 예시]
		//	화씨 온도: 77.0
		

	}

}
