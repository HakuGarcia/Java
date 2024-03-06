import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeAluno = nome.nextLine();

        System.out.println("Digite sua idade: ");
        Integer idadeAluno = idade.nextInt();

        System.out.println("Seu nome é: " + nomeAluno);
        System.out.println("Você tem " + idadeAluno + " anos.");

        String name = "Haku";
        double number4 = 2e5d;
        System.out.println(name.indexOf('z')); //starts with 0
        int nameIndex = name.indexOf('z') + 1;
        System.out.println(nameIndex);
    }
}