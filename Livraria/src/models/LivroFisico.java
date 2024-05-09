package models;

import models.enums.TipoCapaEnum;

public class LivroFisico extends Livro{

    // ------ Atributos ------

    private TipoCapaEnum tipoCapa;

    // ------ Métodos ------

    public LivroFisico(String titulo) {
        super(titulo);
    }

    public LivroFisico(String titulo, double preco) {
        super(titulo, preco);
    }

    public double getTaxaImpressao(){
        return valor * 0.05;
    }

    public String exibirDados(){
        return super.exibirDados() +
                "\nTaxa de Impressão:" + this.getTaxaImpressao() +
                "\n------------------------";
    }

    @Override
    public double getPreco() {
        return getValor();
    }

    @Override
    public double aplicarDesconto() {
        return 0;
    }

    // ------ Getters and Setters ------

    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }
}
