package junit;

import javax.swing.JOptionPane;

public class MenorMayorPrimo {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Introduce el número");
		int numero = Integer.parseInt(num);
		int cantidad[] = new int[numero];
		for (int i = 0; i < cantidad.length; i++) {
			cantidad[i]=i;
		}
//		for (int i = 0; i < cantidad.length; i++) {
//			System.out.println(cantidad[i]);
//		}
		for (int i = 0; i < cantidad.length; i++) {
			boolean esPrimo = true;
			for (int j = 2; j < cantidad[i] - 1; j++) {
				if (cantidad[i] % j == 0) {
					esPrimo = false;
					System.out.println(cantidad[i] + "    no es primo");
				}
			}
			if (esPrimo == true) {
				System.out.println(cantidad[i] + "    es primo");
			}
		}
		
	}
	
}
