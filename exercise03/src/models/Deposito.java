package models;

import java.util.ArrayList;
import java.util.Optional;

public class Deposito {
    private ArrayList<Produto> produtos;

    public Deposito() {
        produtos = new ArrayList<>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto novoProduto) {
        if (novoProduto != null)
            produtos.add(novoProduto);
    }

    public void removerProduto(Produto produto) {
        if (produto != null)
            produtos.remove(produto);
    }

    public void removerProdutoPorIndice(int index) {
        produtos.remove(index);
    }

    public String getProdutoMaisCaro() {
        Optional<Produto> p = produtos.stream()
                .sorted((p1, p2) -> (int) (p2.getPreco() - p1.getPreco()))
                .findFirst();

        return p.isPresent() ?
                p.get().getNome() :
                "";
    }

    public int getQuantidadeDeProdutos() {
        if (produtos != null)
            return produtos.size();

        return 0;
    }

    public boolean isDepositoVazio() {
        if (produtos != null)
            return produtos.isEmpty();

        return true;
    }
}
