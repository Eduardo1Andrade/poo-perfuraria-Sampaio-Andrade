package net.fsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.fsa.pessoas.Cliente;
import net.fsa.pessoas.Funcionario;
import net.fsa.producao.Estoque;
import net.fsa.producao.MateriaPrima;
import net.fsa.produtos.Produto;

public class Simulacao {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        List<MateriaPrima> materiaPrima = Data.materiaPrima();
        List<Produto> produtos = new ArrayList<>(Data.produtos());
        estoque.setEstoque(produtos);


        Scanner scanner = new Scanner(System.in);

        estoque.gerarEstoque();

        switch (scanner.nextInt()) {
            case 1:
                Funcionario f = new Funcionario("John Doe", "12345678900", "1111111111", "Junior", null);
                f.produzirNovo();
                break;
            case 2:
                Cliente c = new Cliente("Ana","98765432100","1111111111");
                c.comprarProduto(produtos.get(0), 1);
                break;
            default:
                break;
        }

        estoque.gerarEstoque();
    }
}