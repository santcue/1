package src.Exercice13;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Car captiva = new Car("Chevrolet", "Captiva", 2022, 30000,
                new String[]{"Motor de 2.5L", "Transmisión automática de 6 velocidades", "Asientos de cuero"});

        Car tracker = new Car("Chevrolet", "Tracker", 2022, 25000,
                new String[]{"Motor de 1.5L", "Transmisión manual de 5 velocidades", "Sistema de sonido premium"});

        Car mazda3 = new Car("Mazda", "3", 2022, 28000,
                new String[]{"Motor de 2.5L", "Transmisión automática de 6 velocidades", "Sistema de navegación GPS"});

        Car cx5 = new Car("Mazda", "CX-5", 2022, 32000,
                new String[]{"Motor de 2.5L", "Transmisión automática de 6 velocidades", "Asientos de cuero"});

        Car duster = new Car("Renault", "Duster", 2022, 20000,
                new String[]{"Motor de 1.6L", "Transmisión manual de 5 velocidades", "Aire acondicionado"});

        Car kwid = new Car("Renault", "Kwid", 2022, 15000,
                new String[]{"Motor de 1.0L", "Transmisión manual de 5 velocidades", "Sistema de entretenimiento"});

        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca del auto que desea comprar:\n\n- Chevrolet\n- Mazda\n- Renault");

        Car referencia1 = null, referencia2 = null;
        if (marca.equalsIgnoreCase("Chevrolet")) {
            referencia1 = captiva;
            referencia2 = tracker;
        } else if (marca.equalsIgnoreCase("Mazda")) {
            referencia1 = mazda3;
            referencia2 = cx5;
        } else if (marca.equalsIgnoreCase("Renault")) {
            referencia1 = duster;
            referencia2 = kwid;
        } else {
            JOptionPane.showMessageDialog(null, "La marca ingresada no es válida");
            System.exit(0);
        }

        String modelo = JOptionPane.showInputDialog(null,
                String.format("Ingrese el modelo del auto que desea comprar:\n\n1. %s\n2. %s",
                        referencia1.getModelo(), referencia2.getModelo()));

        Car carro = null;
        if (modelo.equals("1")) {
            carro = referencia1;
        } else if (modelo.equals("2")) {
            carro = referencia2;
        } else {
            JOptionPane.showMessageDialog(null, "El modelo ingresado no es válido");
            System.exit(0);
        }

        String caracteristicas = String.join(", ", carro.getCaracteristicas());

        String resultado = String.format("El auto que usted desea comprar es un: %s %s%nAño: %d%nPrecio: $%d%nCaracterísticas: %s",
                carro.getMarca(), carro.getModelo(), carro.getAño(), carro.getPrecio(), caracteristicas);

        JOptionPane.showMessageDialog(null, resultado);
    }
}
