package net.fsa.pessoas;

import java.util.Scanner;

import net.fsa.producao.Estoque;
import net.fsa.producao.Producao;

public class Funcionario extends Pessoa {
    //Dados funcionario
    private String cargo;

    //construtores

    public Funcionario(String nome, String cpf, String telefone, String cargo, String cnpj) {
        super(nome, cpf, telefone);
        this.cargo = cargo;
    }

     //sobrecarga de getter
    @Override 
    public void InformarcaoPessoa () {
        super.InformarcaoPessoa();
        System.out.println(
            "cargo :" + this.cargo
        );
    }

    public void produzirNovo(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade a ser produzida: ");
        Producao producao = new Producao(scanner.nextInt());
        Estoque estoque = new Estoque();

        estoque.adicionarLote(producao.gerarLote());

        scanner.close();
    }
}
