package meiacinco;
import org.junit.Test;
import static org.junit.Assert.*;

public class VetorInversoTest {

    @Test
    public void testVetorInverso1() {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] esperado = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testVetorInverso2() {
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] esperado = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testVetorInverso3() {
        int[] vetor = {5, 4, 3, 2, 1, 0, -1, -2, -3, -4};
        int[] esperado = {-4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testVetorInverso4() {
        int[] vetor = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int[] esperado = {1000, 900, 800, 700, 600, 500, 400, 300, 200, 100};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testVetorInverso5() {
        int[] vetor = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] esperado = {10, 8, 6, 4, 2, 9, 7, 5, 3, 1};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testVetorInverso6() {
        int[] vetor = {-10, -20, -30, -40, -50, -60, -70, -80, -90, -100};
        int[] esperado = {-100, -90, -80, -70, -60, -50, -40, -30, -20, -10};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testVetorInverso7() {
        int[] vetor = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] esperado = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testVetorInverso8() {
        int[] vetor = {5, -5, 10, -10, 15, -15, 20, -20, 25, -25};
        int[] esperado = {-25, 25, -20, 20, -15, 15, -10, 10, -5, 5};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testVetorInverso9() {
        int[] vetor = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        int[] esperado = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testVetorInverso10() {
        int[] vetor = {100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 0, -1};
        int[] esperado = {-1, 0, 1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100};

        int[] resultado = VetorInverso.inverterVetor(vetor);

        assertArrayEquals(esperado, resultado);
    }
}
