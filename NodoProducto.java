package practica16_Supermercado;


public class NodoProducto {
	private Productos valor;
	private NodoProducto siguiente;

	// constructor
	public NodoProducto(Productos valor) {
		this.valor = valor;
		this.siguiente = null;
	}

	// METODO SETTER
	public void setSiguiente(NodoProducto n) {
		this.siguiente = n;
	}

	// METODO GETTER
	public NodoProducto getSigueinte() {
		return this.siguiente;
	}

	// metodo getter.
	public Productos getValor() {
		return this.valor;
	}
	
	@Override
	public String toString() {
		return this.valor.toString();
	}

}
