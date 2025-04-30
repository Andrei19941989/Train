import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {
    @Test
    public void coinsTest()
    {
        Passenger p =new Passenger("Andrei","Orlov",30,3000);
        assertEquals(3000,p.getCoins());



    }
}
