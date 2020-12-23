package simp.doit.gameLevel;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("빨리 달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println("점프 높이");
		
	}

	@Override
	public void turn() {
		System.out.println("구르기 몰라");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자다");
	}
}
