// -----------------------------------------------------------------------
//  .* PROGRAMAÇÃO ORIENTADA A OBJETO *.
// 
//   testaAutomovel.c
//   
//   Copyright 2022 Ludmila Dias
//   
//  ----------------------------------------------------------------------

import classeAutomovel.Automovel;
import java.util.Scanner;

public class testaAutomovel {
    public static void main(String[] args) {
        Automovel taxi = new Automovel(2.2, 1.4, 5000.0, 500.0, 3, 4, 50.0, 22.9, 20.6, true);
        Scanner sc = new Scanner(System.in);
        String texto = "BEM VINDO! Escolha a opção que deseja:\n"
                + "1. Abastecer\n"
                + "2. Verificar sobrecarga\n"
                + "3. Mudar velocidade\n"
                + "4. Embarcar\n"
                + "5. Desembarcar\n"
                + "6. Sair";
        System.out.println(texto);
        int r = sc.nextInt();

        while (r != 6) {

            switch (r) {
                case 1:
                    System.out.println("Insira a quantidade de gasolina que deseja abastecer:\n");
                    double gas = sc.nextDouble();
                    System.out.println(taxi.abastecer(gas));
                    break;

                case 2:
                    System.out.println(taxi.verificaSobrepeso());
                    break;

                case 3:
                    System.out.println("Insira a velocidade que deseja:\n");
                    double velo = sc.nextDouble();
                    System.out.println(taxi.acelerarOuFreiar(velo));
                    break;

                case 4:
                    System.out.println("Insira a quantidade de pessoas a embarcar:\n");
                    int p1 = sc.nextInt();
                    System.out.println(taxi.embarcar(p1));
                    break;

                case 5:
                    System.out.println("Insira a quantidade de pessoas a desembarcar:\n");
                    int p2 = sc.nextInt();
                    System.out.println(taxi.desembarcar(p2));
                    break;

                default:
                    break;

            }
            System.out.println(texto);
            r = sc.nextInt();
        }
    }
}
