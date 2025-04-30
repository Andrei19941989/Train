import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class KassaTest {
    @Test
    public void KassaTest() throws Exception {
         Kassa k =new Kassa(5000);
         Train t =new Train("5436F4",3000);
         Passenger p=new Passenger("Vov","Ter",14,7000);
         k.addTrain(t);
         k.buyTicket("5436F4",p);
         assertEquals(1,t.getPassenger().size());

        }

}
