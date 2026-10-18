package net.fsa.producao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.fsa.produtos.Difusor;
import net.fsa.produtos.Perfume;
import net.fsa.produtos.Produto;
import net.fsa.produtos.Vela;

public class Producao {
// from funcionario produzir(qauntidade)
    private int quantidade;

    Producao(int quantidade){
        this.quantidade = quantidade;
    }

Scanner scanner = new Scanner(System.in);

    public Lote gerarLote(){
        List<Produto> lista = new ArrayList<>();
        Produto p = produzirProduto();

        for (int i = 0; i < this.quantidade; i++){
            lista.add(p);
        }

        return new Lote(lista);
    }

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
                return new Perfume();

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
