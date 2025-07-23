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
		
		System.out.println("==================================================");
		
		// 생성자 오버로딩
		Rectangle rec1 = new Rectangle(20, 10, "blue");
		Rectangle rec2 = new Rectangle(100, 200);
		Rectangle rec3 = new Rectangle();
		
		// 메소드 오버로딩
		int area1 = rec1.rectArea();
		int area2 = rec1.rectArea(200);
		int area3 = rec1.rectArea(30, 40);
		
		System.out.println(area1); // 200
		System.out.println(area2); // 2000
		System.out.println(area3); // 1200
		
	}

}
