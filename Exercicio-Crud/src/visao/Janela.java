package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import Modelo.Pessoa;
import Modelo.PessoaJTableModel;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblCPF;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnAlterar;
	private JTextField textTelefone;
	private JTextField textIdade;
	private JTextField textPeso;
	private JTextField textField;
	private JLabel lblAltura;
	private JTextField textAltura;
	
	
	
	Double peso = (double) 0.0;
	Double altura = (double) 0.0;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 158, 367, 146);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JOptionPane.showMessageDialog(null, "Pessoa Selecionada: "+pessoaSelecionada.getNome());
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		scrollPane.setColumnHeaderView(textField);
		textField.setColumns(10);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(15, 11, 46, 14);
		contentPane.add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 157, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(100);
		
		lblCPF = new JLabel("CPF");
		lblCPF.setBounds(212, 11, 46, 14);
		contentPane.add(lblCPF);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(212, 36, 165, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(30);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf= txtCPF.getText();
				String idade = textIdade.getText();
				String telefone = textTelefone.getText();
				Double peso = Double.valueOf(textPeso.getText());			
				Double altura = Double.valueOf(textAltura.getText());			

				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setIdade(Integer.parseInt(idade));
				p.setTelefone(Integer.parseInt(telefone));
				p.setPeso(peso);
				p.setAltura(altura);
				
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
				
				
				
				
			}
		});
		btnAdicionar.setBounds(30, 124, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				if(idx_linha < 0) {
					JOptionPane.showMessageDialog(null, "Selecione um campo para excluir");
				}
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnExcluir.setBounds(149, 124, 89, 23);
		contentPane.add(btnExcluir);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int linhaSelecionada = table.getSelectedRow();

		        if (linhaSelecionada != -1) {
		            Pessoa alt = listaPessoas.get(linhaSelecionada);

		            alt.setNome(txtNome.getText());
		            alt.setCpf(Integer.parseInt(txtCPF.getText()));
		            alt.setTelefone(Integer.parseInt(textTelefone.getText()));
		            alt.setIdade(Integer.parseInt(textIdade.getText()));
		            alt.setPeso(Float.parseFloat(textPeso.getText()));
		            alt.setAltura(Float.parseFloat(textAltura.getText()));

		            limparCampos();
		            atualizarJTableModel();
		        } else {
		            JOptionPane.showMessageDialog(null, "Selecione uma pessoa para editar.");
		        }
				
			}
		});
		btnAlterar.setBounds(271, 124, 89, 23);
		contentPane.add(btnAlterar);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 67, 88, 14);
		contentPane.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(10, 92, 109, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(20);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(140, 67, 62, 14);
		contentPane.add(lblIdade);
		
		textIdade = new JTextField();
		textIdade.setBounds(140, 93, 62, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(225, 67, 36, 14);
		contentPane.add(lblPeso);
		
		textPeso = new JTextField();
		textPeso.setBounds(225, 93, 52, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(302, 67, 46, 14);
		contentPane.add(lblAltura);
		
		textAltura = new JTextField();
		textAltura.setBounds(297, 92, 80, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
	}
	
	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}
	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		textTelefone.setText("");
		textIdade.setText("");
		textPeso.setText("");
		textAltura.setText("");
	}

}
