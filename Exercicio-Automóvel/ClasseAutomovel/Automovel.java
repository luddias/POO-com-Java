// -----------------------------------------------------------------------
//  .* PROGRAMAÇÃO ORIENTADA A OBJETO *.
// 
//   Automovel.c
//   
//   Copyright 2022 Ludmila Dias
//   
//  ----------------------------------------------------------------------

package classeAutomovel;

public class Automovel {
    // atributos (variáveis)
    private double comprimento;
    private double altura;
    private double peso;
    private double cargaMax;
    private int quantPassageiros;
    private int maxPassageiros;
    private double tanqueMax;
    private double tanqueAtual;
    private double veloAtual;
    private boolean ligado;

    // construtor
    public Automovel(double comp, double altura, double peso, double cargaMax, int quantPassageiros, int maxPassageiros,
            double tanqueMax, double tanqueAtual, double veloAtual, boolean ligado) {
        this.comprimento = comp;
        this.altura = altura;
        this.peso = peso;
        this.cargaMax = cargaMax;
        this.quantPassageiros = quantPassageiros;
        this.maxPassageiros = maxPassageiros;
        this.tanqueMax = tanqueMax;
        this.tanqueAtual = tanqueAtual;
        this.veloAtual = veloAtual;
        this.ligado = ligado;
    }

    public String verificaSobrepeso() {
        if ((quantPassageiros * 80) + tanqueAtual <= cargaMax) {
            return "O peso está ok\n";
        } else {
            return "ALERTA! O carro está acima da carga max.\n";
        }
    }

    public String abastecer(double quantCombustivel) {
        if (tanqueAtual + quantCombustivel <= tanqueMax) {
            tanqueAtual = tanqueAtual + quantCombustivel;
            return "Carro abastecido!\n";
        }

        return "ALERTA! Quantidade maior que o limite do tanque.\n";

    }

    public String acelerarOuFreiar(double velo) {
        if (ligado == true) {
            if (velo == veloAtual) {
                return "Velocidade não alterada.\n";
            } else if (velo > veloAtual) {
                veloAtual = velo;
                return "Carro acelerando!\n";
            } else {
                veloAtual = velo;
                return "Carro Freiando!\n";
            }

        }
        return "ALERTA! Carro desligado, ligue e tente novamente.";

    }

    public String embarcar(int pessoas) {
        if ((quantPassageiros + pessoas) <= maxPassageiros) {
            return "Passageiros embarcados.\n";
        }
        return "ALERTA! Quantidade de passageiros maior que a capacidade do carro.\n";
    }

    public String desembarcar(int pessoas) {
        if (veloAtual != 0) {
            return "ALERTA! Pare o carro para realizar o desembarque.\n";
        } else if (quantPassageiros == 0) {
            return "Não há passageiros para o desembarque.\n";
        } else if (pessoas > quantPassageiros) {
            return "Quantidade invalida.\n";
        }

        quantPassageiros -= pessoas;
        return "Passageiros desembarcados com sucesso!\n";

    }

}
