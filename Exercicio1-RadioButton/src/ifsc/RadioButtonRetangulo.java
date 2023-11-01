package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class RadioButtonRetangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonRetangulo frame = new RadioButtonRetangulo();
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
	public RadioButtonRetangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panelBase = new JPanel();
		contentPane.add(panelBase);
		
		JLabel lblBase = new JLabel("Base");
		panelBase.add(lblBase);
		
		textBase = new JTextField();
		panelBase.add(textBase);
		textBase.setColumns(10);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JPanel panelAltura = new JPanel();
		contentPane.add(panelAltura);
		
		JLabel lblAltura = new JLabel("Altura");
		panelAltura.add(lblAltura);
		
		textAltura = new JTextField();
		panelAltura.add(textAltura);
		textAltura.setColumns(10);
		
		JPanel panelArea = new JPanel();
		contentPane.add(panelArea);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		panelArea.add(rdbtnArea);
		buttonGroup.add(rdbtnArea);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		JPanel panelPerimetro = new JPanel();
		contentPane.add(panelPerimetro);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
		panelPerimetro.add(rdbtnPerimetro);
		buttonGroup.add(rdbtnPerimetro);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel labelAP = new JLabel("");
		panel.add(labelAP);
		
		JLabel labelResultado = new JLabel("");
		panel.add(labelResultado);
		
		JLabel label_1_1 = new JLabel("");
		contentPane.add(label_1_1);
		
		JPanel panelCalcular = new JPanel();
		contentPane.add(panelCalcular);
		
		JButton btnCalcular = new JButton("Calcular");
		panelCalcular.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String base = textBase.getText();
				String altura = textAltura.getText();
				double based = Double.valueOf(base);
				double alturad = Double.valueOf(altura);
				Retangulo calculo = new Retangulo();
				
				double perimetro = calculo.calculop(based,alturad);
				String sperimetro = String.format("%.2f", perimetro);
				
				double area = calculo.calculoa(based,alturad);
				String sarea = String.format("%.2f", area);
				
				if(rdbtnArea.isSelected()){labelAP.setText("Área: "+sarea);}else
				if(rdbtnPerimetro.isSelected()){labelAP.setText("Perímetro: "+sperimetro); /*labelresultado.setText();*/}
				
				//JOptionPane.showMessageDialog(null, "O Perimetro do retangulo é: "+sperimetro +" e a Área é: " +sarea);
				
			}
		});
		
		JPanel panelLimpar = new JPanel();
		contentPane.add(panelLimpar);
		
		JButton btnLimpar = new JButton("Limpar");
		panelLimpar.add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBase.setText(" ");
				textAltura.setText(" ");
				labelAP.setText(" ");
				//rdbtnArea.setSelected(false);
				//rdbtnPerimetro.setSelected(false);
			}
		});
		
		JPanel panelFechar = new JPanel();
		contentPane.add(panelFechar);
		
		JButton btnFechar = new JButton("Fechar");
		panelFechar.add(btnFechar);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}
