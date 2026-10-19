package net.fsa.producao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.fsa.produtos.Difusor;
import net.fsa.produtos.Perfume;
import net.fsa.produtos.PerfumeEspecial;
import net.fsa.produtos.Produto;
import net.fsa.produtos.Vela;

public class Producao {
    private int quantidade; // Recebe do metodo produzir em funcionário

    Producao(int quantidade){
        this.quantidade = quantidade;
    }

Scanner scanner = new Scanner(System.in);

    // Gera o lote criando o objeto selecionado pelo usuário em uma lista com a quantidade igual a quantidade
    public Lote gerarLote(){
        List<Produto> lista = new ArrayList<>();
        Produto p = produzirProduto();

        for (int i = 0; i < this.quantidade; i++){
            lista.add(p);
        }

        return new Lote(lista);
    }

    // Cria o objeto do produto de acordo com o produto que o funcionário quer produzir
    private Produto produzirProduto(){
        System.out.println("Insira o produto a produzir:\n"
                            +"1) Perfume\n"
                            +"2) Perfume personalizado\n"
                            +"3) Difusor\n"
                            +"4) Vela");

        switch (scanner.nextInt()) {
            case 1:
                System.out.print("\nInsira o volume do frasco: ");
                int volumeFrascoP = scanner.nextInt();
                System.out.print("\nInsira o preço de venda: ");
                float precoVendaP = scanner.nextFloat();
                System.out.print("\nInsira a concenctração da essência: ");
                float concentracaoEssenciaP = scanner.nextFloat();
                System.out.print("\nInsira a categoria: ");
                String categoriaP = scanner.nextLine();
                System.out.print("\nInsira a maceração minima: ");
                int maceracaoMinimaP = scanner.nextInt();

                return new Perfume(volumeFrascoP, precoVendaP, concentracaoEssenciaP, categoriaP, maceracaoMinimaP);

            case 2:
                System.out.print("\nInsira o volume do frasco: ");
                int volumeFrascoPe = scanner.nextInt();
                System.out.print("\nInsira o preço de venda: ");
                float precoVendaPe = scanner.nextFloat();
                System.out.print("\nInsira a concenctração da essência: ");
                float concentracaoEssenciaPe = scanner.nextFloat();
                System.out.print("\nInsira a categoria: ");
                String categoriaPe = scanner.nextLine();
                System.out.print("\nInsira a maceração minima: ");
                int maceracaoMinimaPe = scanner.nextInt();
                System.out.print("\nInsira a maceração minima: ");
                String nomeGravado = scanner.nextLine();

                return new PerfumeEspecial(volumeFrascoPe, precoVendaPe, concentracaoEssenciaPe, categoriaPe, maceracaoMinimaPe, nomeGravado);

            case 3:
                System.out.print("\nInsira o volume do frasco: ");
                int volumeFrascoD = scanner.nextInt();
                System.out.print("\nInsira o preço da venda: ");
                float precoVendaD = scanner.nextFloat();
                System.out.print("\nInsira a quantidade de varetas: ");
                int quantidadeVaretas = scanner.nextInt();

                return new Difusor(volumeFrascoD, precoVendaD, quantidadeVaretas);

            case 4:
                System.out.print("\nInsira o preço de venda: ");
                float precoVendaV = scanner.nextFloat();
                System.out.print("\nInsira o peso da cera: ");
                float pesoCera = scanner.nextFloat();
                System.out.print("\nInsira a concentração da fragrância: ");
                float concentracaoFragancia = scanner.nextFloat();
                
                return new Vela(0, precoVendaV, pesoCera, concentracaoFragancia);
        
            default:
                break;
        }
        return null;
    }
}
