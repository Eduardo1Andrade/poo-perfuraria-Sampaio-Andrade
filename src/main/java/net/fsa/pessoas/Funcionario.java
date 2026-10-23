package net.fsa.pessoas;

import java.util.Scanner;

import net.fsa.producao.Estoque;
import net.fsa.producao.Producao;
import net.fsa.produtos.Perfume;
import net.fsa.produtos.Produto;
import net.fsa.producao.Lote;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cpf, String telefone, String cargo, String cnpj) {
        super(nome, cpf, telefone);
        this.cargo = cargo;
    }

    @Override
    public void InformarcaoPessoa() {
        super.InformarcaoPessoa();
        System.out.println("cargo :" + this.cargo);
    }

    public void produzirNovo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade a ser produzida: ");
        int qtd = scanner.nextInt();
        Producao producao = new Producao(qtd);
        Estoque estoque = new Estoque();

        Lote lote = producao.gerarLote();
        if (lote != null && lote.getListaProdutos() != null && !lote.getListaProdutos().isEmpty()) {
            Produto p0 = lote.getListaProdutos().get(0);
            if (p0 instanceof Perfume) {
                Perfume pf = (Perfume) p0;
                String cat = pf.getCategoria() == null ? "" : pf.getCategoria().toLowerCase();
                if (cat.contains("parfum") && cargo != null && cargo.toLowerCase().contains("junior")) {
                    System.out.println("Perfumista júnior não pode assinar fórmulas da categoria Parfum");
                    scanner.close();
                    return;
                }
            }
        }

        estoque.adicionarLote(lote);
        scanner.close();
    }
}
