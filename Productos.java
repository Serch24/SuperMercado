package practica16_Supermercado;

//propiedades
public class Productos {
	private int cantidad;
	private Categoria categoria;
	private double coste;
	private String descripcion;
	private String nombre;

	// constructor
	public Productos(String nombre, String descripcion, double coste, int cantidad, Categoria categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.coste = coste;
		this.cantidad = cantidad;
		this.categoria = categoria;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public double getcoste() {
		return this.coste;
	}

	public double precioVenta() {
		return this.cantidad * this.coste;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	@Override
	public String toString() {
		return "El producto " + this.nombre + ", de categoria " + this.categoria + " tiene un coste de " + getcoste()
				+ "€";
	}

}
