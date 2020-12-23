package simp.doit.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("GO");
	}
	
	public void turnOff() {
		System.out.println("STOP");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
