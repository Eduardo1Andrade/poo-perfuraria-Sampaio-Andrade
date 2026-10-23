package net.fsa.pessoas;

import java.util.List;

import net.fsa.producao.Estoque;
import net.fsa.produtos.Perfume;
import net.fsa.produtos.Produto;

public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    public void comprarProduto(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida");
            return;
        }

        Estoque estoque = new Estoque();
        List<Produto> listaProduto = estoque.getEstoque();

        int disponivel = 0;
        for (Produto p : listaProduto) {
            if (p.equals(produto)) {
                disponivel++;
            }
        }

        if (disponivel < quantidade) {
            System.out.println(" a compra não pode ser concluida, quantidade insuficiente");
            return;
        }

        if (produto instanceof Perfume) {
            Perfume pf = (Perfume) produto;
            if (pf.toString() != null && pf.toString().contains("Nome gravado")) {
                System.out.println("Perfume personalizado não admite devolução");
            }
        }

        for (int i = 0; i < quantidade; i++) {
            listaProduto.remove(produto);
        }
        System.out.println("compra Feita com sucesso!!");
    }
}

