package meiadois;
import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;

public class CalculadoraIdadeTest {

    @Test
    public void test1_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("2000-01-01");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(23, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }

    @Test
    public void test2_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("1995-05-15");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(28, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }

    @Test
    public void test3_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("1987-08-20");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(36, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }

    @Test
    public void test4_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("2005-03-10");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(18, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }

    @Test
    public void test5_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("1990-12-31");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(32, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }

    @Test
    public void test6_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("2000-02-29");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(23, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }

    @Test
    public void test7_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("1975-11-11");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(47, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }

    @Test
    public void test8_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("2010-09-24");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(13, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }

    @Test
    public void test9_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("1988-06-05");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(35, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }

    @Test
    public void test10_CalcularIdade() {
        LocalDate dataNascimento = LocalDate.parse("1999-09-01");
        LocalDate dataAtual = LocalDate.parse("2023-09-24");
        assertEquals(24, CalculadoraIdade.calcularIdade(dataNascimento, dataAtual));
    }
}
