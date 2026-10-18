package net.fsa.producao;

import java.util.List;

public class Estoque {
    private static List<Lote> listaLotes;

    public void adicionarLote(Lote lote){
        listaLotes.add(lote);
    }

    public List<Lote> getEstoque(){
        return listaLotes;
    }

    public void gerarEstoque(){
        for(Lote l : getEstoque()){
            System.out.println(l);
        }
    }

}
