package Systems;
import Systems.Playground;

public class administrator {
	private String userName,password;
	public administrator(String userName, String password) {
		this.userName=userName;
		this.password=password;
	}
	public void setUserName(String username) {
		userName=username;
	}
	public String getUserName() {
		return userName;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	public String getpassword() {
		return password;
	}
    public void approve(Playground playground) {
        playground.setActivated(true);
    }
}
