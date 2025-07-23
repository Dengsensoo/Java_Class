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
	
}
