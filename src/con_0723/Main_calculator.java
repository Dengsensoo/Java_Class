package con_0723;

public class Main_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal1 = new Calculator(20, 10);
		cal1.plus();
		cal1.minus();
		cal1.mul();
		cal1.divid();
		cal1.square();
		
		System.out.println("======================================");
		
		Engine engine = new Engine("가솔린", 2);
		
		Car car = new Car("소나타", 200, engine);
		
		car.carEngineType();
	}

}
