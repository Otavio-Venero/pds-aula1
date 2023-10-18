package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPesoP;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesoPrato = new JLabel("Peso do Prato:");
		lblPesoPrato.setFont(new Font("Verdana", Font.BOLD, 15));
		lblPesoPrato.setBounds(10, 27, 121, 25);
		contentPane.add(lblPesoPrato);
		
		textPesoP = new JTextField();
		textPesoP.setBounds(141, 27, 103, 24);
		contentPane.add(textPesoP);
		textPesoP.setColumns(10);
		
		JLabel lblValorQuilo = new JLabel("Valor do Quilo:");
		lblValorQuilo.setFont(new Font("Verdana", Font.BOLD, 15));
		lblValorQuilo.setBounds(10, 71, 121, 25);
		contentPane.add(lblValorQuilo);
		
		textField = new JTextField();
		textField.setBounds(141, 73, 103, 24);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
