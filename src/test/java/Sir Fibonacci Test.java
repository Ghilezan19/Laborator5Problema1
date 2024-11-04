import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Pb1.PerecheNumere;

class SFibonacci {

    @Test
    void SFibonacci()
    {
        PerecheNumere per1 = new PerecheNumere(5, 8);
        PerecheNumere per2 = new PerecheNumere(13, 21);
        PerecheNumere per3 = new PerecheNumere(6, 10);

        assertTrue(per1.suntFibonacciConsecutive());
        assertTrue(per2.suntFibonacciConsecutive());
        assertFalse(per3.suntFibonacciConsecutive());
    }
}
