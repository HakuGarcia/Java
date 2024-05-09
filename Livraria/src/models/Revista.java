package models;

public class Revista implements Exemplar{

    // ------ Atributos ------

    private String titulo;
    private String categoria;
    private double preco;
    private Editora editora;

    // ------ Métodos ------

    @Override
    public String exibirDados() {
        return "Nome da revista: ";
    }

    // ------ Getters and Setters ------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nome) {
        this.titulo = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
