package method;

public class Calculator {
	
	public int add(int num1, int num2) { // 메소드에도 매개 변수 선언 할 수 있다.
		return num1 + num2;
	}
	
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public int divid(int num1, int num2) {
		return num1 / num2;
	}
	
	public int total(int[] numbers) {
		int total = 0;
		for(int num : numbers) {
			total = total + num;
		}
		return total;
	}
	
	public int total2(int ...numbers) {
		int total = 0;
		for(int num : numbers) {
			total = total + num;
		}
		return total;
	}
	
}
