package Classes;

import java.lang.Math;

public class Ponto2D {
    private int x;
    private int y;

    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distancia(Ponto2D p2) {
        double dX = p2.getX() - x;
        double dY = p2.getY() - y;
        return Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
    }

    public boolean eIgual(Ponto2D p2) {
        int x2 = p2.getX();
        int y2 = p2.getY();
        if (x == x2 && y == y2) {
            return true;
        }
        return false;
    }

    public String toString() {
        String texto = "Coordenada x:" + x + "\nCoordenada y:" + y;
        return texto;
    }
}