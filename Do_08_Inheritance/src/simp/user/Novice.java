package simp.user;

public class Novice {

	protected String name;
	protected int lv;
	protected int hp;
	protected int point;
	
	public Novice(String name, int lv) {
		this.name = name;
		this.lv =lv;
		hp = lv *10;
		point = lv*5;
	}
	
	public void attack() {
		System.out.println("공격");
	}
	
	public void info() {
		System.out.println(name +","+ lv +","+ hp +","+ point);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
