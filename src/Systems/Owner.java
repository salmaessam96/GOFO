package Systems;
import java.util.Scanner;
public class Owner {
	private String username;
	private String password;
	private String phoneNumber;
	private String email;
	public Owner() {
		System.out.println("Please enter your username");
		Scanner input=new Scanner(System.in);
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

}
