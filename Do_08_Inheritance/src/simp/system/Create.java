package simp.system;

import java.util.Scanner;

import simp.user.Novice;

public class Create {
	
	public static Novice n() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		Novice n = new Novice(name,1);	
		return n;
	}
}
