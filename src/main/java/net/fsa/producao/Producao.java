package net.fsa.producao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.fsa.produtos.Difusor;
import net.fsa.produtos.Perfume;
import net.fsa.produtos.Produto;
import net.fsa.produtos.Vela;

public class Producao {
    private int quantidade; // Recebe do metodo produzir em funcionário

    public Producao(int quantidade){
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

    private Produto produzirProduto() {
        System.out.println("Insira o produto a produzir:\n"
                + "1) Perfume\n"
                + "2) Perfume personalizado\n"
                + "3) Difusor\n"
                + "4) Vela");

        switch (scanner.nextInt()) {
            case 1:
                System.out.print("\nInsira o volume do frasco: ");
                int volumeFrascoP = scanner.nextInt();
                if (volumeFrascoP != 30 && volumeFrascoP != 50 && volumeFrascoP != 100) {
                    System.out.println("Volume inválido (30, 50 ou 100 ml)");
                }
                System.out.print("\nInsira o preço de venda: ");
                float precoVendaP = scanner.nextFloat();
                System.out.print("\nInsira a concentração da essência: ");
                float concentracaoEssenciaP = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("\nInsira a categoria: ");
                String categoriaP = scanner.nextLine();
                System.out.print("\nInsira a maceração minima: ");
                int maceracaoMinimaP = scanner.nextInt();

                String catP = categoriaP == null ? "" : categoriaP.toLowerCase();
                if (catP.contains("parfum")) {
                    if (!(concentracaoEssenciaP >= 20.0f && concentracaoEssenciaP <= 30.0f)) {
                        System.out.println("Concentração fora da faixa para Parfum");
                    }
                    if (maceracaoMinimaP < 60) {
                        maceracaoMinimaP = 60;
                    }
                } else if (catP.contains("eau de parfum") || catP.equals("edp")) {
                    if (!(concentracaoEssenciaP > 0.0f && concentracaoEssenciaP <= 20.0f)) {
                        System.out.println("Concentração fora da faixa para EDP");
                    }
                    if (maceracaoMinimaP < 45) {
                        maceracaoMinimaP = 45;
                    }
                } else if (catP.contains("eau de toilette") || catP.equals("edt")) {
                    if (concentracaoEssenciaP > 15.0f) {
                        System.out.println("Concentração fora da faixa para EDT");
                    }
                    if (maceracaoMinimaP < 30) {
                        maceracaoMinimaP = 30;
                    }
                } else if (catP.contains("colonia") || catP.contains("cologne")) {
                    if (concentracaoEssenciaP > 5.0f) {
                        System.out.println("Concentração fora da faixa para Colônia");
                    }
                    if (maceracaoMinimaP < 15) {
                        maceracaoMinimaP = 15;
                    }
                }

                return new Perfume(volumeFrascoP, precoVendaP, concentracaoEssenciaP, categoriaP, maceracaoMinimaP);

            case 2:
                System.out.print("\nInsira o volume do frasco: ");
                int volumeFrascoPe = scanner.nextInt();
                if (volumeFrascoPe != 30 && volumeFrascoPe != 50 && volumeFrascoPe != 100) {
                    System.out.println("Volume inválido (30, 50 ou 100 ml)");
                }
                System.out.print("\nInsira o preço de venda: ");
                float precoVendaPe = scanner.nextFloat();
                System.out.print("\nInsira a concentração da essência: ");
                float concentracaoEssenciaPe = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("\nInsira a categoria: ");
                String categoriaPe = scanner.nextLine();
                System.out.print("\nInsira a maceração minima: ");
                int maceracaoMinimaPe = scanner.nextInt();
                scanner.nextLine();
                System.out.print("\nInsira o nome a ser gravado: ");
                String nomeGravado = scanner.nextLine();

                String catPe = categoriaPe == null ? "" : categoriaPe.toLowerCase();
                if (catPe.contains("parfum")) {
                    if (!(concentracaoEssenciaPe >= 20.0f && concentracaoEssenciaPe <= 30.0f)) {
                        System.out.println("Concentração fora da faixa para Parfum");
                    }
                    if (maceracaoMinimaPe < 60) {
                        maceracaoMinimaPe = 60;
                    }
                } else if (catPe.contains("eau de parfum") || catPe.equals("edp")) {
                    if (!(concentracaoEssenciaPe > 0.0f && concentracaoEssenciaPe <= 20.0f)) {
                        System.out.println("Concentração fora da faixa para EDP");
                    }
                    if (maceracaoMinimaPe < 45) {
                        maceracaoMinimaPe = 45;
                    }
                } else if (catPe.contains("eau de toilette") || catPe.equals("edt")) {
                    if (concentracaoEssenciaPe > 15.0f) {
                        System.out.println("Concentração fora da faixa para EDT");
                    }
                    if (maceracaoMinimaPe < 30) {
                        maceracaoMinimaPe = 30;
                    }
                } else if (catPe.contains("colonia") || catPe.contains("cologne")) {
                    if (concentracaoEssenciaPe > 5.0f) {
                        System.out.println("Concentração fora da faixa para Colônia");
                    }
                    if (maceracaoMinimaPe < 15) {
                        maceracaoMinimaPe = 15;
                    }
                }
                if (nomeGravado != null && nomeGravado.length() > 20) {
                    System.out.println("Gravação limitada a 20 caracteres");
                }

                return new Perfume(volumeFrascoPe, precoVendaPe, concentracaoEssenciaPe, categoriaPe, maceracaoMinimaPe, nomeGravado);

            case 3:
                System.out.print("\nInsira o volume do frasco: ");
                int volumeFrascoD = scanner.nextInt();
                if (volumeFrascoD != 30 && volumeFrascoD != 50 && volumeFrascoD != 100) {
                    System.out.println("Volume inválido (30, 50 ou 100 ml)");
                }
                System.out.print("\nInsira o preço da venda: ");
                float precoVendaD = scanner.nextFloat();
                System.out.print("\nInsira a quantidade de varetas: ");
                int quantidadeVaretas = scanner.nextInt();
                if (quantidadeVaretas < 4 || quantidadeVaretas > 10) {
                    System.out.println("Quantidade de varetas deve ser entre 4 e 10");
                }

                return new Difusor(volumeFrascoD, precoVendaD, quantidadeVaretas);

            case 4:
                System.out.print("\nInsira o preço de venda: ");
                float precoVendaV = scanner.nextFloat();
                System.out.print("\nInsira o peso da cera: ");
                float pesoCera = scanner.nextFloat();
                System.out.print("\nInsira a concentração da fragrância: ");
                float concentracaoFragancia = scanner.nextFloat();
                if (pesoCera > 0 && (concentracaoFragancia / pesoCera) * 100 > 10.0f) {
                    System.out.println("Fragrância acima de 10% em relação ao peso da cera");
                }

                return new Vela(0, precoVendaV, pesoCera, concentracaoFragancia);

            default:
                System.out.println("Entrada de produto inválida!\nAbortando operação...");
                break;
        }
        return null;
    }
}
