package practica16_Supermercado;

public class Cesta {
	private NodoProducto cima;

	public Cesta() {
		this.cima = null;
	}

	public double costeCesta() {
		NodoProducto x = this.cima;
		double variable = 0.0;
		Productos producto;
		while (x != null) {
			producto = x.getValor();
			variable += producto.precioVenta();

			x = x.getSigueinte();
		}
		return variable;
	}

	public boolean isEmpty() {
		boolean valor;
		if (this.cima == null) {
			valor = true;
		} else {
			valor = false;
		}
		return valor;
	}

	public Productos pop() {
		NodoProducto elemento;
		Productos valor;
		if (isEmpty() == true) {
			valor = null;
		} else {
			valor = this.cima.getValor();
			elemento = this.cima.getSigueinte();
			this.cima = null;
			this.cima = elemento;
		}
		return valor;
	}

	public void push(Productos producto) {
		NodoProducto x = new NodoProducto(producto);
		x.setSiguiente(this.cima);
		this.cima = x;
	}

}
