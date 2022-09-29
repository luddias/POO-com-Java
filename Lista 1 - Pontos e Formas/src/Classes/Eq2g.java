package Classes;

import java.lang.Math;

public class Eq2g {
    private int a;
    private int b;
    private int c;
    private double del;

    public Eq2g(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        del = Math.pow(b, 2) - (4 * a * c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int quantRaizes() {
        if (del > 0) {
            return 2;
        } else if (del == 0) {
            return 1;
        }
        return 0;
    }

    public double raizA() {
        if (del >= 0) {
            return ((-b) - Math.sqrt(del)) / (2 * a);
        }
        return -1;
    }

    public double raizB() {
        if (del > 0) {
            return ((-b) + Math.sqrt(del)) / (2 * a);
        } else if (del == 0) {
            return raizA();
        }

        return -1;
    }

    public Ponto2D vertice() {
        if (del >= 0) {
            int x = (int) ((-del) / (4 * a));
            int y = (int) ((-b) / (2 * a));
            Ponto2D v = new Ponto2D(x, y);
            return v;
        }
        return null;
    }

    public String toString() {
        return ("Sua equacao: (" + a + "x^2) + (" + b + "x) + (" + c + ")");
    }
}
