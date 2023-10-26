package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormSobre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSobre frame = new FormSobre();
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
	public FormSobre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnOK.setBounds(143, 185, 89, 23);
		contentPane.add(btnOK);
		
		JLabel lblNewLabel = new JLabel("CalcInvest - Calculadora de Invetimentos");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel.setBounds(33, 19, 316, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblVersao = new JLabel("Versão: 1.0");
		lblVersao.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblVersao.setBounds(33, 56, 98, 14);
		contentPane.add(lblVersao);
		
		JLabel lblNewLabel_1 = new JLabel("Autor: Otávio Miguel Goulart Venero");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(33, 89, 271, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contato: otavio.m13@aluno.ifsc.edu.br");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(33, 125, 305, 23);
		contentPane.add(lblNewLabel_2);
	}
}
