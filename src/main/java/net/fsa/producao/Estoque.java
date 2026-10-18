package net.fsa.producao;

import java.util.List;

public class Estoque {
    // O estoque é a lista de todos os lotes, consequêntemente com todos os produtos
    // É estático porque os mesmos dados vão ser acessado por diferentes classes
    private static List<Lote> listaLotes;

    // Adiciona um lote a lista, sugestão é que seja chamada no método produzir, na classe funcionario
    public void adicionarLote(Lote lote){
        listaLotes.add(lote);
    }

    // Retorna a lista do estoque, para a compra do cliente
    public List<Lote> getEstoque(){
        return listaLotes;
    }

    // Imprime todos os lotes, para visualizar o estoque
    public void gerarEstoque(){
        for(Lote l : getEstoque()){
            System.out.println(l);
        }
    }

}
