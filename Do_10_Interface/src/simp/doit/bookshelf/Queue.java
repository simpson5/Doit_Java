package simp.doit.bookshelf;

/**
 *	처을 들어간 자려부터 꺼내어 쓰는 것을 Queue 자료 구조, 선착순
 */
public interface Queue {
	void enQueue(String title); //배열의 맨 마지막에 추가
	String deQueue(); //배열의 맨 처음 항목 반환
	int getSize(); //현재 Queue에 있는 갯수 반환
}
