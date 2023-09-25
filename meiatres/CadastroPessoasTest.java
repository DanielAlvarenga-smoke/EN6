package meiatres;
import org.junit.Test;
import static org.junit.Assert.*;

public class CadastroPessoasTest {

    private CadastroPessoas cadastro;

    
    public void setUp() {
        cadastro = new CadastroPessoas();
    }

    @Test
    public void testMediaIdades() {
        int[] idades = {25, 30, 35, 40, 45, 50, 55};
        double mediaEsperada = 40.0;

        double mediaCalculada = cadastro.calcularMediaIdades(idades);
        assertEquals(mediaEsperada, mediaCalculada, 0.01);
    }

    @Test
    public void testAlturaMedia() {
        double[] alturas = {1.75, 1.80, 1.70, 1.65, 1.85, 1.75, 1.90};
        double alturaMediaEsperada = 1.77;

        double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
        assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
    }

   @Test
public void testMediaIdades2() {
    int[] idades = {20, 25, 30, 35, 40, 45, 50}; 
    double mediaEsperada = 35.0; 

    double mediaCalculada = cadastro.calcularMediaIdades(idades);
    assertEquals(mediaEsperada, mediaCalculada, 0.01);
}

@Test
public void testAlturaMedia2() {
    double[] alturas = {1.70, 1.75, 1.80, 1.85, 1.90, 1.95, 2.00}; 
    double alturaMediaEsperada = 1.8499999999999999; 

    double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
    assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
}

@Test
public void testMediaIdades3() {
    int[] idades = {18, 25, 40, 12, 70, 55, 30}; 
    double mediaEsperada = 35.714285714285715; 

    double mediaCalculada = cadastro.calcularMediaIdades(idades);
    assertEquals(mediaEsperada, mediaCalculada, 0.01);
}

@Test
public void testAlturaMedia3() {
    double[] alturas = {1.60, 1.85, 1.50, 2.10, 1.75, 1.62, 1.98}; 
    double alturaMediaEsperada = 1.7714285714285718; 

    double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
    assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
}

@Test
public void testMediaIdades4() {
    int[] idades = {22, 35, 28, 18, 60, 42, 31}; 
    double mediaEsperada = 33.714285714285715; 

    double mediaCalculada = cadastro.calcularMediaIdades(idades);
    assertEquals(mediaEsperada, mediaCalculada, 0.01);
}

@Test
public void testAlturaMedia4() {
    double[] alturas = {1.68, 1.92, 1.75, 1.61, 1.88, 1.70, 1.78}; 
    double alturaMediaEsperada = 1.75; 

    double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
    assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
}

@Test
public void testMediaIdades5() {
    int[] idades = {19, 27, 33, 50, 38, 45, 29}; 
    double mediaEsperada = 34.42857142857143; 

    double mediaCalculada = cadastro.calcularMediaIdades(idades);
    assertEquals(mediaEsperada, mediaCalculada, 0.01);
}

@Test
public void testAlturaMedia5() {
    double[] alturas = {1.85, 1.72, 1.67, 1.95, 1.79, 1.60, 1.88}; 
    double alturaMediaEsperada = 1.78; 

    double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
    assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
}

@Test
public void testMediaIdades6() {
    int[] idades = {21, 32, 40, 55, 19, 28, 37}; 
    double mediaEsperada = 33.142857142857146; 

    double mediaCalculada = cadastro.calcularMediaIdades(idades);
    assertEquals(mediaEsperada, mediaCalculada, 0.01);
}

@Test
public void testAlturaMedia6() {
    double[] alturas = {1.72, 1.90, 1.63, 1.78, 1.85, 1.68, 1.91}; 
    double alturaMediaEsperada = 1.79; 

    double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
    assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
}

@Test
public void testMediaIdades7() {
    int[] idades = {22, 34, 45, 28, 53, 39, 42}; 
    double mediaEsperada = 37.57142857142857; 

    double mediaCalculada = cadastro.calcularMediaIdades(idades);
    assertEquals(mediaEsperada, mediaCalculada, 0.01);
}

@Test
public void testAlturaMedia7() {
    double[] alturas = {1.73, 1.88, 1.65, 1.70, 1.92, 1.78, 1.60}; 
    double alturaMediaEsperada = 1.75; 

    double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
    assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
}

@Test
public void testMediaIdades8() {
    int[] idades = {26, 37, 49, 31, 55, 40, 24}; 
    double mediaEsperada = 37.42857142857143; 

    double mediaCalculada = cadastro.calcularMediaIdades(idades);
    assertEquals(mediaEsperada, mediaCalculada, 0.01);
}

@Test
public void testAlturaMedia8() {
    double[] alturas = {1.70, 1.85, 1.62, 1.95, 1.78, 1.75, 1.89}; 
    double alturaMediaEsperada = 1.7914285714285716; 

    double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
    assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
}

@Test
public void testMediaIdades9() {
    int[] idades = {20, 32, 41, 56, 29, 38, 47}; 
    double mediaEsperada = 37.57142857142857; 

    double mediaCalculada = cadastro.calcularMediaIdades(idades);
    assertEquals(mediaEsperada, mediaCalculada, 0.01);
}

@Test
public void testAlturaMedia9() {
    double[] alturas = {1.68, 1.92, 1.73, 1.80, 1.85, 1.60, 1.78}; 
    double alturaMediaEsperada = 1.77; 

    double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
    assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
}

@Test
public void testMediaIdades10() {
    int[] idades = {25, 37, 49, 30, 58, 42, 23};
    double mediaEsperada = 37.714285714285715; 

    double mediaCalculada = cadastro.calcularMediaIdades(idades);
    assertEquals(mediaEsperada, mediaCalculada, 0.01);
}

@Test
public void testAlturaMedia10() {
    double[] alturas = {1.70, 1.87, 1.61, 1.95, 1.79, 1.62, 1.88}; 
    double alturaMediaEsperada = 1.77;

    double alturaMediaCalculada = cadastro.calcularAlturaMedia(alturas);
    assertEquals(alturaMediaEsperada, alturaMediaCalculada, 0.01);
}

}