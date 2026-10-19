package net.fsa.produtos;

public abstract class Produto {
    private int volumeFrasco;
    private float precoVenda;

    public Produto(int volumeFrasco, float precoVenda){
        this.volumeFrasco = volumeFrasco;
        this.precoVenda = precoVenda;
    }

    public float custoTotalProduto(){
        return 0.0f;
    }
}
