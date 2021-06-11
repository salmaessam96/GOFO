package Systems;

public class Owner extends User {
	private int number=0, id=0;
	private User [] owners;
	private Playground[] playgrounds;
	public Owner(String name, String username, String password, String phonenumber, String mail) {
		super(name, username, password, phonenumber, mail);
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