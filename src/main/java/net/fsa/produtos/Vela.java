package net.fsa.produtos;

import net.fsa.Data;
import net.fsa.producao.MateriaPrima;

public class Vela extends Produto{
    //Dados de Vela
    private MateriaPrima cera;
    private float pesoCera;
    private MateriaPrima parafina;
    private float concentracaoFragancia;  

    //Construtor de Vela
    public Vela(
        int volumeFrasco, float precoVenda,float pesoCera, float concentracaoFragancia){
        super(volumeFrasco, precoVenda);
        this.cera = Data.cera;
        this.pesoCera = pesoCera;
        this.parafina = Data.parafina;
        this.concentracaoFragancia = concentracaoFragancia;
    }
} 