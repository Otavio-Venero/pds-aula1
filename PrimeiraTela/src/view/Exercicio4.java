package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Gasolina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPG;
	private JTextField textVP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreçoG = new JLabel("Preço da Gasolina:");
		lblPreçoG.setFont(new Font("Verdana", Font.BOLD, 15));
		lblPreçoG.setBounds(23, 13, 151, 20);
		contentPane.add(lblPreçoG);
		
		JLabel lblValorPagar = new JLabel("Valor para Pagar:");
		lblValorPagar.setFont(new Font("Verdana", Font.BOLD, 15));
		lblValorPagar.setBounds(23, 70, 151, 20);
		contentPane.add(lblValorPagar);
		
		textPG = new JTextField();
		textPG.setBounds(184, 11, 137, 28);
		contentPane.add(textPG);
		textPG.setColumns(10);
		
		textVP = new JTextField();
		textVP.setBounds(184, 68, 137, 28);
		contentPane.add(textVP);
		textVP.setColumns(10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(267, 183, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPG.setText("");
				textVP.setText("");
			}
		});
		btnLimpar.setBounds(10, 183, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PG = textPG.getText();
				String VP = textPG.getText();

				float PGF = Float.valueOf(PG);
				float VPF = Float.valueOf(VP);
				float result = PGF * VPF;
				Gasolina gas = new Gasolina();
				float litro = gas.calculog(VPF,result);
				String sresult = String.format("%.2f", result);
				JOptionPane.showMessageDialog(null, "É possivel colocar: "+litro +" e custará: "+sresult);


			}
		});
		btncalcular.setFont(new Font("Verdana", Font.BOLD, 15));
		btncalcular.setBounds(116, 131, 137, 28);
		contentPane.add(btncalcular);
	}

}
