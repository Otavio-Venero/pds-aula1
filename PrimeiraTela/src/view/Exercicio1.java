package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.ConversaoTemperatura;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTemperatura;
	private JButton btnFechar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio1() {
		setTitle("Exercicio 1 - Calculo de temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTemperaturatxt = new JLabel("Temperatura (F):");
		lblTemperaturatxt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTemperaturatxt.setBounds(68, 28, 116, 24);
		contentPane.add(lblTemperaturatxt);
		
		textTemperatura = new JTextField();
		textTemperatura.setBounds(209, 32, 86, 20);
		contentPane.add(textTemperatura);
		textTemperatura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempDigitada = textTemperatura.getText();
				float tempConvertidaf = Float.valueOf(tempDigitada);
				ConversaoTemperatura conv = new ConversaoTemperatura();
				float tempC = conv.converterFtoC(tempConvertidaf);
				String tempFormatada = String.format("%.2f", tempC);
				JOptionPane.showMessageDialog(null, "Temperatura convertida: "+tempFormatada);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCalcular.setBounds(147, 85, 116, 33);
		contentPane.add(btnCalcular);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(10, 151, 89, 23);
		contentPane.add(btnFechar);
	}

}
