package net.fsa.produtos;

public abstract class Produto {
    private int volumeFrasco;
    private float precoVenda;

    public Produto(int volumeFrasco, float precoVenda) {
        this.volumeFrasco = volumeFrasco;
        this.precoVenda = precoVenda;
    }

    public float custoTotalProduto() {
        return 0.0f;
    }

    @Override
    public String toString() {
        return String.format("Volume: %dml | Preço de venda: R$ %.2f",
                volumeFrasco, precoVenda);
    }
}
