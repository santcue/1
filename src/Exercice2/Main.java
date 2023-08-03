package src.Exercice2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = Numeros.getInstance();
        JOptionPane.showMessageDialog(null, numeros.toString(), "Números (Excluyendo 5)", JOptionPane.PLAIN_MESSAGE);
    }
}
