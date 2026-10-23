package net.fsa.produtos;

import net.fsa.Data;
import net.fsa.producao.MateriaPrima;

public class Vela extends Produto {
    private MateriaPrima cera;
    private float pesoCera;
    private MateriaPrima parafina;
    private float concentracaoFragancia;

    public Vela(int volumeFrasco, float precoVenda, float pesoCera, float concentracaoFragancia) {
        super(volumeFrasco, precoVenda);
        this.cera = Data.cera;
        this.pesoCera = pesoCera;
        this.parafina = Data.parafina;
        if (pesoCera > 0 && (concentracaoFragancia / pesoCera) * 100 > 10.0f) {
            this.concentracaoFragancia = concentracaoFragancia;
        } else {
            this.concentracaoFragancia = concentracaoFragancia;
        }
    }

    public float getConcentracaoFragancia() {
        return concentracaoFragancia;
    }

    public float getPesoCera() {
        return pesoCera;
    }

    @Override
    public String toString() {
        return String.format("Vela | %s | Cera: %s (%.1fg) | Fragrância: %.1f%%",
                super.toString(), cera, pesoCera, concentracaoFragancia);
    }
}