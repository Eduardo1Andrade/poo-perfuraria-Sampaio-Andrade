package net.fsa.pessoas;

public class Funcionario extends Pessoa {
    private String cargo;
    private String cnpj;

    public Funcionario(String nome, String cpf, String telefone, String cargo, String cnpj) {
        super(nome, cpf, telefone);
        this.cargo = cargo;
        this.cnpj = cnpj;
    }

}
