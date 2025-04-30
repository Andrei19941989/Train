import java.util.ArrayList;
import java.util.List;

public class Train {
    private String number;
    private int capacity;
    private List<Passenger> passenger=new ArrayList<>();
    public Train(String number,int capacity)
    {
        this.number=number;
        this.capacity=capacity;
    }

    public String getNumber()
    {
        return number;
    }
    public List<Passenger> getPassenger()
    {
        return passenger;
    }
    public void addPassenger(Passenger p){passenger.add(p);}
}
