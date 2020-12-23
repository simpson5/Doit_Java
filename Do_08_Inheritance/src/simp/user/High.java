package simp.user;

public class High extends Novice {
	protected String weapon;
	
	public High(String name,int lv) {
		super(name, lv);
		hp = lv*15;
		point = lv*7;
		weapon = "검";
	}
	
	public void skill() {
		System.out.println("베기");
	}
	
	public void info() {
		super.info();
		System.out.println(weapon);
	}
}
