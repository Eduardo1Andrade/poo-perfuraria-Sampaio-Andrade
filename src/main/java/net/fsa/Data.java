package net.fsa;

import java.time.LocalDate;
import java.util.List;

import net.fsa.producao.MateriaPrima;
import net.fsa.producao.OleosEssenciais;

public class Data {
	// 5 óleos essenciais
	static OleosEssenciais lavanda = new OleosEssenciais(
			"Óleo de Lavanda", "Óleo essencial puro de lavanda",
			LocalDate.of(2028, 3, 15), 45.90f, "Floral herbal", "coracao");
	static OleosEssenciais laranja = new OleosEssenciais(
			"Óleo de Laranja Doce", "Óleo essencial extraído da casca da laranja",
			LocalDate.of(2027, 11, 20), 28.50f, "Cítrico", "topo");
	static OleosEssenciais sandalo = new OleosEssenciais(
			"Óleo de Sândalo", "Óleo essencial de sândalo amadeirado",
			LocalDate.of(2029, 6, 10), 120.00f, "Amadeirado", "fundo");
	static OleosEssenciais hortela = new OleosEssenciais(
			"Óleo de Hortelã-Pimenta", "Óleo essencial refrescante de hortelã",
			LocalDate.of(2027, 8, 5), 35.75f, "Mentolado", "topo");
	static OleosEssenciais ylang = new OleosEssenciais(
			"Óleo de Ylang-Ylang", "Óleo essencial floral e adocicado",
			LocalDate.of(2028, 9, 30), 85.00f, "Floral adocicado", "coracao");

	// Matérias-primas
	static MateriaPrima alcool = new MateriaPrima(
			"Álcool de Cereais", "Álcool para base de perfumes e home sprays",
			LocalDate.of(2027, 12, 31), 18.90f);
	public static MateriaPrima parafina = new MateriaPrima(
			"Parafina", "Parafina para fabricação de velas",
			LocalDate.of(2030, 1, 1), 22.00f);
	static MateriaPrima vareta = new MateriaPrima(
			"Vareta de Difusor", "Vareta de bambu para difusor de ambiente",
			LocalDate.of(2031, 5, 20), 0.80f);
	public static MateriaPrima cera = new MateriaPrima(
			"Cera de Soja", "Cera vegetal para velas aromáticas",
			LocalDate.of(2029, 4, 15), 31.40f);

	// Retorna a lista com os objetos criados
	public static List<MateriaPrima> materiaPrima() {
		return List.of(lavanda, laranja, sandalo, hortela, ylang,
				alcool, parafina, vareta, cera);
	}
}
