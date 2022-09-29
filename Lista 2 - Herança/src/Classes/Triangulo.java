package Classes;

public class Triangulo extends FigPlana {
    private Ponto2D vA;
    private Ponto2D vB;
    private Ponto2D vC;
    private double ladoAB;
    private double ladoBC;
    private double ladoCA;

    public Triangulo(Ponto2D vA, Ponto2D vB, Ponto2D vC) {
        this.vA = vA;
        this.vB = vB;
        this.vC = vC;
        ladoAB = vA.distancia(vB);
        ladoBC = vB.distancia(vC);
        ladoCA = vC.distancia(vA);
    }

    public Ponto2D getvA() {
        return vA;
    }

    public Ponto2D getvB() {
        return vB;
    }

    public Ponto2D getvC() {
        return vC;
    }

    @Override
    public double perimetro() {
        return Math.round((ladoAB + ladoBC + ladoCA) * 100.00) / 100.00;
    }

    @Override
    public double area() {
        double p = (ladoAB + ladoBC + ladoCA) / 2;
        return Math.round(Math.sqrt(p * (p - ladoAB) * (p - ladoBC) * (p - ladoCA)) * 100.00) / 100.00;
    }

    @Override
    public Ponto2D cg() {
        return new Ponto2D((vA.getX() + vB.getX() + vC.getX()) / 3, (vA.getY() + vB.getY() + vC.getY()) / 3);
    }

    public boolean eTrianguloRet() {
        if (ladoAB > ladoBC && ladoAB > ladoCA) {
            return ((ladoAB - 0.3) <= (Math.sqrt(Math.pow(ladoBC, 2) + Math.pow(ladoCA, 2)))
                    && (ladoAB + 0.3) <= (Math.sqrt(Math.pow(ladoBC, 2) + Math.pow(ladoCA, 2))));

        } else if (ladoBC > ladoAB && ladoBC > ladoCA) {
            return ((ladoBC - 0.3) <= (Math.sqrt(Math.pow(ladoAB, 2) + Math.pow(ladoCA, 2)))
                    && (ladoBC + 0.3) <= (Math.sqrt(Math.pow(ladoAB, 2) + Math.pow(ladoCA, 2))));
        } else if (ladoCA > ladoAB && ladoCA > ladoBC) {
            return ((ladoCA - 0.3) <= (Math.sqrt(Math.pow(ladoBC, 2) + Math.pow(ladoAB, 2)))
                    && (ladoCA + 0.3) <= (Math.sqrt(Math.pow(ladoBC, 2) + Math.pow(ladoAB, 2))));
        }
        return false;
    }

    @Override
    public String descricao() {
        return perimetro() + "\t" + area() + "\t" + "(" + cg().getX() + "," + cg().getY() + ")";
    }
}
