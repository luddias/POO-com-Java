
import Classes.*;
import java.util.ArrayList;

public class TestaFigPlana {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(new Ponto2D(2, 5), new Ponto2D(6, 8), new Ponto2D(10, 3));
        Retangulo r = new Retangulo(new Ponto2D(5, 1), new Ponto2D(2, 7));
        Circulo c = new Circulo(4, new Ponto2D(4, 4));

        ArrayList<FigPlana> l = new ArrayList<>();
        l.add(t);
        l.add(r);
        l.add(c);
        System.out.println("Tipo                  \t Perimetro \t Area \t Centro\n"
                + "_______________________________________________________");

        for (FigPlana item : l) {
            if (item instanceof Retangulo) {
                if (((Retangulo) (item)).isSquare()) {
                    System.out.println("Quadrado                \t " + ((Retangulo) (item)).descricao());
                } else {
                    System.out.println("Retangulo                  \t " + ((Retangulo) (item)).descricao());
                }
            } else if (item instanceof Triangulo) {
                if (((Triangulo) (item)).eTrianguloRet()) {
                    System.out.println("Triangulo Ret                \t " + ((Triangulo) (item)).descricao());
                } else {
                    System.out.println("Triangulo                  \t " + ((Triangulo) (item)).descricao());
                }
            } else {
                System.out.println("Circulo                  \t" + ((Circulo) (item)).descricao());
            }
        }

    }
}