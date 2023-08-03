package src.Exercice1;

public class Numeros {
    private int inicio;
    private int fin;

    public Numeros(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public String toString() {
        StringBuilder numerosBuilder = new StringBuilder();
        int i = inicio;

        while (i <= fin) {
            numerosBuilder.append(i).append("\n");
            i++;
        }

        return numerosBuilder.toString();
    }
}

