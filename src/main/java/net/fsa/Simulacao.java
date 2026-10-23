package net.fsa;

import java.util.List;

import net.fsa.pessoas.Cliente;
import net.fsa.pessoas.Funcionario;
import net.fsa.producao.Estoque;
import net.fsa.producao.MateriaPrima;

public class Simulacao {
    public static void main(String[] args) {
        List<MateriaPrima> materiaPrima = Data.materiaPrima();

        Funcionario f = new Funcionario("John Doe", "12345678900", "1111111111", "Junior", null);
        f.produzirNovo();
        Cliente C = new Cliente("Ana","98765432100","1111111111");
    }
}