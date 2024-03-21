import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();

        System.out.println("Informe o valor em reais: ");
        moeda.valorReal = leitor.nextDouble(); //next.Double = converte para double
        System.out.println("Informe a cotação do dolar de hoje: ");
        moeda.cotacaoDollar = leitor.nextDouble();

        moeda.calcularConversao();
        System.out.println(moeda.quantDollar); // método sem retorno
        System.out.println(moeda.retornarCalculoConversao()); // método com retorno
    }
}
