package models;

public abstract class Livro implements Exemplar{

    // ------ Atributos ------
    //+ TipoDados nomeAtributo;

    protected String titulo;
    private String autor;
    private String resumo;
    protected double valor;
    private int paginas;
    private Editora editora;

    // ------ Métodos ------

    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(String titulo, double preco){
        this.titulo = titulo;
        this.valor = preco;
    }

    public Livro(String titulo, String autor,
                 double valor, Editora editora,
                 int paginas, String resumo) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.editora = editora;
        this.paginas = paginas;
        this.resumo = resumo;

    }

    public String exibirDados(){
        String dados =
                "Titulo: " + this.titulo +
                "\n. . . . . . . . . . . . " +
                "\nResumo: " + this.resumo +
                "\nPreço: R$ " + this.valor +
                "\nPáginas: " + this.paginas +
                "\nAutor: " + this.autor +
                "\nmodels.Editora: " + this.editora.nome;
        return dados;
    }

    public abstract double aplicarDesconto();

    public Livro(){}

    // ------ Getters and Setters ------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
