public class Anime {
    public String nome;
    public String genero;
    public String autor;
    public String mensagem;
    public int classIndicativa;
    public int qtdEpisodios;
    public int numTemp;

    public Anime(String nome, int classificacao){
        this.nome = nome;
        this.classIndicativa = classificacao;
    }
     public int mediaEpPorTemp(){
        int media = qtdEpisodios / numTemp;
        return media;
     }

     public String exibirClass(){
        String resp = "Não recomendado para menores de ";
        if (classIndicativa < 10)
            return "Livre para todos os públicos";
        else if (classIndicativa < 12)
            return resp + "10 anos";
        else if (classIndicativa < 14)
            return resp + "12 anos";
        else if (classIndicativa < 16)
            return resp + "14 anos";
        else if (classIndicativa < 18)
            return resp + "16 anos";
        else
            return resp + "18 anos";
     }
     public String exibirDadosAnime(){
         this.mensagem = "Nome do anime: " + this.nome +
                 " De acordo com o ministério da justiça esse anime " + exibirClass() +
                 " A média de episódios por temporada é " + mediaEpPorTemp() + " episódios.";
         return mensagem;
     }

}
