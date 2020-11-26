package Debug;

public class practica_1 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int aux = 0;
		int longitud = array.length;
		/** Inicio modificacion El array buscaba en una posicion fuera de sus limites por <=
		 * Solucion= Eliminar el igual
		 * 
		 * for (int i = 0; i <= longitud; i++)
		 * System.out.print(array[i] + " ");
		 * 
		 * Fin modificación
		 */ 
		for (int i = 0; i < longitud;i++) 
			System.out.print(array[i] + " ");
		/** Inicio modificación El array buscaba fuera de sus limites por el <= y 
		 * no podia empezar por la misma razon en aux=array[longitud - i]
		 * Soluciones= Eliminar el igual en la condicion del for de la linea 30 y añadir a la linea 
		 * aux=array[longitud - (i+1)]
		 * 
		 * for (int i = 0; i <= longitud / 2; i++) {	
			aux = array[longitud - i];
			array[longitud - i - 1] = array[i];
			array[i] = aux;
		}Fin modificación
		 */
		for (int i = 0; i < longitud / 2; i++) {	
			aux = array[longitud - (i+1)];
			array[longitud - i - 1] = array[i];
			array[i] = aux;
		}
		System.out.println();
		for (int i = 0; i < longitud; i++)
			System.out.print(array[i] + " ");
	}

}
