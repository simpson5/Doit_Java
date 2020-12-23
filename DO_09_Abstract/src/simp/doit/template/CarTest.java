package simp.doit.template;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new AIcar();
		myCar.run();
		
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
