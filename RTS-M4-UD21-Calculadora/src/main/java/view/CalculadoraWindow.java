package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;

public class CalculadoraWindow {

	private JFrame frame;
	private Color GRIS = new Color(28,28,28);
	private Color NEGRO = new Color(18,18,18);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraWindow window = new CalculadoraWindow();
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
	public CalculadoraWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(GRIS);
		frame.setBounds(100, 100, 720, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panelNumeros = new JPanel();
		panelNumeros.setBackground(GRIS);
		frame.getContentPane().add(panelNumeros, BorderLayout.EAST);
		panelNumeros.setBounds(442, 11, 252, 420);
		panelNumeros.setLayout(new GridLayout(0, 3, 2, 2));
		
		JPanel panelFill = new JPanel();
		panelFill.setBackground(GRIS);
		panelNumeros.add(panelFill);
		
		JButton btnCE = new JButton("CE");
		btnCE.setForeground(Color.WHITE);
		btnCE.setBackground(NEGRO);
		btnCE.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		btnCE.setBorder(BorderFactory.createLineBorder(NEGRO,1));
		panelNumeros.add(btnCE);
		
		
		JButton btnDelete = new JButton("<x");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(NEGRO);
		btnDelete.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnDelete.setBorder(BorderFactory.createLineBorder(NEGRO,1));
		panelNumeros.add(btnDelete);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setForeground(Color.WHITE);
		btnNum1.setBackground(Color.BLACK);
		btnNum1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum1.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setForeground(Color.WHITE);
		btnNum2.setBackground(Color.BLACK);
		btnNum2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum2.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setForeground(Color.WHITE);
		btnNum3.setBackground(Color.BLACK);
		btnNum3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum3.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum3);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setForeground(Color.WHITE);
		btnNum4.setBackground(Color.BLACK);
		btnNum4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum4.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setForeground(Color.WHITE);
		btnNum5.setBackground(Color.BLACK);
		btnNum5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum5.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setForeground(Color.WHITE);
		btnNum6.setBackground(Color.BLACK);
		btnNum6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum6.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum6);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.setForeground(Color.WHITE);
		btnNum7.setBackground(Color.BLACK);
		btnNum7.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum7.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setForeground(Color.WHITE);
		btnNum8.setBackground(Color.BLACK);
		btnNum8.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum8.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setForeground(Color.WHITE);
		btnNum9.setBackground(Color.BLACK);
		btnNum9.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum9.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum9);
		
		JPanel panelFill1 = new JPanel();
		panelFill1.setBackground(GRIS);
		panelNumeros.add(panelFill1);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setForeground(Color.WHITE);
		btnNum0.setBackground(Color.BLACK);
		btnNum0.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnNum0.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnNum0);
		
		JButton btnComa = new JButton(",");
		btnComa.setForeground(Color.WHITE);
		btnComa.setBackground(Color.BLACK);
		btnComa.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		btnComa.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panelNumeros.add(btnComa);
		
		JPanel panelMonedaOrigen = new JPanel();
		panelMonedaOrigen.setBackground(GRIS);
		panelMonedaOrigen.setBounds(10, 92, 190, 109);
		frame.getContentPane().add(panelMonedaOrigen);
		panelMonedaOrigen.setLayout(null);
		
		JLabel lblDineroOrigen = new JLabel("0 $");
		lblDineroOrigen.setForeground(Color.WHITE);
		lblDineroOrigen.setFont(new Font("Segoe UI Semibold", Font.BOLD, 36));
		lblDineroOrigen.setBounds(8, 7, 172, 58);
		panelMonedaOrigen.add(lblDineroOrigen);
		
		JComboBox comboBoxMonedaOrigen = new JComboBox();
		comboBoxMonedaOrigen.setBackground(GRIS);
		comboBoxMonedaOrigen.setForeground(Color.WHITE);
		comboBoxMonedaOrigen.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		comboBoxMonedaOrigen.setBounds(8, 76, 172, 22);
		panelMonedaOrigen.add(comboBoxMonedaOrigen);
		
		JPanel panelMonedaFin = new JPanel();
		panelMonedaFin.setBackground(GRIS);
		panelMonedaFin.setLayout(null);
		panelMonedaFin.setBounds(10, 239, 190, 109);
		frame.getContentPane().add(panelMonedaFin);
		
		JLabel lblDineroFin = new JLabel("0 \u20AC");
		lblDineroFin.setForeground(Color.WHITE);
		lblDineroFin.setFont(new Font("Segoe UI", Font.PLAIN, 36));
		lblDineroFin.setBounds(8, 7, 172, 58);
		panelMonedaFin.add(lblDineroFin);
		
		JComboBox comboBoxMonedaFin = new JComboBox();
		comboBoxMonedaFin.setBackground(GRIS);
		comboBoxMonedaFin.setForeground(Color.WHITE);
		comboBoxMonedaFin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		
		comboBoxMonedaFin.setBounds(8, 76, 172, 22);
		panelMonedaFin.add(comboBoxMonedaFin);
		
		JLabel lblCambio = new JLabel("1 USD = 0,9777 EUR");
		lblCambio.setForeground(Color.WHITE);
		lblCambio.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblCambio.setBounds(10, 398, 190, 20);
		frame.getContentPane().add(lblCambio);
		
		
	}
}