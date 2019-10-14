package model.entities;

public class Circulo implements Figura {

	private Double raio;

	public Circulo() {
		super();
	}

	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio, 2);
	}

}
