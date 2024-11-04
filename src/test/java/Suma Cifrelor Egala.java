import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Pb1.PerecheNumere;
class SCE {

    @Test
    void SCE() {
        PerecheNumere per1 = new PerecheNumere(123, 321);
        PerecheNumere per2 = new PerecheNumere(55, 64);
        PerecheNumere per3 = new PerecheNumere(19, 27);

        assertTrue(per1.sumaCifrelorEsteEgala());
        assertTrue(per2.sumaCifrelorEsteEgala());
        assertFalse(per3.sumaCifrelorEsteEgala());
    }
}
