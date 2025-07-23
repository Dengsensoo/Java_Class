package con_0723;

public class Calculator {
	int num1;
	int num2;
	
	public Calculator() {
		
	}

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void plus() {
		System.out.println(num1 + num2);
	}
	public void minus() {
		System.out.println(num1 - num2);
	}
	public void mul() {
		System.out.println(num1 * num2);
	}
	public void divid() {
		System.out.println(num1 / num2);
	}
	public void square() { // 제곱연산
		System.out.println(num1 * num2);
		System.out.println(num1 * num2);
	}
}
