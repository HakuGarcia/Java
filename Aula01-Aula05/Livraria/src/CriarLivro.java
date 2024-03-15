public class CriarLivro {
    public static void main(String[] args) {

        // Instanciando objeto = Criar o objeto na memória
        // tipoObjeto nomeObjeto = operadorIntanciação métodoConstrutor;
        Editora editora = new Editora();
        editora.nome = "JBC";
        editora.representante = "Ana";

            Livros favorito = new Livros("Oyasumi Punpun", 50.78, editora);
        //favorito.titulo = "Oyasumi Punpun";
        favorito.autor = "Inio Asato";
        favorito.editora = editora;
        favorito.resumo = "Um garoto comum descobrindo como lidar com seus sentimentos, instintos e o mundo externo";
        favorito.tipoCapa = "COMUM";
        //favorito.valor = 50.78;
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

        Livros meuLivro = new Livros("Declinio de um Homem", 35.15, editora);
        //meuLivro.titulo = "Declinio de um Homem";
        //meuLivro.valor = 35.15;
        //System.out.println("\nTitulo: " + meuLivro.titulo);
        System.out.println(meuLivro.exibirDados());
    }
}
