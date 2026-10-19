package net.fsa.pessoas;

public class Funcionario extends Pessoa {
    //Dados funcionario
    private String cargo;
    private String cnpj;

    //construtores

    public Funcionario(String nome, String cpf, String telefone, String cargo, String cnpj) {
        super(nome, cpf, telefone);
        this.cargo = cargo;
        this.cnpj = cnpj;
    }

     //sobrecarga de getter
    @Override 
    public void InformarcaoPessoa () {
        super.InformarcaoPessoa();

        System.out.println(
            "cargo :" + this.cargo
            + "CNPJ: " + this.cnpj
        );
    }
}
