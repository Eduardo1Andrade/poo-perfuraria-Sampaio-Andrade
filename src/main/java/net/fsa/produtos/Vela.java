package net.fsa.produtos;

import net.fsa.producao.MateriaPrima;

public class Vela extends Produto{
    //Dados de Vela
    private MateriaPrima cera;
    private Float pesoCera;
    private MateriaPrima parafina;
    private Float concentracaoFragancia;  

    //Construtor de Vela
    public Vela(
        int volumeFrasco, float precoVenda, MateriaPrima cera,
        Float pesoCera, MateriaPrima parafina, Float concentracaoFragancia)
        {
        super(volumeFrasco, precoVenda);
        this.cera = cera;
        this.pesoCera = pesoCera;
        this.parafina = parafina;
        this.concentracaoFragancia = concentracaoFragancia;
    }
} 