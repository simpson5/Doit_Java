package simp.doit.calc;

public interface Calc {
	// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변함
	double PI = Math.PI;
	int ERR = -99999999;
	
	// 인터페이스 에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
