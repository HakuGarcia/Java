package tests;

import models.Editora;
import models.LivroDigital;
import models.LivroFisico;
import models.RegistroVendas;
import models.enums.TipoCapaEnum;

public class CriarLivros {
    public static void main(String[] args) {

        // Instanciando objeto = Criar o objeto na memória
        // tipoObjeto nomeObjeto = operadorIntanciação construtor;

        // ------ Instanciando Editora ------
        Editora editora = new Editora();
        editora.nome = "JBC";
        editora.representante = "Masakazu Shoji";

        // ------ Instanciando Livro Fsvorito ------
        LivroFisico favorito = new LivroFisico("Oyasumi Punpun");

        favorito.setAutor("Inio Asato");
        favorito.setResumo("Um garoto comum descobrindo como lidar com seus sentimentos, instintos e o mundo externo");
        favorito.setEditora(editora);
        favorito.setValor(50.78);
        favorito.setPaginas(432);
        favorito.setTipoCapa(TipoCapaEnum.COMUM);

        System.out.println(favorito.exibirDados());

        // ------ Instanciando Livro 01 ------
        LivroFisico livro1 = new LivroFisico("Nana", 37.90);

        livro1.setValor(28.61);
        livro1.setEditora(editora);

        System.out.println(livro1.exibirDados());

        // ------ Instanciando Livro 02 ------
        LivroDigital livro2 = new LivroDigital("Amazon");

        livro2.setTitulo("Akira");
        livro2.setEditora(editora);

        System.out.println(livro2.exibirDados());

        RegistroVendas carrinho = new RegistroVendas();
        carrinho.adicionar(favorito);
        carrinho.adicionar(livro1);
        carrinho.adicionar(livro2);
        carrinho.exibir();
    }
}
