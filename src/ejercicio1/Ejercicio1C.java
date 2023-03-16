package ejercicio1;

public class Ejercicio1C {

	public static void main(String[] args) {
		int numeroInicio = 4;
		int numeroFin = 17;	
		boolean opcion = false;

// Elige si mostrar pares o impares usando la variable booleana 'opcion' (El valor false imprime impar, sin embargo true imprime par).

		if (opcion == true) {
			System.out.print("Números pares del 4 al 17: ");
			while (numeroInicio < numeroFin) {				
				if (numeroInicio%2 == 0) System.out.print(numeroInicio + " ");
				numeroInicio++;
			}
		}
		else {
			System.out.print("Números impares 4 al 17: ");
			while (numeroInicio < numeroFin) {
				if (numeroInicio%2 == 1) System.out.print(+ numeroInicio + " ");
				numeroInicio++;
			}
		}
	}
}