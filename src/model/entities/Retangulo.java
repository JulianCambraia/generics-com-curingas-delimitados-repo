package model.entities;

public class Retangulo implements Figura {

	private Double largura;
	private Double altura;

	public Retangulo() {
		super();
	}

	public Retangulo(Double largura, Double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double area() {

		return largura * altura;
	}

}
