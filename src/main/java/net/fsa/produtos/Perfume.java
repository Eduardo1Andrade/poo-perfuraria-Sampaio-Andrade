package net.fsa.produtos;

public class Perfume extends Produto{
    private float concentracaoEssencia;
    private String categoria;
    private int maceracaoMinima;
    private String nomeGravado;

    public Perfume(int volumeFrasco, float precoVenda, float concentracaoEssencia,
            String categoria, int maceracaoMinima) {
        super(volumeFrasco, precoVenda);
        this.concentracaoEssencia = concentracaoEssencia;
        this.categoria = categoria;
        this.maceracaoMinima = maceracaoMinima;
    }

    public Perfume(int volumeFrasco, float precoVenda, float concentracaoEssencia,
            String categoria, int maceracaoMinima, String nomeGravado) {
        super(volumeFrasco, precoVenda);
        this.concentracaoEssencia = concentracaoEssencia;
        this.categoria = categoria;
        this.maceracaoMinima = maceracaoMinima;
        this.nomeGravado = nomeGravado;
    }

    // Verifica se ja passou o tempo de maceracao minimo
    public boolean fimMaceracaoMinima(int diasPassados){
        return (diasPassados >= this.maceracaoMinima) ? true : false;
    }


    @Override
public String toString() {
    String s = String.format("Perfume [%s] | %s | Essência: %.1f%% | Maceração mínima: %d dias",
            categoria, super.toString(), concentracaoEssencia, maceracaoMinima);
    if (nomeGravado != null) {
        s += " | Nome gravado: " + nomeGravado;
    }
    return s;
}
}
