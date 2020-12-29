package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		FileInputStream fls = null;
		
		try {
			fls = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} finally {
			if(fls != null) {
				try {
					fls.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("항상!");
		}
		System.out.println("여기 수행");
	}
}
