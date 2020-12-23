package simp.doit.gameLevel;

public class Player {
	//변수 선언. String과 같은 것일까?
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int cnt) {
		level.go(cnt);
	}
}
