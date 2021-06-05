
package Systems;
import java.util.ArrayList;
import java.util.Scanner;

public class Player extends User {
	Scanner input=new Scanner(System.in);
	public ArrayList<User> players;
	private ArrayList<Playground> playgrounds;
	public Player(String name, String userName, String password, String phoneNumber, String email, String address) {
		super(name, userName, password, phoneNumber, email, address);
		players = new ArrayList<>();
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
			options();
		}
	}
	public void options(){
		String option = "";
		System.out.println("choose:1-Book a Playground 2-sign-out");
		option=input.next();
		while(option!="2") {
			book();
			option="";
		}
	}
	public void book() {
    System.out.print("Enter playground id: ");
    int bookingNumber = input.nextInt();
    Playground playground = null;
    for (Playground pg : playgrounds) {
        if (pg.getID() == bookingNumber) {
            playground = pg;
            break;
        }
    }
    if (playground == null) {
        System.out.println("Playground booking number is invalid!");
        return;
    }
    }
}
