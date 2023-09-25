package meiaquatro;
import org.junit.Test;
import static org.junit.Assert.*;


public class PesoVacasTest {

    @Test
    public void testPesoVacas1() {
        PesoVacas pv = new PesoVacas();
        pv.adicionarPeso(400);
        pv.adicionarPeso(300);
        pv.adicionarPeso(500);
        pv.adicionarPeso(600);

        assertEquals(600, pv.getPesoMaior(), 0.01);
        assertEquals(300, pv.getPesoMenor(), 0.01);
        assertEquals(4, pv.getQuantidadePesos());
        assertEquals(450.0, pv.getMediaPesos(), 0.01);
    }

    @Test
    public void testPesoVacas2() {
        PesoVacas pv = new PesoVacas();
        pv.adicionarPeso(800);
        pv.adicionarPeso(700);
        pv.adicionarPeso(900);
        pv.adicionarPeso(750);

        assertEquals(900, pv.getPesoMaior(), 0.01);
        assertEquals(700, pv.getPesoMenor(), 0.01);
        assertEquals(4, pv.getQuantidadePesos());
        assertEquals(787.5, pv.getMediaPesos(), 0.01);
    }

    @Test
    public void testPesoVacas3() {
        PesoVacas pv = new PesoVacas();
        pv.adicionarPeso(200);
        pv.adicionarPeso(250);
        pv.adicionarPeso(180);
        pv.adicionarPeso(300);

        assertEquals(300, pv.getPesoMaior(), 0.01);
        assertEquals(180, pv.getPesoMenor(), 0.01);
        assertEquals(4, pv.getQuantidadePesos());
        assertEquals(232.5, pv.getMediaPesos(), 0.01);
    }

    @Test
    public void testPesoVacas4() {
        PesoVacas pv = new PesoVacas();
        pv.adicionarPeso(400);
        pv.adicionarPeso(0);
        pv.adicionarPeso(-100);
        pv.adicionarPeso(300);

        assertEquals(400, pv.getPesoMaior(), 0.01);
        assertEquals(300.0, pv.getPesoMenor(), 0.01);
        assertEquals(2, pv.getQuantidadePesos());
        assertEquals(350.0, pv.getMediaPesos(), 0.01);
    }

    @Test
    public void testPesoVacas5() {
        PesoVacas pv = new PesoVacas();
        pv.adicionarPeso(-50);
        pv.adicionarPeso(-75);
        pv.adicionarPeso(-100);
        pv.adicionarPeso(-25);

        assertEquals(0, pv.getPesoMaior(), 0.01);
        assertEquals(0, pv.getPesoMenor(), 0.01);
        assertEquals(0, pv.getQuantidadePesos());
        assertEquals(0.0, pv.getMediaPesos(), 0.01);
    }

    @Test
    public void testPesoVacas6() {
        PesoVacas pv = new PesoVacas();
        pv.adicionarPeso(300);
        pv.adicionarPeso(400);
        pv.adicionarPeso(350);

        assertEquals(400, pv.getPesoMaior(), 0.01);
        assertEquals(300, pv.getPesoMenor(), 0.01);
        assertEquals(3, pv.getQuantidadePesos());
        assertEquals(350.0, pv.getMediaPesos(), 0.01);
    }

    @Test
    public void testPesoVacas7() {
        PesoVacas pv = new PesoVacas();

        assertEquals(0, pv.getPesoMaior(), 0.01);
        assertEquals(0, pv.getPesoMenor(), 0.01);
        assertEquals(0, pv.getQuantidadePesos());
        assertEquals(0.0, pv.getMediaPesos(), 0.01);
    }

    @Test
    public void testPesoVacas8() {
        PesoVacas pv = new PesoVacas();
        pv.adicionarPeso(120);
        pv.adicionarPeso(140);
        pv.adicionarPeso(160);
        pv.adicionarPeso(180);
        pv.adicionarPeso(200);

        assertEquals(200, pv.getPesoMaior(), 0.01);
        assertEquals(120, pv.getPesoMenor(), 0.01);
        assertEquals(5, pv.getQuantidadePesos());
        assertEquals(160.0, pv.getMediaPesos(), 0.01);
    }

    @Test
    public void testPesoVacas9() {
        PesoVacas pv = new PesoVacas();
        pv.adicionarPeso(50);
        pv.adicionarPeso(100);
        pv.adicionarPeso(75);
        pv.adicionarPeso(150);
        pv.adicionarPeso(125);

        assertEquals(150, pv.getPesoMaior(), 0.01);
        assertEquals(50, pv.getPesoMenor(), 0.01);
        assertEquals(5, pv.getQuantidadePesos());
        assertEquals(100.0, pv.getMediaPesos(), 0.01);
    }

    @Test
    public void testPesoVacas10() {
        PesoVacas pv = new PesoVacas();
        pv.adicionarPeso(500);
        pv.adicionarPeso(400);
        pv.adicionarPeso(300);
        pv.adicionarPeso(200);
        pv.adicionarPeso(100);

        assertEquals(500, pv.getPesoMaior(), 0.01);
        assertEquals(100, pv.getPesoMenor(), 0.01);
        assertEquals(5, pv.getQuantidadePesos());
        assertEquals(300.0, pv.getMediaPesos(), 0.01);
    }
}