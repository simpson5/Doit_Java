package simp.doit.template;

public class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("직접");
		System.out.println("수동 감");
		
	}

	@Override
	public void stop() {
		System.out.println("수동 멈춤");
		
	}
}
