import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setTitle("VC é careca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(170, 85, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemVindo = new JLabel("Seja Bem Vindo!!!!");
		lblBemVindo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"O foco está no JLabel");
			}
		});
		lblBemVindo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				//JOptionPane.showMessageDialog(null,"O foco está no JLabel");
			}
		});
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setFont(new Font("Segoe UI Emoji", Font.BOLD, 30));
		lblBemVindo.setBounds(74, 29, 266, 47);
		contentPane.add(lblBemVindo);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				JOptionPane.showMessageDialog(null,"O nome digitado é: " + nome);
			}
		});
		btnValidar.setForeground(new Color(0, 0, 0));
		btnValidar.setBackground(SystemColor.activeCaption);
		btnValidar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnValidar.setBounds(127, 182, 196, 47);
		contentPane.add(btnValidar);
		
		textNome = new JTextField();
		textNome.setBounds(152, 87, 188, 34);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(62, 87, 97, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(10, 275, 89, 34);
		contentPane.add(btnFechar);
	}
}
