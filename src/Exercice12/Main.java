package src.Exercice12;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();

        equipo1.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del primer equipo"));
        equipo1.setPuntos(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el marcador del primer equipo")));

        equipo2.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del segundo equipo"));
        equipo2.setPuntos(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el marcador del segundo equipo")));

        Fecha[] fechas = new Fecha[3];

        for (int i = 0; i < 3; i++) {
            Fecha fecha = new Fecha();
            fecha.partidos = new Partido[2];

            for (int j = 0; j < 2; j++) {
                Partido partido = new Partido();

                partido.setEquipo(JOptionPane.showInputDialog(null,
                        String.format("Ingrese el nombre del equipo %d para la fecha %d", j + 1, i + 1)));
                partido.setPuntos(Integer.parseInt(JOptionPane.showInputDialog(null,
                        String.format("Ingrese el marcador del equipo %d para la fecha %d", j + 1, i + 1))));

                fecha.partidos[j] = partido;
            }

            fechas[i] = fecha;
        }

        for (Fecha fecha : fechas) {
            for (Partido partido : fecha.partidos) {
                if (partido.getEquipo().equals(equipo1.getNombre())) {
                    equipo1.setPuntos(equipo1.getPuntos() + partido.getPuntos());
                } else if (partido.getEquipo().equals(equipo2.getNombre())) {
                    equipo2.setPuntos(equipo2.getPuntos() + partido.getPuntos());
                }
            }
        }

        String ranking = String.format("Ranking de equipos:\n\n%s con %d puntos\n%s con %d puntos",
                equipo1.getNombre(), equipo1.getPuntos(), equipo2.getNombre(), equipo2.getPuntos());

        JOptionPane.showMessageDialog(null, ranking);
    }
}
