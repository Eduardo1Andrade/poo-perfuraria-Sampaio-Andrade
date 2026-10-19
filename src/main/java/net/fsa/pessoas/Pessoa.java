package net.fsa.pessoas;

public abstract class Pessoa {
    //classe abstrata por será usada em Funcionario e Cliente e define dados comum das duas classes.
    //Dados de pessoa
    private String nome; 
    private String cpf; // XXX.XXX.XXX-XX
    private String telefone; //(DDD) X XXXX-XXXX

    //Construtor pessoa
    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    //Getter geral
    public void InformarcaoPessoa (){
        System.out.println("Nome: " + this.nome + "\n" 
        + "CPF :" + this.cpf + "\n"
        + "Telefone: " + this.telefone
        );
    }

 }
