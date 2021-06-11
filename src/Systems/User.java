package Systems;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	ArrayList<Player> players;
	ArrayList<Owner> owners;
	protected String name;
	protected String userName;
	protected String password;
	protected String phoneNumber;
	protected String email;
	protected String type;
	Scanner input=new Scanner(System.in);
	public User(){
		
	}
	public User(String name,String username, String password, String phonenumber,String mail ) {
		this.name=name;
		userName=username;
		this.password=password;
		phoneNumber=phonenumber;
		email=mail;
	}
	public void addUser() {
		System.out.println("are you a player or owner?");
		String type=input.next();
		this.type=type;
		System.out.println("Please enter your name");
		String name=input.next();
		this.name=name;
		System.out.println("username:");
		String username=input.next();
		userName=username;
		System.out.println("password:");
		String password=input.next();
		this.password=password;
		System.out.println("enter your phone number");
		String number=input.next();
		phoneNumber=number;
		System.out.println("enter your e-mail");
		String mail=input.next();
		email=mail;
		if (type.equalsIgnoreCase("1")) {
            players.add(new Player(name, username,password, number, mail));
		}
            if (type.equalsIgnoreCase("2")) {
                owners.add(new Owner(name, username,password, number, mail));     
		}
	}
	public void login() {
		System.out.println("Please enter your username");
		String name=input.next();
		System.out.println("Please enter your password");
		String pass=input.next();
		verify(name,pass);
	}
	public void verify(String username, String pass){
		if(username!=userName&&pass==password) {
			System.out.println("username is incorrect, try again");
			login();
		}
		else if(name==userName&&pass!=password) {
			System.out.println("password is incorrect, try again");
			login();
		}
		if (name!=userName&&pass!=password){
			System.out.println("username and password are incorrect, try again");
			login();
		}
		else {
			System.out.println("you logged-in successfully");
		}
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
	public void settype(String type) {
		this.type=type;
	}
	public String gettype() {
		return type;
	}
}
