package src.exercice17;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(String lados) {
        String[] ladosArray = lados.split(",");
        this.setLado1(Integer.parseInt(ladosArray[0]));
        this.setLado2(Integer.parseInt(ladosArray[1]));
        this.setLado3(Integer.parseInt(ladosArray[2]));
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public String verificarTipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "El triángulo es equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "El triángulo es isósceles";
        } else {
            return "El triángulo es escaleno";
        }
    }
}

