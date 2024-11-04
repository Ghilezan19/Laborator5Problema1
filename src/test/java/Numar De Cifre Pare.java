import Pb1.PerecheNumere;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NDCP {

    @Test
    void NDCP() {
        PerecheNumere per1 = new PerecheNumere(246, 842);
        PerecheNumere per2 = new PerecheNumere(123, 456);
        PerecheNumere per3 = new PerecheNumere(802, 208);

        assertTrue(per1.numarCifrePareEgale());
        assertFalse(per2.numarCifrePareEgale());
        assertTrue(per3.numarCifrePareEgale());
    }
}
