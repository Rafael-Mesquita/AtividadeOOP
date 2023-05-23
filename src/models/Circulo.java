package models;

public class Circulo {
    public double raio;
    public double area;
    public double perimetro;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * this.getRaio();
    }
}