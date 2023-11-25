package modelo;

public enum Combustivel {

	Diesel(1, "Diesel"), Comum(2, "Gasolina Comum"), Aditivada(3, "Gasolina Aditivada"), Etanol(4, "Etanol");
	
	private int codigo;
	private String descricao;
	
	private Combustivel (int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return this.descricao;
	}
	
}
