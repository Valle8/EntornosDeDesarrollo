package junit;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MenorMayorPrimo {

	public static void main(String[] args) {
//		String num = JOptionPane.showInputDialog("Introduce el número");
//		int numero = Integer.parseInt(num);
//		int cantidad[] = new int[numero];
//		int ultpri[] = new int[3];
//		ultimos3Primos(cantidad, primos, ultpri);
//		System.out.println("Los ultimos primos son: ");
//		for (int i = 0; i < ultpri.length; i++) {
//			System.out.println(ultpri[i]);
//		}
		
		
		
		
//		int numeros[] = new int [3];
//		for (int i = 0; i < numeros.length; i++) {
//		    String ent = JOptionPane.showInputDialog("Introduzca un número");
//			numeros[i]=Integer.parseInt(ent);
//		}
//		int maymen[]=mayorMenor(numeros);
//		for (int i = 0; i < maymen.length; i++) {
//			if (i==0) {
//				System.out.println("El mayor es: " + maymen[i]);
//			}
//			if (i==1) {
//				System.out.println("El menor es: " + maymen[i]);
//			}
//		}
	}
	

	
	
	/**
	 * 
	 * @param cantidad
	 * @param primos
	 * @param ultpri
	 */
	public static int[] ultimos3Primos(int num) {
		List<Integer> primos = new ArrayList<Integer>();
		int array[]= new int[num];
		int ultpri[] = new int[3];
		for (int i = 0; i < array.length; i++) {
			array[i]=i;
		}
		for (int i = 0; i < array.length; i++) {
			boolean esPrimo = true;
			for (int j = 2; j < array[i] - 1; j++) {
				if (array[i] % j == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo == true) {
				primos.add(array[i]);
			}
		}
		for (int i = 0; i < ultpri.length; i++) {
			ultpri[i]=primos.get(primos.size()-(1+i));
		}
		return ultpri;
	}
	public static int[] mayorMenor (int numeros[]) {
		int mayor=0;
		int menor=0;
		for (int i = 0; i < numeros.length; i++) {
			if (i==0) {
				mayor = numeros[i];
			    menor = numeros[i];
			}
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		int maymen[]= new int [] {mayor,menor};
		return maymen;		
	}
	
	
	
	
	
	
}
