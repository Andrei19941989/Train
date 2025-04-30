import java.util.ArrayList;
import java.util.List;

public class Kassa {
    private double price;

    public Kassa(double price) {
        this.price = price;
    }

    private List<Train> train = new ArrayList<>();

    public void addTrain(Train t) {
        train.add(t);
    }

    public void buyTicket(String number, Passenger p) throws Exception {
        for (int i = 0; i < train.size(); i++) {
            if (train.get(i).getNumber().equals(number)) {
                if (p.getCoins() >= price) {

                    train.get(i).addPassenger(p);
                }
                else
                {
                    throw new Exception("Error");
                }

            }
        }
    }
}
