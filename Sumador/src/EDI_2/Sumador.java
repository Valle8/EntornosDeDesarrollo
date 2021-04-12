package EDI_2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sumador {

	private JFrame frame;
	private JTextField jtfnum1;
	private JTextField jtfnum2;
	private JTextField jtfresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sumador window = new Sumador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sumador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblnum1 = new JLabel("Numero 1: ");
		GridBagConstraints gbc_lblnum1 = new GridBagConstraints();
		gbc_lblnum1.anchor = GridBagConstraints.EAST;
		gbc_lblnum1.insets = new Insets(0, 0, 5, 5);
		gbc_lblnum1.gridx = 0;
		gbc_lblnum1.gridy = 0;
		frame.getContentPane().add(lblnum1, gbc_lblnum1);
		
		jtfnum1 = new JTextField();
		GridBagConstraints gbc_jtfnum1 = new GridBagConstraints();
		gbc_jtfnum1.insets = new Insets(0, 0, 5, 0);
		gbc_jtfnum1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfnum1.gridx = 1;
		gbc_jtfnum1.gridy = 0;
		frame.getContentPane().add(jtfnum1, gbc_jtfnum1);
		jtfnum1.setColumns(10);
		
		JLabel lblnum2 = new JLabel("Numero 2: ");
		GridBagConstraints gbc_lblnum2 = new GridBagConstraints();
		gbc_lblnum2.anchor = GridBagConstraints.EAST;
		gbc_lblnum2.insets = new Insets(0, 0, 5, 5);
		gbc_lblnum2.gridx = 0;
		gbc_lblnum2.gridy = 1;
		frame.getContentPane().add(lblnum2, gbc_lblnum2);
		
		jtfnum2 = new JTextField();
		GridBagConstraints gbc_jtfnum2 = new GridBagConstraints();
		gbc_jtfnum2.insets = new Insets(0, 0, 5, 0);
		gbc_jtfnum2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfnum2.gridx = 1;
		gbc_jtfnum2.gridy = 1;
		frame.getContentPane().add(jtfnum2, gbc_jtfnum2);
		jtfnum2.setColumns(10);
		
		JLabel lblresultado = new JLabel("Resultado: ");
		GridBagConstraints gbc_lblresultado = new GridBagConstraints();
		gbc_lblresultado.anchor = GridBagConstraints.EAST;
		gbc_lblresultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblresultado.gridx = 0;
		gbc_lblresultado.gridy = 2;
		frame.getContentPane().add(lblresultado, gbc_lblresultado);
		
		jtfresultado = new JTextField();
		GridBagConstraints gbc_jtfresultado = new GridBagConstraints();
		gbc_jtfresultado.insets = new Insets(0, 0, 5, 0);
		gbc_jtfresultado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfresultado.gridx = 1;
		gbc_jtfresultado.gridy = 2;
		frame.getContentPane().add(jtfresultado, gbc_jtfresultado);
		jtfresultado.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		gbc_panel.gridwidth = 2;
		frame.getContentPane().add(panel, gbc_panel);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sumar();
			}
		});
		panel.add(btnSumar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cerrarAplicacion(frame);
			}
		});
		panel.add(btnSalir);
	}
	
	
	public void sumar() {
		int num1 = Integer.parseInt(jtfnum1.getText());
		int num2 = Integer.parseInt(jtfnum2.getText());
		
		int resultado = num1 + num2;
		
		jtfresultado.setText("" + resultado);
	}
	
	private static void cerrarAplicacion(JFrame ventana) {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana,"Desea cerrar la aplicacion?","Salir de la aplicacion",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
