package Systems;

import java.util.Scanner;

public class User {
	protected String name;
	protected String userName;
	protected String password;
	protected String phoneNumber;
	protected String email;
	protected String address;
	public User(String name, String userName, String password, String phoneNumber, String email, String address) {
		this.name=name;
		this.userName=userName;
		this.password=password;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.address=address;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setPhoneNumber(String pn) {
		phoneNumber=pn;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
}
