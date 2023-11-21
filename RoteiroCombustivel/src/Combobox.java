import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
//import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import modelo.Calculos;
import modelo.Combustivel;

public class Combobox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textoleodisel;
	private JTextField textgascomum;
	private JTextField textgasaditivada;
	private JTextField textetanol;
	private JTextField textFrasco1;
	private JTextField textF500;
	private JTextField textF1L;
	private JTextField textQL;
	private JTextField textdias;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	Calculos calc = new Calculos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combobox frame = new Combobox();
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
	public Combobox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PrecoCombustivel = new JPanel();
		PrecoCombustivel.setBounds(5, 5, 263, 143);
		PrecoCombustivel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tabela de Pre\u00E7o do Combustivel", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(PrecoCombustivel);
		PrecoCombustivel.setLayout(null);
		
		JLabel lblOleodisel = new JLabel("Óleo Disel:");
		lblOleodisel.setBounds(38, 35, 87, 14);
		PrecoCombustivel.add(lblOleodisel);
		
		textoleodisel = new JTextField();
		textoleodisel.setBounds(135, 32, 86, 20);
		PrecoCombustivel.add(textoleodisel);
		textoleodisel.setColumns(10);
		
		JLabel lblGascomum = new JLabel("Gas. Comum:");
		lblGascomum.setBounds(31, 60, 94, 14);
		PrecoCombustivel.add(lblGascomum);
		
		JLabel lblGasaditivada = new JLabel("Gas. Aditivada:");
		lblGasaditivada.setBounds(25, 85, 100, 14);
		PrecoCombustivel.add(lblGasaditivada);
		
		textgascomum = new JTextField();
		textgascomum.setBounds(135, 57, 86, 20);
		PrecoCombustivel.add(textgascomum);
		textgascomum.setColumns(10);
		
		textgasaditivada = new JTextField();
		textgasaditivada.setBounds(135, 82, 86, 20);
		PrecoCombustivel.add(textgasaditivada);
		textgasaditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		lblEtanol.setBounds(38, 110, 40, 14);
		PrecoCombustivel.add(lblEtanol);
		
		textetanol = new JTextField();
		textetanol.setBounds(135, 107, 86, 20);
		PrecoCombustivel.add(textetanol);
		textetanol.setColumns(10);
		
		JPanel PrecoOleoMotor = new JPanel();
		PrecoOleoMotor.setBounds(273, 5, 285, 143);
		PrecoOleoMotor.setBorder(new TitledBorder(null, "Tabela de Pre\u00E7o do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(PrecoOleoMotor);
		PrecoOleoMotor.setLayout(null);
		
		JLabel lblFrasco500 = new JLabel("Frasco 500ml");
		lblFrasco500.setBounds(52, 34, 78, 14);
		PrecoOleoMotor.add(lblFrasco500);
		
		JTextField textFrasco500 = new JTextField();
		textFrasco500.setBounds(158, 31, 86, 20);
		PrecoOleoMotor.add(textFrasco500);
		textFrasco500.setColumns(10);
		
		JLabel lblFrasco1 = new JLabel("Frasco 1L");
		lblFrasco1.setBounds(62, 72, 68, 14);
		PrecoOleoMotor.add(lblFrasco1);
		
		textFrasco1 = new JTextField();
		textFrasco1.setBounds(158, 69, 86, 20);
		PrecoOleoMotor.add(textFrasco1);
		textFrasco1.setColumns(10);
		
		JPanel OleoMotor = new JPanel();
		OleoMotor.setBounds(5, 147, 550, 119);
		OleoMotor.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(OleoMotor);
		OleoMotor.setLayout(null);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(162, 22, 71, 14);
		OleoMotor.add(lblQuantidade);
		
		textF500 = new JTextField();
		textF500.setBounds(149, 47, 86, 20);
		OleoMotor.add(textF500);
		textF500.setColumns(10);
		
		textF1L = new JTextField();
		textF1L.setBounds(149, 78, 86, 20);
		OleoMotor.add(textF1L);
		textF1L.setColumns(10);
		
		JLabel lblFrasco500_1 = new JLabel("Frasco 500ml");
		lblFrasco500_1.setBounds(33, 50, 78, 14);
		OleoMotor.add(lblFrasco500_1);
		
		JLabel lblFrasco1_1 = new JLabel("Frasco 1L");
		lblFrasco1_1.setBounds(33, 81, 68, 14);
		OleoMotor.add(lblFrasco1_1);
		
		JLabel lblValorapagar = new JLabel("Valor a Pagar");
		lblValorapagar.setBounds(289, 22, 86, 14);
		OleoMotor.add(lblValorapagar);
		
		JLabel lblVPF500 = new JLabel("-");
		lblVPF500.setHorizontalAlignment(SwingConstants.CENTER);
		lblVPF500.setBounds(299, 50, 46, 14);
		OleoMotor.add(lblVPF500);
		
		JLabel lblVPF1L = new JLabel("-");
		lblVPF1L.setHorizontalAlignment(SwingConstants.CENTER);
		lblVPF1L.setBounds(299, 81, 46, 14);
		OleoMotor.add(lblVPF1L);
		
		JLabel lblTotaloleo = new JLabel("Total Oleo");
		lblTotaloleo.setBounds(426, 22, 57, 14);
		OleoMotor.add(lblTotaloleo);
		
		JLabel lblTOF500 = new JLabel("-");
		lblTOF500.setHorizontalAlignment(SwingConstants.CENTER);
		lblTOF500.setBounds(427, 50, 46, 14);
		OleoMotor.add(lblTOF500);
		
		JLabel lblTOF1L = new JLabel("-");
		lblTOF1L.setHorizontalAlignment(SwingConstants.CENTER);
		lblTOF1L.setBounds(427, 81, 46, 14);
		OleoMotor.add(lblTOF1L);
		
		JPanel Abastecimento = new JPanel();
		Abastecimento.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Abastecimento.setBounds(5, 273, 263, 143);
		contentPane.add(Abastecimento);
		Abastecimento.setLayout(null);
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		lblCombustivel.setBounds(26, 23, 77, 14);
		Abastecimento.add(lblCombustivel);
		
		JComboBox<Combustivel> comboBoxdepre = new JComboBox<Combustivel>();
		comboBoxdepre.setBounds(137, 19, 101, 22);
		
			comboBoxdepre.addItem(Combustivel.Diesel);
			comboBoxdepre.addItem(Combustivel.Comum);
			comboBoxdepre.addItem(Combustivel.Aditivada);
			comboBoxdepre.addItem(Combustivel.Etanol);
	
		Abastecimento.add(comboBoxdepre);
		
		JLabel lblQLtexto = new JLabel("Quantidade Litros:");
		lblQLtexto.setBounds(10, 64, 126, 14);
		Abastecimento.add(lblQLtexto);
		
		textQL = new JTextField();
		textQL.setBounds(137, 61, 86, 20);
		Abastecimento.add(textQL);
		textQL.setColumns(10);
		
		JLabel lblTCtexto = new JLabel("Total Combustivel:");
		lblTCtexto.setBounds(10, 99, 116, 14);
		Abastecimento.add(lblTCtexto);
		
		JLabel lblTC = new JLabel("-");
		lblTC.setHorizontalAlignment(SwingConstants.CENTER);
		lblTC.setBounds(157, 99, 46, 14);
		Abastecimento.add(lblTC);
		
		JPanel FormasPagamento = new JPanel();
		FormasPagamento.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		FormasPagamento.setBounds(273, 273, 282, 143);
		contentPane.add(FormasPagamento);
		FormasPagamento.setLayout(null);
		
		JRadioButton rdbtnavista = new JRadioButton("À Vista");
		buttonGroup.add(rdbtnavista);
		rdbtnavista.setBounds(18, 26, 76, 23);
		FormasPagamento.add(rdbtnavista);
		
		JRadioButton rdbtnaprazo = new JRadioButton("À Prazo");
		buttonGroup.add(rdbtnaprazo);
		rdbtnaprazo.setBounds(18, 64, 76, 23);
		FormasPagamento.add(rdbtnaprazo);
		
		JLabel lbldias = new JLabel("Dias");
		lbldias.setBounds(118, 43, 35, 14);
		FormasPagamento.add(lbldias);
		
		textdias = new JTextField();
		textdias.setBounds(152, 40, 86, 20);
		FormasPagamento.add(textdias);
		textdias.setColumns(10);
		
		JLabel lblTP = new JLabel("Total a Pagar:");
		lblTP.setBounds(34, 105, 97, 14);
		FormasPagamento.add(lblTP);
		
		JLabel lblResultadoTP = new JLabel("-");
		lblResultadoTP.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoTP.setBounds(162, 105, 46, 14);
		FormasPagamento.add(lblResultadoTP);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(454, 427, 89, 23);
		contentPane.add(btnFechar);
		
		JButton btnNovoCalculo = new JButton("Novo Calculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textoleodisel.setText(" ");
				textgascomum.setText(" ");
				textgasaditivada.setText(" ");
				textetanol.setText(" ");
				textFrasco500.setText(" ");
				textFrasco1.setText(" ");
				textF500.setText(" ");
				textF1L.setText(" ");
				lblVPF500.setText(" - ");
				lblVPF1L.setText(" - ");
				lblTOF500.setText(" - ");
				lblTOF1L.setText(" - ");
				textQL.setText(" ");
				lblTC.setText(" - ");
				textdias.setText(" ");
				lblResultadoTP.setText(" - ");
			}
		});
		btnNovoCalculo.setBounds(208, 427, 126, 23);
		contentPane.add(btnNovoCalculo);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Converte o texto deigitado a String
				String oleoD = textoleodisel.getText();
				String gasC = textgascomum.getText();
				String gasA = textgasaditivada.getText();
				String etanol = textetanol.getText();
				String quantidadelitros = textQL.getText();
				
				//Converte a String em numero
				Float oleoDF = Float.valueOf(oleoD);
				Float gasCF = Float.valueOf(gasC);
				Float gasAF = Float.valueOf(gasA);
				Float etanolF = Float.valueOf(etanol);
				Float QuantLitrosF = Float.valueOf(quantidadelitros);
				
				Combustivel tipo = (Combustivel) comboBoxdepre.getSelectedItem();
				
				//Importa a classe
				Calculos calc = new Calculos();
				Float totalcombus = calc.calc_combustivel( oleoDF, gasCF, gasAF, etanolF, tipo, QuantLitrosF);
				String totalC = String.valueOf(totalcombus);
				lblTC.setText("R$ " + totalC);
				
			}
		});
		btnCalcular.setBounds(29, 427, 89, 23);
		contentPane.add(btnCalcular);
	}
	/*private void carregarComb() {
		//Cria lista de cidades e coloca dentro de um ArrayList
				Combustivel c1 = new Combustivel();
				c1.setCodigo(1);
				c1.setComb("Diesel");
				listaComb.add(c1);
				
				Combustivel c2 = new Combustivel();
				c2.setCodigo(2);
				c2.setComb("Gasolina Comum");
				listaComb.add(c2);
		
	}*/
}
