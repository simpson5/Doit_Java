package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className)
			throws FileNotFoundException, ClassNotFoundException// 두 예외 메서드가 호출될 때 처리하도록 미룸
	{
		FileInputStream fls = new FileInputStream(fileName);// File 예외 발생 가능
		Class c = Class.forName(className);//Class 예외 발생 가능
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		//메서드를 호출할때 예외를 처리함.
		try {
			test.loadClass("a.txt", "java.lang.String");
		//하나의 catch문으로 처리
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
