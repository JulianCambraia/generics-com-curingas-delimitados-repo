package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circulo;
import model.entities.Figura;
import model.entities.Retangulo;

public class GenericsComCuringasDelimitadosMainProgram {

	public static void main(String[] args) {
		List<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Retangulo(3.0, 4.0));
		figuras.add(new Circulo(3.00));
		figuras.add(new Retangulo(5.00, 6.00));
		figuras.add(new Circulo(2.00));
		
		List<Circulo> circulos = new ArrayList<>();
		circulos.add(new Circulo(2.5));
		circulos.add(new Circulo(1.13));
		
		System.out.println("Soma das áreas de todas as figuras: " + String.format("%.2f",totalAreas(figuras)));
		System.out.println("Soma das áreas dos Circulos: " + String.format("%.2f",totalAreas(circulos)));
	}
	
	public static Double totalAreas(List<? extends Figura> list) {
		Double soma = 0.00;
		for (Figura figura : list) {
			soma+= figura.area();
		}
		
		return soma;
	}

}
