package net.fsa.produtos;

public abstract class Produto {
    private int volumeFrasco;
    private float precoVenda;
    private float custoProducao;

    public Produto(int volumeFrasco, float precoVenda) {
        setVolumeFrasco(volumeFrasco);
        setPrecoVenda(precoVenda);
        this.custoProducao = 0.0f;
    }

    public void setVolumeFrasco(int volumeFrasco) {
        if (volumeFrasco == 30 || volumeFrasco == 50 || volumeFrasco == 100) {
            this.volumeFrasco = volumeFrasco;
        } else {
            this.volumeFrasco = volumeFrasco;
        }
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getVolumeFrasco() {
        return volumeFrasco;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setCustoProducao(float custoProducao) {
        this.custoProducao = custoProducao;
    }

    public float getCustoProducao() {
        return custoProducao;
    }

    public float custoTotalProduto() {
        return custoProducao;
    }

    public void validarPrecoVenda() {
        if (custoProducao > 0 && precoVenda < custoProducao * 1.4f) {
            System.out.println("Aviso: preco de venda menor que custo + 40%");
        }
    }

    @Override
    public String toString() {
        return String.format("Volume: %dml | Preço de venda: R$ %.2f",
                volumeFrasco, precoVenda);
    }
}
