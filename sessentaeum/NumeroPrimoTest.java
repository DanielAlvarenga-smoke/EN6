package sessentaeum;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroPrimoTest {

    @Test
    public void teste1_NumeroPrimo() {
        assertTrue("2 é um número primo.", NumeroPrimo.ehPrimo(2));
    }

    @Test
    public void teste2_NumeroPrimo() {
        assertTrue("3 é um número primo.", NumeroPrimo.ehPrimo(3));
    }

    @Test
    public void teste3_NumeroPrimo() {
        assertTrue("7 é um número primo.", NumeroPrimo.ehPrimo(7));
    }

    @Test
    public void teste4_NumeroPrimo() {
        assertTrue("13 é um número primo.", NumeroPrimo.ehPrimo(13));
    }

    @Test
    public void teste5_NumeroPrimo() {
        assertTrue("19 é um número primo.", NumeroPrimo.ehPrimo(19));
    }

    @Test
    public void teste6_NumeroNaoPrimo() {
        assertFalse("1 não é um número primo.", NumeroPrimo.ehPrimo(1));
    }

    @Test
    public void teste7_NumeroNaoPrimo() {
        assertFalse("4 não é um número primo.", NumeroPrimo.ehPrimo(4));
    }

    @Test
    public void teste8_NumeroNaoPrimo() {
        assertFalse("8 não é um número primo.", NumeroPrimo.ehPrimo(8));
    }

    @Test
    public void teste9_NumeroNaoPrimo() {
        assertFalse("15 não é um número primo.", NumeroPrimo.ehPrimo(15));
    }

    @Test
    public void teste10_NumeroNaoPrimo() {
        assertFalse("20 não é um número primo.", NumeroPrimo.ehPrimo(20));
    }
}
