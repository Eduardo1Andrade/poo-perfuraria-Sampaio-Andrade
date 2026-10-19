package net.fsa.producao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.fsa.produtos.Difusor;
import net.fsa.produtos.Perfume;
import net.fsa.produtos.PerfumeEspecial;
import net.fsa.produtos.Produto;
import net.fsa.produtos.Vela;

public class Producao {
    private int quantidade; // Recebe do metodo produzir em funcionário

    Producao(int quantidade){
        this.quantidade = quantidade;
    }

Scanner scanner = new Scanner(System.in);

    // Gera o lote criando o objeto selecionado pelo usuário em uma lista com a quantidade igual a quantidade
    public Lote gerarLote(){
        List<Produto> lista = new ArrayList<>();
        Produto p = produzirProduto();

        for (int i = 0; i < this.quantidade; i++){
            lista.add(p);
        }

        return new Lote(lista);
    }

    // Cria o objeto do produto de acordo com o produto que o funcionário quer produzir
    private Produto produzirProduto(){
        System.out.println("Insira o produto a produzir:\n"
                            +"1) Perfume\n"
                            +"2) Perfume personalizado\n"
                            +"3) Difusor\n"
                            +"4) Vela");

        switch (scanner.nextInt()) {
            case 1:
                return new Perfume();

            case 2:
                return new PerfumeEspecial();

            case 3:
                return new Difusor();

            case 4:
                return new Vela();
        
            default:
                break;
        }
        return null;
    }
}
