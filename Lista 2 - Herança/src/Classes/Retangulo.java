package Classes;

public class Retangulo extends FigPlana {
    private Ponto2D vs;
    private Ponto2D vi;
    private int base;
    private int altura;

    public Retangulo(Ponto2D vs, Ponto2D vi) {
        this.vs = vs;
        this.vi = vi;
        base = vs.getX() - vi.getX();
        if (base < 0) {
            base = base * (-1);
        }
        altura = vs.getY() - vi.getY();
        if (altura < 0) {
            altura = altura * (-1);
        }

    }

    public Ponto2D getVi() {
        return vi;
    }

    public Ponto2D getVs() {
        return vs;
    }

    public boolean isSquare() {
        return base == altura;
    }

    @Override
    public double perimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public Ponto2D cg() {
        return new Ponto2D(base / 2, altura / 2);
    }

    @Override
    public String descricao() {
        return perimetro() + "\t" + area() + "\t" + "(" + cg().getX() + "," + cg().getY() + ")";
    }
}
