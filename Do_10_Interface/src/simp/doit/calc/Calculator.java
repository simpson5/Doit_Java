package simp.doit.calc;

//implements : 클레스에서 인터페이스를 구현.
public abstract class Calculator implements Calc {
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		else {
			return Calc.ERR;
		}
	}
}
