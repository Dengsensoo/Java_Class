package overloading_quiz;

public class PrinterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer pri = new Printer();
		// 메소드 오버로딩 호출
		pri.println(100);
		pri.println("안녕!");
		pri.println(3.14);
		pri.println(true);
	}

}
