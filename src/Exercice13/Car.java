package src.Exercice13;

public class Car {
    private String marca;
    private String modelo;
    private int año;
    private int precio;
    private String[] caracteristicas;

    private Car() {
    }

    public Car(String marca, String modelo, int año, int precio, String[] caracteristicas) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.caracteristicas = caracteristicas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public int getPrecio() {
        return precio;
    }

    public String[] getCaracteristicas() {
        return caracteristicas;
    }
}
