package simp.user;

public class Master extends High {
	private int mana;
	
	public Master(String name ,int lv) {
		super(name, lv);
		hp = lv * 20;
		point = lv * 10;
		weapon = "성검";
		mana = 100;	
	}
	
	public void skill() {
		System.out.println("검기");
	}
}
