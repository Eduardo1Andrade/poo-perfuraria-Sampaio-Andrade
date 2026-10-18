package net.fsa.producao;

import java.util.List;

import net.fsa.produtos.Produto;

public class Lote {
    private static int novoCodigo = 1000;
    private final int CODIGO;
    private List<Produto> listaProdutos;

    Lote(List<Produto> lista){
        this.CODIGO = novoCodigo++;
        this.listaProdutos = lista;
    }
}
