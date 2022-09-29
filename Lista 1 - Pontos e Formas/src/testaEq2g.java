import Classes.*;
import java.util.Scanner;

public class testaEq2g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os valores de a, b e c da sua equacao.\n a: ");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();
        System.out.println("c: ");
        int c = sc.nextInt();
        Eq2g eq = new Eq2g(a, b, c);

        System.out.printf("Sua equacao ficou assim: (%dx^2) + (%dx) + (%d)\n", eq.getA(), eq.getB(), eq.getC());
        System.out.println("Quantidade de raizes da sua equacao: " + eq.quantRaizes());
        Ponto2D v = eq.vertice();
        System.out.println("\nRaiz A: " + eq.raizA() + ", Raiz B: " + eq.raizB() + ", Vertice: \n(" + v.getX() + ", "
                + v.getY() + ")");
        System.out.println(eq.toString());

    }

}