package net.fsa.producao;

import java.util.List;

import net.fsa.produtos.Produto;

public class Lote {
    private static int novoCodigo = 1000; // Variável para criar o autoincremento para CODIGO
    private final int CODIGO; // Identificador do lote
    private List<Produto> listaProdutos;


    Lote(List<Produto> lista){
        this.CODIGO = novoCodigo++; // Atribui um valor único ao lote e autoincrementa para o próximo lote
        this.listaProdutos = lista;
    }
    

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }
}
