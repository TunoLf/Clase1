package ejercicio2;

public class Ejercicio2D {
 
	public static void main(String[] args) {
	float ingresos = 250000;
	short vehiculos = 2;
	short inmuebles = 1;
	short activos = 0; 
		
		if ((ingresos >= 572386.50) && (vehiculos >= 3) && (inmuebles >= 3) && (activos >= 1)) System.out.println("Pertenece al segmento de ingresos altos."); 
		else if ((ingresos >= 163539) && (ingresos <= 572386.50) && (vehiculos >= 1) && (inmuebles <= 2) && (activos == 0)) System.out.println("Pertence al segmento de ingresos medios."); //  
		else if ((ingresos > 163539) && (inmuebles >= 1) && (vehiculos == 0) && (activos == 0)) System.out.println("Pertenece al segmento de ingresos bajos,");
	}
}

