package taller3.televisores;

public class TV {
	private Marca marca = null;
	private int canal = 1;
	private int precio = 500;
	private boolean estado = true;
	private int volumen = 1;
	private Control control = null;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public int getCanal() {
		return this.canal;
	}
	public Marca getMarca() {
		return this.marca;
	}
	public Control getControl() {
		return this.control;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado(){
		return this.estado;
	}
	public void canalUp() {
		if(this.estado) {
			if(this.canal < 120 && this.canal > 0) {
				this.canal++;
			}			
		}
	}
	public void canalDown() {
		if(this.estado) {
			if(this.canal < 120 && this.canal > 0) {
				this.canal--;
			}			
		}
	}
	public void volumenUp() {
		if(this.estado) {
			if(this.volumen < 7 && this.volumen >= 0) {
				this.canal++;
			}			
		}
	}
	public void volumenDown() {
		if(this.estado) {
			if(this.volumen < 7 && this.volumen >= 0) {
				this.volumen++;
			}			
		}
	}
	
}
