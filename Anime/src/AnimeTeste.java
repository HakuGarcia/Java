import java.util.Scanner;

public class AnimeTeste {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite o nome do anime: ");
        String nome = texto.nextLine();

        System.out.println("Digite a classificação indicativa 10, 12, 14, 16, 18, " +
                "para classificação livre digite 0 ");
        int classIndicativa = numeros.nextInt();

        Anime anime = new Anime(nome, classIndicativa);
        Anime meuAnime = new Anime("Made in abyss" , 16);

        System.out.println("Digite o autor do anime: ");
        anime.autor = texto.nextLine();

        System.out.println("Digite o genero do anime: ");
        anime.genero = texto.nextLine();

        System.out.println("Digite a quantidade de episódios: ");
        anime.qtdEpisodios = numeros.nextInt();

        System.out.println("Digite o numero de temporadas: ");
        anime.numTemp = numeros.nextInt();

        anime.exibirDadosAnime();
        System.out.println(anime.mensagem);

    }
}
