public class Livros {

    // ------ Atributos ------
    //+ TipoDados nomeAtributo;

    public String titulo;
    public String autor;
    public String editora;
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
                "\n--------------------------------";
        return dados;

    }

    public Livros(String titulo, double valor){
        this.titulo = titulo;
        this.valor = valor;
    }
}
