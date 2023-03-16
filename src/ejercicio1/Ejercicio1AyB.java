package ejercicio1;

public class Ejercicio1AyB {

	public static void main(String[] args) {
		int numeroInicio = 4;
		int numeroFin = 17;	
		
// Imprime valores pares del numeroInicio al numeroFin.
		
		System.out.print("Números pares del 4 al 17: ");
		while (numeroInicio < numeroFin) {
			if (numeroInicio%2 == 0) System.out.print(numeroInicio + " ");
			numeroInicio++;
		}
	}
}