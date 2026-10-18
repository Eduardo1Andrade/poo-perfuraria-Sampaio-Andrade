package net.fsa.pessoas;

public class Cliente extends Pessoa{
    private String endereco;
    private Boolean inadiplente;

    public Cliente(String nome, String cpf, String telefone, String cargo, String indadiplente) {
        super(nome, cpf, telefone);
        this.inadiplente = inadiplente;
        this.endereco = endereco;
    }

}
