package src.exercice16;

import src.exercice17.Triangulo;

public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo("3,4,5");
        System.out.println("Lado 1: " + t.getLado1());
        System.out.println("Lado 2: " + t.getLado2());
        System.out.println("Lado 3: " + t.getLado3());
        System.out.println(t.verificarTipo());
    }
}
