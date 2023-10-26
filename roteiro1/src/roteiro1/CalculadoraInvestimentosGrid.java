package roteiro1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calc.FormSobre;
import calc.Investimento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class CalculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDepositoMensal;
	private JTextField textNumdeMeses;
	private JTextField textJurosaoMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();
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
	public CalculadoraInvestimentosGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 225);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormSobre ajudajanela = new FormSobre();
				ajudajanela.setVisible(true);
			}
		});
		mnAjuda.add(mntmSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7);
		
		JLabel lblNewLabel = new JLabel("Depósito Mensal R$:");
		panel_7.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		textDepositoMensal = new JTextField();
		panel.add(textDepositoMensal);
		textDepositoMensal.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Num. de Meses:");
		panel_6.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		textNumdeMeses = new JTextField();
		panel_1.add(textNumdeMeses);
		textNumdeMeses.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Juros ao Mês %:");
		panel_5.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		textJurosaoMes = new JTextField();
		panel_2.add(textJurosaoMes);
		textJurosaoMes.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Total Investido + Juros R$:");
		panel_4.add(lblNewLabel_3);
		
		JLabel label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		contentPane.add(label_7);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//puxar o texto escito no textField
				String DepositoMensal = textDepositoMensal.getText();
				String NumdeMeses = textNumdeMeses.getText();
				String JurosaoMes = textJurosaoMes.getText();
				//converte o texto em numeros float
				double DepositoMensald = Double.valueOf(DepositoMensal);
				int NumdeMesesi = Integer.valueOf(NumdeMeses);
				double JurosaoMesd = Double.valueOf(JurosaoMes);
				//importa outra classe (investimento)
				Investimento calculo = new Investimento(NumdeMesesi, JurosaoMesd, JurosaoMesd);
				
				double Total = calculo.calculaTotal(DepositoMensald,NumdeMesesi,JurosaoMesd);
				String sTotal = String.format("%.2f", Total);
				
				label_6.setText(sTotal);
				

				
			}
		});
		panel_3.add(btnNewButton);
	}

}
