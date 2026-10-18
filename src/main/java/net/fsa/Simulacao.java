package net.fsa;

import java.time.LocalDate;

import net.fsa.producao.MateriaPrima;
import net.fsa.producao.OleosEssenciais;

public class Simulacao {
    public static void main(String[] args) {
        // 5 óleos essenciais
        OleosEssenciais lavanda = new OleosEssenciais(
                "Óleo de Lavanda", "Óleo essencial puro de lavanda",
                LocalDate.of(2028, 3, 15), 45.90f, "Floral herbal", "coracao");
        OleosEssenciais laranja = new OleosEssenciais(
                "Óleo de Laranja Doce", "Óleo essencial extraído da casca da laranja",
                LocalDate.of(2027, 11, 20), 28.50f, "Cítrico", "topo");
        OleosEssenciais sandalo = new OleosEssenciais(
                "Óleo de Sândalo", "Óleo essencial de sândalo amadeirado",
                LocalDate.of(2029, 6, 10), 120.00f, "Amadeirado", "fundo");
        OleosEssenciais hortela = new OleosEssenciais(
                "Óleo de Hortelã-Pimenta", "Óleo essencial refrescante de hortelã",
                LocalDate.of(2027, 8, 5), 35.75f, "Mentolado", "topo");
        OleosEssenciais ylang = new OleosEssenciais(
                "Óleo de Ylang-Ylang", "Óleo essencial floral e adocicado",
                LocalDate.of(2028, 9, 30), 85.00f, "Floral adocicado", "coracao");

        // Matérias-primas
        MateriaPrima alcool = new MateriaPrima(
                "Álcool de Cereais", "Álcool para base de perfumes e home sprays",
                LocalDate.of(2027, 12, 31), 18.90f);
        MateriaPrima parafina = new MateriaPrima(
                "Parafina", "Parafina para fabricação de velas",
                LocalDate.of(2030, 1, 1), 22.00f);
        MateriaPrima vareta = new MateriaPrima(
                "Vareta de Difusor", "Vareta de bambu para difusor de ambiente",
                LocalDate.of(2031, 5, 20), 0.80f);
        MateriaPrima cera = new MateriaPrima(
                "Cera de Soja", "Cera vegetal para velas aromáticas",
                LocalDate.of(2029, 4, 15), 31.40f);
    }
}