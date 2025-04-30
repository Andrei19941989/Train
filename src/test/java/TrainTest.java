import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TrainTest {
    @Test
    public void TrainTest()
    {
        Train t =new Train("5436F4",9);
        Passenger p =new Passenger("Bob","ASD",4,4000);
        t.addPassenger(p);
        assertEquals(1,t.getPassenger().size());
    }

}
