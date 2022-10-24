package poo;

public class App {

	public static void main(String[] args) {
		Computadora pc1 = new Computadora();
		//pc1.cantidadRAM = 8;
		//pc1.espacioDisco = 1024;
		//pc1.frecuenciaTrabajo = 3.5;
		//pc1.marca = "Dell";
		//pc1.precio = 500.00;
		//pc1.vidaUtil = 5;		
		pc1.ponerMarca("Dell");
		pc1.ponerCantidadRAM(8);
		pc1.ponerEspacioDisco(1024);
		pc1.ponerFrecuenciaTrabajo(3.5);
		pc1.ponerPrecio(500.00);
		pc1.ponerVidaUtil(5);
		
		Computadora pc2 = new Computadora();
		//pc2.cantidadRAM = 12;
		//pc2.espacioDisco = 2048;
		//pc2.frecuenciaTrabajo = 3.9;
		//pc2.marca = "Asus";
		//pc2.precio = 980.00;
		//pc2.vidaUtil = 4;
		pc2.ponerCantidadRAM(12);
		pc2.ponerEspacioDisco(2048);
		pc2.ponerFrecuenciaTrabajo(3.9);
		pc2.ponerMarca("Asus");
		pc2.ponerPrecio(980.00);
		pc2.ponerVidaUtil(4);
		
		Computadora pc3 = new Computadora();
		pc3.ponerCantidadRAM(512);
		pc3.ponerMarca("Lenovo");
		
		System.out.println("Marca de la pc1 = " + pc1.mostrarMarca());
		System.out.println("Precio de la pc1 = " + pc1.mostrarPrecio());
		System.out.println("Marca de la pc2 = " + pc2.mostrarMarca());
		System.out.println("Precio de la pc2 = " + pc2.mostrarPrecio());
		System.out.println("Marca de la pc3 = " + pc3.mostrarMarca());
		System.out.println("Precio de la pc3 = " + pc3.mostrarPrecio());
		
	}

}
