package models;

public class Quadrilatero {
    public double ladoA;
    public double ladoB;
    public double ladoC;
    public double ladoD;

    public Quadrilatero(double ladoA, double ladoB, double ladoC, double ladoD) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public double getLadoD() {
        return ladoD;
    }
    public double getArea(){
        String classificacao = this.getClassificacao();
        if (classificacao.equals("Quadrado"))
            return Math.pow(this.getLadoA(), 2);
        else if (classificacao.equals("Retângulo"))
            return this.getLadoA() * this.getLadoB();
        else
            return this.getLadoA() * this.getLadoC();
    }
    public double getPerimetro(){
        return this.getLadoA() + this.getLadoB() + this.getLadoC() + this.getLadoD();

    }
    public String getClassificacao(){
        if (this.getLadoA() == this.getLadoB() && this.ladoB == this.getLadoC() && this.getLadoC() == this.getLadoD())
            return "Quadrado";
        else if (this.getLadoA() == this.getLadoC() && this.getLadoB() == this.getLadoD())
            return "Retângulo";
        else
            return "Não foi identificado!!";
    }
}