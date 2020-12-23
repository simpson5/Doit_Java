package simp.run;

import simp.system.*;
import simp.user.*;

public class Run {

	public static void main(String[] args) {
		Run r = new Run();
		Novice x = Create.n();
		x.info();
		x.attack();
		x.setLv(10);
		
		High y = classUp.h(x);
		y.info();
		y.attack();
		y.skill();
		
		y.setLv(20);
		
		Master z = classUp.m(y);
		z.info();
		z.attack();
		z.skill();
	}

}
