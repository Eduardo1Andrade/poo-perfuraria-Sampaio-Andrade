package net.fsa.produtos;

public class Perfume extends Produto{
    private float concentracaoEssencia;
    private String categoria;
    private int maceracaoMinima;

    public Perfume(int volumeFrasco, float precoVenda, float concentracaoEssencia,
                    String categoria, int maceracaoMinima){
        super(volumeFrasco, precoVenda);
        this.concentracaoEssencia = concentracaoEssencia;
        this.categoria = categoria;
        this.maceracaoMinima = maceracaoMinima;
    }

    // Verifica se ja passou o tempo de maceracao minimo
    public boolean fimMaceracaoMinima(int diasPassados){
        return (diasPassados >= this.maceracaoMinima) ? true : false;
    }
}
