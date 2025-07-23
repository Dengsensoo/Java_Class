package con_0723;

public class Car {
	
	String name;
	int maxspeed;
	
	Engine engine;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, int maxspeed, Engine engine) {
		super();
		this.name = name;
		this.maxspeed = maxspeed;
		this.engine = engine;
	}
	
	public void carEngineType() {
		System.out.println("엔진타입 : " + engine.type);
		engine.printEngine();
	}
	
	public Engine outputEngine() {
		engine.type = "디젤";
		engine.displacement = 2;
		return engine;
	}
	
	public String[] outputCars() { // 해당 메소드를 만들어준 타입은 String[]
		String[] cars = {"소나타", "아반떼", "K5"};
		
		return cars; // 배열
	}
	
}
