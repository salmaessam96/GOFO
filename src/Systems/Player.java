
package Systems;
import java.util.Scanner;

public class Player extends User {
	Scanner input=new Scanner(System.in);
	private User [] player;
	private int number=0; 
	public Player() {
		addplayer();
	}
	public void addplayer() {
		User b = new User();                    
	    player[number] = b;
	    number++;
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
