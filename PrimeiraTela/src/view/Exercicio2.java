package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrimeiroNome;
	private JTextField textSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setTitle("Exercicio 2 - Nome completo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPrimeiroNome = new JTextField();
		textPrimeiroNome.setBounds(115, 30, 177, 20);
		contentPane.add(textPrimeiroNome);
		textPrimeiroNome.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(115, 61, 177, 20);
		contentPane.add(textSobrenome);
		textSobrenome.setColumns(10);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textPrimeiroNome.getText();
				String sobrenome = textSobrenome.getText();
				//JOptionPane.showMessageDialog(null, "O nome completor é: "+nome " " +sobrenome);
				JOptionPane.showMessageDialog(null, "O nome completor é: "+nome +" " +sobrenome);
			}
		});
		btnValidar.setBounds(160, 118, 89, 23);
		contentPane.add(btnValidar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPrimeiroNome.setText("");
				textSobrenome.setText("");
			}
		});
		btnLimpar.setBounds(160, 153, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(262, 187, 89, 23);
		contentPane.add(btnFechar);
		
		JLabel lblPN = new JLabel("Primeiro Nome");
		lblPN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPN.setBounds(10, 33, 95, 14);
		contentPane.add(lblPN);
		
		JLabel lblSN = new JLabel("Sobrenome");
		lblSN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSN.setBounds(10, 64, 82, 17);
		contentPane.add(lblSN);
	}

}
