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

    public boolean estaVencido() {
        LocalDate d = LocalDate.now();
        if (!dataVencimento.isAfter(d)) {
            return true;
        } else {
            return false;
        }
    }

    public float gerarCustoMaterial(float quantidade) {
        if (estaVencido()) {
            return 0.0f;
        }
        return quantidade * this.precoUnidade;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    @Override
    public String toString() {
        return nome;
    }
}
