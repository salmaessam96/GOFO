package Systems;

import java.util.Scanner;

public class Playground {
	private User owner;  
	private double pricePerHour;
	private int id=0;
	private static int count=0;
	private String availableTime;
    private String address;
    private Playground []Playgrounds;
    public Playground() {
    	System.out.println("Please enter playground address");
		Scanner input=new Scanner(System.in);
		String address=input.next();
		this.address=address;
		System.out.println("Please enter the price per hour");
		double price=input.nextDouble();
		pricePerHour=price;
		System.out.println("Please enter the times available");
		String time=input.next();
		availableTime=time;
		input.close();
    }
    public Playground(User owner) {
        this.owner = owner;
        count++;
        addPlayground();
    }   
    public void addPlayground() {
		Playground b = new Playground();                    
	    Playgrounds[id] = b;
	    id++;
	}
    public void displayplaygrounds() {
    	for(int i=0;i<id;i++) {
    		System.out.println(Playgrounds[i].toString()+"\n");
    	}
    }
    public void searchplaygrounds(int n) {
    	for(int i=0;i<id;i++) {
    		if(Playgrounds[i].id==n) {
    			System.out.println(Playgrounds[i].toString()+"\n");
    		}
    		else {
    	        System.out.println("Playground id is invalid!");
    	        return;
    		}
    	}
    }
    public void setPrice(double price) {
    	pricePerHour=price;
    }
    public double getPrice() {
    	return pricePerHour;
    }
    public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	 public void settime(String availableTime) {
		this.availableTime=availableTime;
	}
	public String gettime() {
		return availableTime;
	}
}

