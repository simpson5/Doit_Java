package simp.doit.template;

public class AIcar extends Car {
	@Override
	public void drive() {
		System.out.println("자율 주행");
		System.out.println("알아서 감");
		
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춤");
		
	}
	
}
