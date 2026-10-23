package net.fsa.pessoas;
import net.fsa.producao.Estoque;
import net.fsa.produtos.Produto;

import java.util.List;

public class Cliente extends Pessoa{
    //Dados de classe pessoa

    //construtor padrão
    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    // função de comprar produto.    
    public void comprarProduto(Produto produto,int quantidade) {   
        Estoque estoque = new Estoque();
        
        //cria listas para contagem seguinte
        List<Produto> listaProduto = estoque.getEstoque();

        //conta os produtos tenham o nome de classe igual a variavel resposta"
        int disponivel = 0;
        for (Produto p : listaProduto) {
            if (p.equals(produto)) {
                disponivel++;
            }
        }
        //verifica se a quantidade a ser comprada é menor ou igual a quantidade em estoque
        if (disponivel >= quantidade) {
            //remove os produtos da lista se a condição for verdadeira
            for (int i = 0; i < quantidade; i++){
                listaProduto.remove(produto);
            }
            System.out.println("compra Feita com sucesso!!");
        
        }   else {
            System.out.println(" a compra não pode ser concluida, quantidade insuficiente");
        }
    }
}

