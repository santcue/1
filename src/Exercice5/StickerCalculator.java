package src.Exercice5;

import javax.swing.*;

public class StickerCalculator {
    StickerCalculator() {
    }

    public void calculateStickerPrice() {
        String tamañoInput = JOptionPane.showInputDialog(null,
                "Ingrese el tamaño del sticker que desea comprar:\n\n1- Pequeño\n2- Grande");

        switch (tamañoInput) {
            case "1": {
                calculatePequeno();
            }
            break;

            case "2": {
                calculateGrande();
            }
            break;

            default:
                JOptionPane.showMessageDialog(null, "Tamaño de sticker inválido. Ingrese 1 o 2.", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calculatePequeno() {
        String cantidadInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de stickers que desea comprar");
        try {
            int cantidad = Integer.parseInt(cantidadInput);
            if (cantidad > 10) {
                JOptionPane.showMessageDialog(null, "No puede comprar más de 10 stickers", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int precio = cantidad * 4000;
                JOptionPane.showMessageDialog(null, "El precio total es de: " + precio);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calculateGrande() {
        String cantidadInput = JOptionPane.showInputDialog(null, "Ingrese la cantidad de stickers que desea comprar");
        try {
            int cantidad = Integer.parseInt(cantidadInput);
            if (cantidad > 10) {
                JOptionPane.showMessageDialog(null, "No puede comprar más de 10 stickers", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int precio = cantidad * 6000;
                JOptionPane.showMessageDialog(null, "El precio total es de: " + precio);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cantidad inválida. Ingrese un número válido.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
