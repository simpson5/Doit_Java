package simp.doit.gameLevel;

public class MainBoard {

	public static void main(String[] args) {
		Player p = new Player();
		p.play(1);
		
		AdvancedLevel a = new AdvancedLevel();
		p.upgradeLevel(a);
		p.play(2);
		
		SuperLevel s = new SuperLevel();
		p.upgradeLevel(s);
		p.play(3);
	}

}
