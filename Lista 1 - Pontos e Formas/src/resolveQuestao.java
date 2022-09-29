import Classes.*;

public class resolveQuestao {
    public static void main(String[] args) {
        System.out.println("(Enem 2013 – PPL) Uma pequena fábrica vende seus bonés em pacotes com quantidades" +
                "de unidades variáveis. O lucro obtido é dado pela expressão L(x)= -x²+ 12x - 20, onde x"
                + "representa a quantidade de bonés contidos no pacote. A empresa pretende fazer um único"
                + "tipo de empacotamento, obtendo um lucro máximo."
                + "Qual deve ser a quantidade de bonés a fim de se obter o lucro máximo nas vendas?");
        Eq2g eq = new Eq2g(-1, 12, -20);
        System.out.println("Resposta: " + eq.vertice().getY());
    }
}
