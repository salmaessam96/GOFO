package Systems;

public class Owner extends User {
	private int number=0, id=0;
	private User [] owners;
	private Playground[] playgrounds;
	public Owner() {
		addowner();
	}
	public void addowner() {
		User b = new User();                    
	    owners[number] = b;
	    number++;
	}
	public void add() {
		playgrounds[id]=new Playground(owners[number]);
		id++;
	}
	public String getBookings() {
        String res = "";
        for (int i = 0; i < id; i++) {
            res += playgrounds[i].toString();
        }
        return res;
    }
    public void showBookings()
    {
        if (number==0)
        {
            System.out.println("There is no Bookings now");
            return;
        }
        else {
        for (int i = 0 ; i<id;i++)
            System.out.println(playgrounds[i].toString());
        }
    }
}
