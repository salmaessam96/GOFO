package Systems;

import java.util.ArrayList;

public class Playground {
	private Owner owner;  
	private double pricePerHour;
	private boolean activated;
	private int id=0;
	private static int count=0;
    private String address;
    public ArrayList<Playground> playgrounds;
    public ArrayList<Playground> availability;
    public Playground(Owner owner) {
        this.owner = owner;
        pricePerHour = 0;
        id = ++count;
        playgrounds = new ArrayList<>();
        availability = new ArrayList<>();
        activated = false;
    }   
    public void setPrice(double price) {
    	pricePerHour=price;
    }
    public double getPrice() {
    	return pricePerHour;
    }
    public void setID(int ID) {
    	id=ID;
    }
    public double getID() {
    	return id;
    }
    public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public boolean isActivated() {
        return activated;
    }
    public void setActivated(boolean activated) {
        activated=true;
    }

}

