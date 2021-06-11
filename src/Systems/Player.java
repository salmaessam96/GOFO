
package Systems;
import java.util.ArrayList;
import java.util.Scanner;

public class Player extends User {
	Scanner input=new Scanner(System.in);
	private ArrayList <Player>players;
	private int number=0; 
	public Player(String name, String username, String password, String phonenumber, String mail) {
		super(name, username, password, phonenumber, mail);
		players = new ArrayList<>();
	}
	
	public void options(){
		int option = 0;
		System.out.println("choose:1-Book a Playground 2-sign-out");
		option=input.nextInt();
		if(option==1)
			book();
		option=0;
	}
	public void book() {
		Playground p=new Playground();
		p.displayplaygrounds();
	    System.out.print("Enter playground id: ");
	    int bookingNumber = input.nextInt();
	    p.searchplaygrounds(bookingNumber);
    }
}