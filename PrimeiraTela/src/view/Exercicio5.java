package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.CalculoPeso;
import Model.Retangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPesoP;
	private JTextField textValorQ;
	private JButton btnLimpar;
	private JButton btnCalcular;

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
		setBounds(100, 100, 336, 257);
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
		
		textValorQ = new JTextField();
		textValorQ.setBounds(141, 73, 103, 24);
		contentPane.add(textValorQ);
		textValorQ.setColumns(10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(221, 188, 89, 23);
		contentPane.add(btnFechar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorQ.setText("");
				textPesoP.setText("");
			}
		});
		btnLimpar.setBounds(10, 188, 89, 23);
		contentPane.add(btnLimpar);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Verdana", Font.BOLD, 15));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PP = textPesoP.getText();
				String VQ = textValorQ.getText();
				float PPF = Float.valueOf(PP);
				float VQF = Float.valueOf(VQ);
				CalculoPeso calculop = new CalculoPeso();
				float calculopeso = calculop.calculopeso(PPF,VQF);
				String scalculopeso = String.format("%.2f", calculopeso);
				JOptionPane.showMessageDialog(null, "O prato pesa: "+PPF +" e custará: "+scalculopeso);
				//JOptionPane.showMessageDialog(null, );
				
			}
		});
		btnCalcular.setBounds(105, 126, 108, 36);
		contentPane.add(btnCalcular);
		
		JLabel lblValorFixo = new JLabel("R$ 9.95");
		lblValorFixo.setBounds(246, 78, 46, 14);
		contentPane.add(lblValorFixo);
	}
}
