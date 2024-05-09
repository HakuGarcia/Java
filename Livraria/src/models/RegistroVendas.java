package models;

import java.util.ArrayList;
import java.util.List;

public class RegistroVendas {

    // ------ Atributos ------

    private List<Exemplar> lista = new ArrayList<>();
    private double total;

    // ------ Métodos ------
    // ! Polimorfismo !

    public void adicionar(Exemplar item){

        System.out.println("livro adicionado: " + item.getTitulo());
        total += item.getPreco();
        lista.add(item);
    }

    public void exibir(){
        System.out.println(" ------ CARRINHO ------ ");
        System.out.println("Título          | Preço");
        lista.forEach(e -> System.out.println(e.getTitulo() + "          | " + e.getPreco()));
        System.out.println(" ---------------------- " +
                "\nValor total da compra foi: R$ " + total);
    }

    public void teste(){
        for(Exemplar e : lista){
            System.out.println(e.getTitulo());
        }
    }
}
