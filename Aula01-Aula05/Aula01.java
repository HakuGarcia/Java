import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo!\n Qual o seu nome?");
        String name;
        name = leitor.nextLine();
        System.out.println("Bem vindo, " + name);

    }
}
