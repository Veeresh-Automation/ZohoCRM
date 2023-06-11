package UI_Elements;

public enum Locater {

	Login("login"),
	Email_ID("login_id"),
	Next_Btn("nextbtn"),
	Password("(//input[@id='password'])[1]"),
	Submit_btn("nextbtn");
	
	
	private final String loc;
	
	Locater(String loc){
		this.loc=loc;
	}
	
	public String getLoc() {
		return loc;
	}
	
	
}
