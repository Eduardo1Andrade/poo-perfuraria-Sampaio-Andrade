package net.fsa.pessoas;
import java.util.Scanner;

import net.fsa.producao.Estoque;
import net.fsa.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    //Dados de classe pessoa

    //construtor padrão
    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    // função de comprar produto.    
    public void comprarProduto(Estoque estoque,int quantidade) {   
        // abre o scanner de numero
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o produto a ser comprado:\n"
            +"1) Perfume\n"
            +"2) Perfume personalizado\n"
            +"3) Difusor\n"
            +"4) Vela");
        //pega o numero e adiciona o nome na variavel "resposta"
        String resposta = "A";
        switch (scanner.nextInt()) {
            case 1:
                resposta = "Perfume";
                break;
            case 2:
                resposta = "PerfumePersonalizado";
                break;
            case 3:
                resposta = "Difusor";
                break;
            case 4:
                resposta = "Vela";
                break;
            default:
                break;
        }
        //cria listas para contagem seguinte
        List<Produto> listaProduto = estoque.getEstoque();
        List<Produto> listaProdutoRemovido = new ArrayList<>();

        //conta os produtos tenham o nome de classe igual a variavel resposta"
        int i = 0;
        for (Produto produto : listaProduto) {
            if (produto.getClass().getSimpleName().equals(resposta)) {
                i++;
                listaProdutoRemovido.add(produto);
            }
        }
        //verifica se a quantidade a ser comprada é menor ou igual a quantidade em estoque
        if (i >= quantidade) {
            //remove os produtos da lista se a condição for verdadeira
            for (i = 0; i < quantidade; i++) {
                listaProduto.remove(listaProdutoRemovido.get(i));
            }
            System.out.println("compra Feita com sucesso!!");
        
        }   else {
            System.out.println(" a compra não pode ser concluida, quantidade insuficiente");
        }
        scanner.close();
    }
}

