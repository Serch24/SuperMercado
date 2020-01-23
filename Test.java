package practica16_Supermercado;

public class Test {

	public static void main(String[] args) {
		Productos producto1 = new Productos("tilapia", "es rojo y blanco", 7.0, 2, Categoria.PESCADERIA);
		Productos producto2 = new Productos("manzana", "rica", 2.0, 1, Categoria.FRUTERIA);
		Productos producto3 = new Productos("acetaminofen", "para curar", 2.0, 5, Categoria.DROGERIA);
		Cesta primero = new Cesta();

		primero.push(producto2);
		primero.push(producto1);
		primero.push(producto3);
		System.out.println(primero.costeCesta());

	}

}
