import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Pb1.PerecheNumere;
class CMMMC {

    @Test
    void CMMMC() {
        PerecheNumere per1 = new PerecheNumere(6, 8);
        PerecheNumere per2 = new PerecheNumere(3, 5);
        PerecheNumere per3 = new PerecheNumere(7, 14);

        assertEquals(24, per1.CelMaiMicMultipluComun());
        assertEquals(15, per2.CelMaiMicMultipluComun());
        assertEquals(14, per3.CelMaiMicMultipluComun());
    }
}
