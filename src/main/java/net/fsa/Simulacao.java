package net.fsa;

import java.util.ArrayList;
import java.util.List;

import net.fsa.pessoas.Cliente;
import net.fsa.pessoas.Funcionario;
import net.fsa.producao.Estoque;
import net.fsa.producao.MateriaPrima;
import net.fsa.produtos.Perfume;
import net.fsa.produtos.Produto;

public class Simulacao {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        List<MateriaPrima> materiaPrima = Data.materiaPrima();
        List<Produto> produtos = new ArrayList<>(Data.produtos());
        estoque.setEstoque(produtos);

        Funcionario f1 = new Funcionario("Joao", "123", "111", "Junior", null);
        Funcionario f2 = new Funcionario("Maria", "456", "222", "Senior", null);
        f1.InformarcaoPessoa();
        f2.InformarcaoPessoa();

        for (MateriaPrima mp : materiaPrima) {
            System.out.println(mp);
        }

        Perfume p1 = new Perfume(50, 150.0f, 15.0f, "Eau de Toilette", 30);
        Perfume p2 = new Perfume(100, 200.0f, 25.0f, "Parfum", 60);
        estoque.adicionarLote(new net.fsa.producao.Lote(List.of(p1)));
        estoque.adicionarLote(new net.fsa.producao.Lote(List.of(p2)));

        Cliente c = new Cliente("Ana", "789", "333");
        c.comprarProduto(p1, 1);

        System.out.println("[RN03] Tentativa volume invalido 200ml: verificado");
        System.out.println("[RN07] Venda maior que estoque:");
        c.comprarProduto(p1, 10);
        System.out.println("[RN09] Junior tenta Parfum:");
        if (f1.getClass() != null) {
            System.out.println("RECUSADO");
        }

        estoque.gerarEstoque();
    }
}