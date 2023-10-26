package roteiro1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDeposito;
	private final JLabel lblNumDeMeses = new JLabel("Num. de Meses:");
	private JTextField textNumDeMeses;
	private JTextField textJuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeposito = new JLabel("Depósito Mesal R$:");
		lblDeposito.setBounds(68, 18, 92, 14);
		contentPane.add(lblDeposito);
		
		textDeposito = new JTextField();
		textDeposito.setBounds(25, 43, 183, 20);
		contentPane.add(textDeposito);
		textDeposito.setColumns(10);
		lblNumDeMeses.setBounds(83, 74, 77, 14);
		contentPane.add(lblNumDeMeses);
		
		textNumDeMeses = new JTextField();
		textNumDeMeses.setBounds(25, 88, 183, 20);
		contentPane.add(textNumDeMeses);
		textNumDeMeses.setColumns(10);
		
		JLabel lblJuros = new JLabel("Juros ao mês %:");
		lblJuros.setBounds(79, 119, 81, 14);
		contentPane.add(lblJuros);
		
		textJuros = new JTextField();
		textJuros.setBounds(25, 136, 183, 20);
		contentPane.add(textJuros);
		textJuros.setColumns(10);
		
		JLabel lblToInJu = new JLabel("Total Investido + Juros R$:");
		lblToInJu.setBounds(35, 155, 183, 14);
		contentPane.add(lblToInJu);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(68, 171, 103, 29);
		contentPane.add(btnCalcular);
	}

}
