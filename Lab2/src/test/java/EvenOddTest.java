import static org.junit.Assert.*;
import org.junit.Test;
public class EvenOddTest {

    @Test
    public void TC1(){
        EvenOdd n1 = new EvenOdd();
        assertEquals("Number is even",n1.EvenOddCheck(60));
    }
    @Test
    public void TC2(){
        EvenOdd n2 = new EvenOdd();
        assertEquals("Number is odd",n2.EvenOddCheck(9));
    }
    @Test
    public void TC3(){
        EvenOdd n3 = new EvenOdd();
        assertEquals("Number is odd",n3.EvenOddCheck(-9));
    }
    @Test
    public void TC4(){
        EvenOdd n4 = new EvenOdd();
        assertEquals("Number is even",n4.EvenOddCheck(0));
    }
}