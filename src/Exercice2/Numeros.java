package src.Exercice2;

public class Numeros {
    private static Numeros instance;

    private Numeros() {
    }

    public static Numeros getInstance() {
        if (instance == null) {
            instance = new Numeros();
        }
        return instance;
    }

    @Override
    public String toString() {
        StringBuilder numerosBuilder = new StringBuilder();

        for (int i = 1; i <= 6; i++) {
            if (i != 5) {
                numerosBuilder.append(i).append("\n");
            }
        }

        return numerosBuilder.toString();
    }
}
