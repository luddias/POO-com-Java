package Classes;

public class Circulo extends FigPlana {
    private double raio;
    private Ponto2D cg;

    public Circulo(double raio, Ponto2D cg) {
        this.raio = raio;
        this.cg = cg;
    }

    public Ponto2D getCg() {
        return cg;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double perimetro() {
        return 2 * 3.14 * raio;
    }

    @Override
    public double area() {
        return 3.14 * Math.pow(raio, 2);
    }

    @Override
    public Ponto2D cg() {
        return cg;
    }

    @Override
    public String descricao() {
        return perimetro() + "\t" + area() + "\t" + "(" + cg().getX() + "," + cg().getY() + ")";
    }
}
