package net.fsa.produtos;

public class PerfumeEspecial extends Perfume {
    private String nomeGravado;

    public PerfumeEspecial(int volumeFrasco, float precoVenda, float concentracaoEssencia,
            String categoria, int maceracaoMinima, String nomeGravado) {
        super(volumeFrasco, precoVenda, concentracaoEssencia, categoria, maceracaoMinima);
        this.nomeGravado = nomeGravado;
    }
}
