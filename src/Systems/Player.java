
package Systems;
import java.util.Scanner;

public class Player {
	private String username;
	private String password;
	private String phoneNumber;
	private String email;
	private String Players[];
	Scanner input=new Scanner(System.in);
	public Player() {
		System.out.println("Please enter your username");
		String name=input.next();
		username=name;
		System.out.println("Please enter your password");
		String pass=input.next();
		password=pass;
		System.out.println("Please enter your phone number");
		String number=input.next();
		phoneNumber=number;
		System.out.println("Please enter your email");
		String mail=input.next();
		email=mail;
}
	public void verify(){
		System.out.println("Please enter your username");
		String name=input.next();
		System.out.println("Please enter your password");
		String pass=input.next();
		if(name!=username&&pass==password) {
			System.out.println("username is incorrect");
			verify();
		}
		if(name==username&&pass!=password) {
			System.out.println("password is incorrect");
			verify();
		}
		if (name!=username&&pass!=password){
			System.out.println("username and password are incorrect");
			verify();
		}
		else {
			System.out.println("you've logged-in successfully");
		}
	}
	

}
