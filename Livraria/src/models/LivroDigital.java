package models;

public class LivroDigital extends Livro{

    // ------ Atributos ------

    private String marcaDagua;

    // ------ Métodos ------

    public LivroDigital(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }

    public LivroDigital(String titulo, String autor,
                        double valor, Editora editora,
                        int paginas, String resumo,
                        String marcaDagua) {
        super(titulo, autor, valor, editora, paginas, resumo);
        this.marcaDagua = marcaDagua;
    }

    @Override
    public String exibirDados(){
        return super.exibirDados() +
                "\nMarca D'Agua:" + this.marcaDagua +
                "\n------------------------";
    }

    @Override
    public double getPreco() {
        return 0;
    }

    @Override
    public double aplicarDesconto() {
        return 0.80;
    }

    // ------ Getters and Setters ------

    public String getMarcaDagua() {
        return marcaDagua;
    }
    public void setMarcaDagua(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }

}
