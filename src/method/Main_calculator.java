package method;

public class Main_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal1 = new Calculator();
		
		int resultAdd = cal1.add(20, 10);
		System.out.println(resultAdd);
		
		int resultMinus = cal1.minus(20, 10);
		System.out.println(resultMinus);
		
		int resultMul = cal1.mul(20, 10);
		System.out.println(resultMul);
		
		int resultDivid = cal1.divid(20, 10);
		System.out.println(resultDivid);
		
		int[] arr1 = {10, 20, 30};
		cal1.total(arr1);
		System.out.println(cal1.total(arr1));
		
		cal1.total2(10, 20, 30);
		System.out.println();
		
	}

}
