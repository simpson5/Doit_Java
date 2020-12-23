package simp.doit.gameLevel;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println("점프 높이 아주");
		
	}

	@Override
	public void turn() {
		System.out.println("구르기 얍");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("고급자다");
	}
		
	
}
