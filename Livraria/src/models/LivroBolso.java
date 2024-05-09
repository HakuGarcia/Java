package models;

public class LivroBolso extends Livro{
    @Override
    public double getPreco() {
        return 0;
    }

    @Override
    public double aplicarDesconto() {
        return 0;
    }
}
