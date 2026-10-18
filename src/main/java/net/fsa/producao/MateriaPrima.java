package net.fsa.producao;

import java.time.LocalDate;

public class MateriaPrima {
    private String nome;
    private String descricao;
    private LocalDate dataVencimento;
    private float precoUnidade;


    public MateriaPrima(String nome, String descricao, LocalDate dataVencimento, float precoUnidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.precoUnidade = precoUnidade;
    }

    // Verifica se a data de vencimento já passou ou é hoje
    public boolean estaVencido(){
        LocalDate d = LocalDate.now();
        if(!dataVencimento.isAfter(d)){
            return true;
        }
        else{
            return false;
        }
    }

    // Calcula e retorna o custo individual do material
    public float gerarCustoMaterial(float quantidade){
        return quantidade * this.precoUnidade;
    }
}
