package net.fsa.producao;

import java.time.LocalDate;

public class OleosEssenciais extends MateriaPrima{
    private String aroma;
    private String notasTipo;

    public OleosEssenciais(String nome, String descricao, LocalDate dataVencimento, 
                            float precoUnidade, String aroma, String notasTipo){
        super(nome, descricao, dataVencimento, precoUnidade);
        this.aroma = aroma;
        this.notasTipo = notasTipo;

    }

}
