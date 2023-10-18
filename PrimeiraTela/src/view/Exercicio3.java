package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.ConversaoTemperatura;
import Model.Retangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setTitle("Calcular um retangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setVerticalAlignment(SwingConstants.TOP);
		lblBase.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblBase.setBounds(50, 11, 84, 42);
		contentPane.add(lblBase);
		
		textBase = new JTextField();
		textBase.setBounds(156, 11, 112, 35);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setVerticalAlignment(SwingConstants.TOP);
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFechar.setBounds(204, 227, 89, 23);
		contentPane.add(btnFechar);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblAltura.setBounds(50, 64, 97, 56);
		contentPane.add(lblAltura);
		
		textAltura = new JTextField();
		textAltura.setBounds(156, 72, 112, 35);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBase.setText(" ");
				textAltura.setText(" ");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpar.setBounds(23, 227, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCalcucular = new JButton("Calcular");
		btnCalcucular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String base = textBase.getText();
				String altura = textAltura.getText();
				float basef = Float.valueOf(base);
				float alturaf = Float.valueOf(altura);
				Retangulo calculo = new Retangulo();
				
				float perimetro = calculo.calculop(basef,alturaf);
				String sperimetro = String.format("%.2f", perimetro);
				
				float area = calculo.calculoa(basef,alturaf);
				String sarea = String.format("%.2f", area);
				JOptionPane.showMessageDialog(null, "O Perimetro do retangulo é: "+sperimetro +" e a Área é: " +sarea);
				
				
			}
		});
		btnCalcucular.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCalcucular.setBounds(85, 144, 141, 35);
		contentPane.add(btnCalcucular);
	}
}
