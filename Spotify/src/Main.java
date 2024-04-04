import models.Musica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema iniciado");

        Musica novaMusica = new Musica();

        novaMusica.setNome("The Less I Know The Better");
        novaMusica.setArtista("Tame Impala");
        novaMusica.setGenero("rock");
        novaMusica.setDuracao(336);
        novaMusica.setAnoLancamento(2015);

        novaMusica = new Musica("The Less I Know The Better", "Tame Impala", "rock", 336, 2015);
    }
}
