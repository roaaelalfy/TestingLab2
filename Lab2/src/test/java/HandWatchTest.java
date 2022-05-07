import static org.junit.Assert.*;
import org.junit.Test;
public class HandWatchTest {
    // EDGE COVERAGE
    @Test
    public void TC1(){
        HandWatch n1 = new HandWatch();
        String inputs = "abadacaad";
        String output = "Current state: Normal_Display, the inner state: Time  Date: 1 - 1 - 2000  Time: 00:00";
        assertEquals( output , n1.handwatch(inputs));
    }
    // EDGE COVERAGE
    @Test
    public void TC2(){
        HandWatch n1 = new HandWatch();
        String inputs = "cbababababa";
        String output = "Current state: Normal_Display, the inner state: Time  Date: 2 - 2 - 2001  Time: 01:01";
        assertEquals( output , n1.handwatch(inputs));
    }

    // ADUP TESTING
    @Test
    public void TC3(){
        HandWatch n1 = new HandWatch();
        String inputs = "cbbabbbaaaa";
        String output = "Current state: Normal_Display, the inner state: Time  Date: 1 - 1 - 2000  Time: 03:02";
        assertEquals( output , n1.handwatch(inputs));
    }
    // ADUP TESTING
    @Test
    public void TC4(){
        HandWatch n1 = new HandWatch();
        String inputs = "caabbabbbbabbba";
        String output = "Current state: Normal_Display, the inner state: Time  Date: 3 - 5 - 2003  Time: 00:00";
        assertEquals( output , n1.handwatch(inputs));
    }
}