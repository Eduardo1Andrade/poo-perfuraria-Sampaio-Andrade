package net.fsa.pessoas;

public class Cliente extends Pessoa{
    //Dados de classe pessoa
    private String endereco;
    private Boolean inadiplente;

    //construtor padrão
    public Cliente(String nome, String cpf, String telefone, String endereco, Boolean inadiplente) {
        super(nome, cpf, telefone);
        this.inadiplente = inadiplente;
        this.endereco = endereco;
    }
    //construtor com valor inadiplente com padrão
    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone);
        this.inadiplente = false;
        this.endereco = endereco;
    }

}
