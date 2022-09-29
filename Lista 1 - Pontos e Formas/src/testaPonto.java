import java.util.Scanner;

import Classes.Ponto2D;

public class testaPonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as coordenadas do ponto p. \nx:");
        int x = sc.nextInt();
        System.out.println("y:");
        int y = sc.nextInt();
        Ponto2D p1 = new Ponto2D(x, y);

        System.out.println("Coordenadas escolhidas para seu ponto:\nx: " + p1.getX() + "\ny: " + p1.getY());

        System.out.println("Insira as coordenadas do ponto p2: \nx:");
        int x2 = sc.nextInt();
        System.out.println("\ny:");
        int y2 = sc.nextInt();
        Ponto2D p2 = new Ponto2D(x2, y2);

        System.out.printf("\nA distancia do ponto p1 e p2 é: %.2f", p1.distancia(p2));
        if (p1.eIgual(p2) == true) {
            System.out.println("\nOs pontos p1 e p2 sao iguais ");
        } else {
            System.out.println("\nOs pontos p1 e p2 sao diferentes");
        }

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}