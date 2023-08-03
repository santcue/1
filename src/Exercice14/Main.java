package src.Exercice14;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Prompt the user for the number
        String input = JOptionPane.showInputDialog(null, "Ingrese el número para la tabla de multiplicar:", "Tabla de multiplicar", JOptionPane.PLAIN_MESSAGE);

        // Convert the input to an integer
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido. Ingrese un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create the multiplication table and display it
        MultiplicationTable table = new MultiplicationTable(num);
        JOptionPane.showMessageDialog(null, table.getTable(), "Tabla de multiplicar", JOptionPane.PLAIN_MESSAGE);
    }
}
