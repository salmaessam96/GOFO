
package Systems;
import java.util.Scanner;

public class Player extends User {
	private User Players[];
	public Player(String name, String userName, String password, String phoneNumber, String email, String address) {
		super(name, userName, password, phoneNumber, email, address);
	}
	public void verify(){
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your username");
		String name=input.next();
		System.out.println("Please enter your password");
		String pass=input.next();
		if(name!=userName&&pass==password) {
			System.out.println("username is incorrect");
			verify();
		}
		if(name==userName&&pass!=password) {
			System.out.println("password is incorrect");
			verify();
		}
		if (name!=userName&&pass!=password){
			System.out.println("username and password are incorrect");
			verify();
		}
		else {
			System.out.println("you've logged-in successfully");
		}
		input.close();
	}
	

}
