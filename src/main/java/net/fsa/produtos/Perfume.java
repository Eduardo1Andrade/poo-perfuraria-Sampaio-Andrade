package net.fsa.produtos;

public class Perfume extends Produto {
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
        if (nomeGravado != null && nomeGravado.length() > 20) {
            this.nomeGravado = nomeGravado.substring(0, 20);
        } else {
            this.nomeGravado = nomeGravado;
        }
    }

    public boolean fimMaceracaoMinima(int diasPassados) {
        return diasPassados >= this.maceracaoMinima;
    }

    public void setConcentracaoEssencia(float concentracaoEssencia) {
        String cat = categoria == null ? "" : categoria.toLowerCase();
        boolean ok = true;
        if (cat.contains("parfum")) {
            ok = concentracaoEssencia >= 20.0f && concentracaoEssencia <= 30.0f;
        } else if (cat.contains("eau de parfum") || cat.equals("edp")) {
            ok = concentracaoEssencia > 0.0f && concentracaoEssencia <= 20.0f;
        } else if (cat.contains("eau de toilette") || cat.equals("edt")) {
            ok = concentracaoEssencia <= 15.0f;
        } else if (cat.contains("colonia") || cat.contains("cologne")) {
            ok = concentracaoEssencia <= 5.0f;
        }
        this.concentracaoEssencia = concentracaoEssencia;
    }

    public String getCategoria() {
        return categoria;
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
