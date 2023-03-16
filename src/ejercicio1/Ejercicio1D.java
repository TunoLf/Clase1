package ejercicio1;

public class Ejercicio1D {

	public static void main(String[] args) {
		int numeroInicio = 4;
		int numeroFin = 17;	
		
// Imprime valores pares del numeroFin al numeroInicio utilizando el 'for' con una variable índice.
		
		System.out.print("Números pares del 4 al 17 en sentido contrario: ");
		for (int i = numeroFin; i >= numeroInicio; i--) {			
			if ((numeroFin%2) == 0) System.out.print(numeroFin + " ");
			numeroFin--;
		}
	}
}