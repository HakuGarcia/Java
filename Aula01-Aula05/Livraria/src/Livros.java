public class Livros {

    // ------ Atributos ------
    //+ TipoDados nomeAtributo;

    public String titulo;
    public String autor;
    public Editora editora;
    public String resumo;
    public String tipoCapa;
    public double valor;
    public int paginas;
    public boolean colecao;

    // ------ Métodos ------ //
    public String exibirDados(){
        // return ""; → Método return
        // -- Método variável --
        String dados = "" +
                "--------------------------------" +
                "\nTitulo: " + this.titulo +
                "\nResumo: " + this.resumo +
                "\nPreço: R$" + this.valor +
                "\nPáginas: " + this.paginas +
                "\nAutor: " + this.autor +
                "\nEditora: " + this.editora.nome +
                "\n--------------------------------";
        return dados;

    }

    public Livros(String titulo, double valor, Editora editora){
        this.titulo = titulo;
        this.valor = valor;
        this.editora = editora;
    }
}
