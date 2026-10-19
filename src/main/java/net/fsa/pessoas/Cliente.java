package net.fsa.pessoas;

public class Cliente extends Pessoa{
    //Dados de classe pessoa
    private String endereco;
    private Boolean inadiplemte;

    //construtor padrão
    public Cliente(String nome, String cpf, String telefone, String endereco, Boolean inadiplemte) {
        super(nome, cpf, telefone);
        this.inadiplemte = inadiplemte;
        this.endereco = endereco;
    }
    //construtor com valor inadiplemte com padrão
    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone);
        this.inadiplemte = false;
        this.endereco = endereco;
    }
    
    //sobrecarga de getter Pessoa
    @Override 
    public void InformarcaoPessoa () {
        super.InformarcaoPessoa();

        String statusinadiplemte;
        
        if (this.inadiplemte == true) {
            statusinadiplemte = "Inadiplemte";

        } else {
            statusinadiplemte = "adimplente";
        }
        System.out.println(
            "status de indadiplemcia :" + statusinadiplemte 
            + "endereço: " + this.endereco
        );
    }
}
