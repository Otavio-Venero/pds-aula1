package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButton2 extends JFrame {

	private JPanel contentPane;
	private JTextField textPrimeiroNumero;
	private JTextField textSegundoNumero;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnDivisao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton2 frame = new RadioButton2();
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
	public RadioButton2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel lblPrimeroNumero = new JLabel("Primero Número:");
		panel_2.add(lblPrimeroNumero);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		textPrimeiroNumero = new JTextField();
		panel.add(textPrimeiroNumero);
		textPrimeiroNumero.setColumns(10);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Segundo Número:");
		panel_3.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		textSegundoNumero = new JTextField();
		panel_1.add(textSegundoNumero);
		textSegundoNumero.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JRadioButton rdbtnAdicao = new JRadioButton("Adição ( + )");
		buttonGroup.add(rdbtnAdicao);
		panel_4.add(rdbtnAdicao);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("Subtração ( - )");
		buttonGroup.add(rdbtnSubtracao);
		panel_5.add(rdbtnSubtracao);
		
		JLabel label_7_1 = new JLabel("");
		contentPane.add(label_7_1);
		
		JLabel label_9_1 = new JLabel("");
		contentPane.add(label_9_1);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		
		JRadioButton rdbtnMutiplicacao = new JRadioButton("Multiplicação ( x )");
		buttonGroup.add(rdbtnMutiplicacao);
		panel_6.add(rdbtnMutiplicacao);
		
		JLabel label_3_1 = new JLabel("");
		panel_6.add(label_3_1);
		
	
		
		JLabel label_4 = new JLabel("");
		panel_6.add(label_4);
		
		JLabel label_7_2 = new JLabel("");
		contentPane.add(label_7_2);
		
		
		
		JLabel label_6 = new JLabel("");
		contentPane.add(label_6);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		
		rdbtnDivisao = new JRadioButton("Divisão ( / )");
		panel_7.add(rdbtnDivisao);
		
		JLabel labelResultad = new JLabel("");
		contentPane.add(labelResultad);
		
		
		JLabel label_5_2_1 = new JLabel("");
		contentPane.add(label_5_2_1);
		
		JLabel label_7_3 = new JLabel("");
		contentPane.add(label_7_3);
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String primero = textPrimeiroNumero.getText();
				String segundo = textSegundoNumero.getText();
				Float primeirof = Float.valueOf(primero);
				Float segundof = Float.valueOf(segundo);
				
				if(rdbtnAdicao.isSelected()){
					float result = primeirof + segundof;
					labelResultad.setText("Resultado: " + result);
				}else
				if(rdbtnSubtracao.isSelected()){
					float result = primeirof - segundof;
					labelResultad.setText("Resultado: " + result);
				}
				if(rdbtnMutiplicacao.isSelected()){
					float result = primeirof * segundof;
					labelResultad.setText("Resultado: " + result);
				}
				if(rdbtnDivisao.isSelected()){
					float result = primeirof / segundof;
					labelResultad.setText("Resultado: " + result);
				}else { labelResultad.setText("Insira uma Operação");}
				//labelResultado.setText("Resultado: ");
			}
		});
		panel_8.add(btnCalcular);
		
		JLabel label_7 = new JLabel("");
		contentPane.add(label_7);
		
		JPanel panel_10 = new JPanel();
		contentPane.add(panel_10);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panel_10.add(btnFechar);
		
		JLabel label_8 = new JLabel("");
		contentPane.add(label_8);
		
		JPanel panel_11 = new JPanel();
		contentPane.add(panel_11);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPrimeiroNumero.setText(" ");
				textSegundoNumero.setText(" ");
				labelResultad.setText(" ");
			}
		});
		panel_11.add(btnLimpar);
		
		JLabel label_9 = new JLabel("");
		contentPane.add(label_9);
	}
}
