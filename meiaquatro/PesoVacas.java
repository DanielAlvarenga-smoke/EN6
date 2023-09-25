package meiaquatro;
import java.util.ArrayList;
import java.util.List;

public class PesoVacas {
    private List<Double> pesos = new ArrayList<>();

    public void adicionarPeso(double peso) {
        if (peso > 0) {
            pesos.add(peso);
        }
    }

    public double getPesoMaior() {
        if (pesos.isEmpty()) {
            return 0;
        }
        double maior = pesos.get(0);
        for (double peso : pesos) {
            if (peso > maior) {
                maior = peso;
            }
        }
        return maior;
    }

    public double getPesoMenor() {
        if (pesos.isEmpty()) {
            return 0;
        }
        double menor = pesos.get(0);
        for (double peso : pesos) {
            if (peso < menor) {
                menor = peso;
            }
        }
        return menor;
    }

    public int getQuantidadePesos() {
        return pesos.size();
    }

    public double getMediaPesos() {
        if (pesos.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (double peso : pesos) {
            soma += peso;
        }
        return soma / pesos.size();
    }
}