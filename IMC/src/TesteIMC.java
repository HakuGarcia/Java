import java.util.Scanner;

public class TesteIMC {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        System.out.println("Apresente seu peso: ");
        double peso = leitor.nextDouble();

        System.out.println("Apresente sua altura: ");
        double altura = leitor.nextDouble();

        Calculo calculo = new Calculo(peso, altura);
        System.out.println(calculo.exibirMensagem());

        System.out.println("Informe seu sexo: (F/M) ");
        String sexo = leitorTexto.nextLine();
        System.out.println("Seu peso ideal é " + calculo.pesoIdeal(sexo));

    }
}
