public class CriarLivros {
    public static void main(String[] args) {

        // Instanciando objeto = Criar o objeto na memória
        // tipoObjeto nomeObjeto = operadorIntanciação construtor;

        Livro favorito = new Livro();
        favorito.titulo = "Oyasumi Punpun";
        favorito.autor = "Inio Asato";
        favorito.editora = "JBC";
        favorito.resumo = "Um garoto comum descobrindo como lidar com seus sentimentos, instintos e o mundo externo";
        favorito.tipoCapa = "COMUM";
        favorito.valor = 50.78;
        favorito.paginas = 432;
        favorito.colecao = true;

        System.out.println("Meu livro favorito é " + favorito.titulo
                + " do autor " + favorito.autor + ". "
                + "Sua história é sobre " + favorito.resumo + ".");

        System.out.println("--------------------------------");
        System.out.println("Informações sobre o produto: \n"
                + "Editora: " + favorito.editora + "\n"
                + "Tipo de capa: " + favorito.tipoCapa + "\n"
                + "Coleção: " + favorito.colecao + "\n"
                + "Num. de Páginas: " + favorito.paginas + "\n"
                + "Preço: " + favorito.valor);
        System.out.println("--------------------------------");

    }
}
