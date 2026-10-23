package net.fsa.producao;

import java.util.ArrayList;
import java.util.List;
import net.fsa.produtos.Produto;

public class Estoque {
    // O estoque é a lista com todos os produtos
    // É estático porque os mesmos dados vão ser acessado por diferentes classes
    private static List<Produto> estoqueTotal = new ArrayList<>();

    // Adiciona os produtos do lote a lista, sugestão é que seja chamada no método produzir, na classe funcionario
    public void adicionarLote(Lote lote){
        List<Produto> listaProdutosLote = lote.getListaProdutos();
        for (int i = 0; i < listaProdutosLote.size(); i++){
            Estoque.estoqueTotal.add(listaProdutosLote.get(i));
        }
    }

    // Retorna a lista do estoque, para a compra do cliente
    public List<Produto> getEstoque(){
        return Estoque.estoqueTotal;
    }


    // Imprime todos os produtos, para visualizar o estoque
    public void gerarEstoque(){
        for(Produto l : getEstoque()){
            System.out.println(l);
        }
    }

}
