package net.fsa.produtos;

public class Difusor extends Produto{
    //dados de Difusor
    private int quantidadeVaretas;

    //Construtor de Difusor
    public Difusor(int volumeFrasco, float precoVenda, int quantidadeVaretas){
        super(volumeFrasco, precoVenda);
        this.quantidadeVaretas = quantidadeVaretas;
    }
} 
