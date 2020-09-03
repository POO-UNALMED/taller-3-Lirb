package taller3.televisores;

public class Marca {
	private String nombre_marca;
	
	public Marca(String nombre_marca){
		this.nombre_marca = nombre_marca;
	}
	public String getNombre() {
		return this.nombre_marca;
	}
	public void set_Nombre(String nombre_marca) {
		this.nombre_marca = nombre_marca;
	}
}
