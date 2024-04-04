package models;

public class Musica {
    public String nome;
    public String artista;
    public String genero;
    public int duracao;
    public int anoLancamento;

    // construtor
    public Musica(){}

    public Musica(String nome, String artista, String genero, int duracao, int anoLancamento) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        setDuracao(duracao);
        this.anoLancamento = anoLancamento;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if(duracao <= 0){
            System.out.println("A duração é negativa ou zero");
            return;
        }
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    // metodos
    public void tocar(){
        System.out.println("Tocando a música " + nome);
    }

    public void curtir(){
        System.out.println("Curtindo a música " + nome);
    }

    public void pausar(){
        System.out.println("Pausando a música " + nome);
    }

    public String getDuracaoFormatada(){
        int minutos = duracao / 60;
        int segundos = duracao % 60;
        return "%dm%ds".formatted(minutos, segundos);
    }

    @Override
    public String toString() {
        return "model.Musica{nome='%s', artista='%s', genero='%s', duracao=%d, anoLancamento=%d,}"
                .formatted(nome, artista, genero, duracao, anoLancamento);
    }
}
