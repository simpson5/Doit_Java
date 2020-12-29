package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return this.userID;
	}
	
	//호출 할때 미루도록!
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없어!");//강제 예외
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디 똑띠 써라");//강제 예외
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		String userID = null;
		
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
