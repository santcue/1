package src.Exercice1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(2, 10);
        JOptionPane.showMessageDialog(null, numeros.toString(), "Números del 2 al 10", JOptionPane.PLAIN_MESSAGE);
    }
}
