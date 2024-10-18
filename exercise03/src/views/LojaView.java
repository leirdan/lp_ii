package views;

import models.Deposito;
import models.Produto;
import models.ProdutoDuravel;
import models.ProdutoNaoDuravel;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class LojaView {
    public static void main(String[] args) {
        ArrayList<ProdutoDuravel> produtosDuraveis = new ArrayList<>();
        produtosDuraveis.add(new ProdutoDuravel("Cafeteira", "Tres Corações", 300, "bla bla bla", 3));
        produtosDuraveis.add(new ProdutoDuravel("Notebook", "Acer", 3500, "bla bla bla", 6));
        produtosDuraveis.add(new ProdutoDuravel("Fone de ouvido", "Lenovo", 120, "bla bla bla", 2));

        ArrayList<ProdutoNaoDuravel> produtosNaoDuraveis = new ArrayList<>();
        produtosNaoDuraveis.add(new ProdutoNaoDuravel("Lápis de quadro", "Faber Castell", 5, "bla bla bla", "escola", Date.from(Instant.now().plus(50, ChronoUnit.DAYS))));
        produtosNaoDuraveis.add(new ProdutoNaoDuravel("Shampoo", "Pantene", 16, "bla bla bla", "higiene", Date.from(Instant.now().plus(60, ChronoUnit.DAYS))));
        produtosNaoDuraveis.add(new ProdutoNaoDuravel("Sorvete", "SterBom", 20, "bla bla bla", "alimentício", Date.from(Instant.now().plus(60, ChronoUnit.DAYS))));

        Deposito deposito = new Deposito();

        listarProdutos(deposito);

        System.out.println("Adicionando produtos...");
        produtosDuraveis.forEach(deposito::adicionarProduto);
        produtosNaoDuraveis.forEach(deposito::adicionarProduto);

        listarProdutos(deposito);

        System.out.println("Removendo produtos...");

        deposito.removerProduto(produtosDuraveis.get(1));
        deposito.removerProduto(produtosNaoDuraveis.get(0));

        listarProdutos(deposito);
    }

    private static void listarProdutos(Deposito deposito) {
        System.out.println("==========================");
        System.out.println("LISTA DE ITENS NO DEPÓSITO");
        if (deposito.isDepositoVazio()) {
            System.out.println("Depósito está vazio.");
        } else {
            System.out.println("Quantidade de produtos: " + deposito.getQuantidadeDeProdutos());
            for (Produto produto : deposito.getProdutos()) {
                System.out.println("- Nome: " + produto.getNome());
                System.out.println("- Marca: " + produto.getMarca());
                System.out.println("- Preço: " + produto.getPreco());
                System.out.println("- Descrição: " + produto.getDescricao());
            }

            System.out.println("Produto com maior preço: " + deposito.getProdutoMaisCaro());
        }
        System.out.println("==========================");
    }
}
