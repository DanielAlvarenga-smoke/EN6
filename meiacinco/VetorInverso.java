package meiacinco;

public class VetorInverso {
    public static int[] inverterVetor(int[] vetor) {
        int[] resultado = new int[vetor.length];
        int indiceResultado = 0;

        for (int i = vetor.length - 1; i >= 0; i--) {
            resultado[indiceResultado] = vetor[i];
            indiceResultado++;
        }

        return resultado;
    }
}
