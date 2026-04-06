package estoque;

public class ControleEstoque {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.nome = "Teclado Mecânico";
        meuProduto.quantidadeEstoque = 8;

        boolean precisaComprar = verificarNecessidadeReposicao(meuProduto);

        if (precisaComprar) {
            System.out.println("ALERTA: É Necessário repor o estoquede " + meuProduto.nome);
        } else {
            System.out.println("Estoque de " + meuProduto.nome + " está regular.");
        }
    }

    public static boolean verificarNecessidadeReposicao(Produto p) {
        if (p.quantidadeEstoque < 10) {
            return true;
        } else {
            return false;
        }
    }
}

