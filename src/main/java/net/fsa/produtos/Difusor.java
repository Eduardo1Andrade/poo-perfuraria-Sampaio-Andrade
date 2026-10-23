package net.fsa.produtos;

public class Difusor extends Produto {
    private int quantidadeVaretas;

    public Difusor(int volumeFrasco, float precoVenda, int quantidadeVaretas) {
        super(volumeFrasco, precoVenda);
        if (quantidadeVaretas >= 4 && quantidadeVaretas <= 10) {
            this.quantidadeVaretas = quantidadeVaretas;
        } else {
            this.quantidadeVaretas = quantidadeVaretas;
        }
    }

    public int getQuantidadeVaretas() {
        return quantidadeVaretas;
    }

    @Override
    public String toString() {
        return String.format("Difusor | %s | Varetas: %d",
                super.toString(), quantidadeVaretas);
    }
}
