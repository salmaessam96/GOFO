package Systems;
import java.util.ArrayList;
public class Owner extends User {
	public ArrayList<User> Owners;
	public ArrayList<Playground> playgrounds;
	public Owner(String name, String userName, String password, String phoneNumber, String email, String address) {
		super(name, userName, password, phoneNumber, email, address);
		Owners = new ArrayList<>();
		playgrounds=new ArrayList<>();
	}
	public void addPlayground(Playground temp) {
        playgrounds.add(temp);
    }
	public ArrayList<Playground> getPlaygrounds() {
        return playgrounds;
    }
	public String getBookings() {
        String res = "";
        for (int i = 0; i < playgrounds.size(); i++) {
            res += playgrounds.get(i).toString();
        }
        return res;
    }
    public void showBookings()
    {
        if (playgrounds.size()==0)
        {
            System.out.println("There is no Bookings now");
            return;
        }
        else {
        for (int i = 0 ; i<playgrounds.size();i++)
            System.out.println(playgrounds.get(i).toString());
        }
    }
}
