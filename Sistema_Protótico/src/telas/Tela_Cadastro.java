package telas;


import telas.Tela_Login;
import telas.Encapsulamento;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class Tela_Cadastro {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastro window = new Tela_Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Cadastro() {
		initialize();
	
	}
	/**
	 * Initialize the contents of the frame.
	 */
	
	void initialize() {
			
		
		frame = new JFrame();
		frame.getContentPane().setName("1\n2\n3\n");
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(241, 241, 241));
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("<---");
		button.setBounds(0, 0, 59, 25);
		frame.getContentPane().add(button);
		frame.setBackground(new Color(119, 118, 123));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				Tela_Login.main(null);
				frame.dispose();	
				
				}
			});
		
		
		
		// icone do Programa 			//frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/samuel/Pictures/Tema para a aérea de trablaho.jpg"));
		frame.setBounds(100, 100, 955, 586);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		

		JButton btnFecharjanela = new JButton("X");
		btnFecharjanela.setFont(new Font("Dialog", Font.BOLD, 10));
		btnFecharjanela.setBounds(903, 0, 42, 25);
		frame.getContentPane().add(btnFecharjanela);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(39, 75, 70, 15);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(41, 94, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(264, 94, 125, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(262, 76, 88, 15);
		frame.getContentPane().add(lblSobrenome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(41, 152, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(41, 167, 223, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblInsiraOEmail = new JLabel("Insira o Email novamente:");
		lblInsiraOEmail.setBounds(40, 205, 223, 15);
		frame.getContentPane().add(lblInsiraOEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(41, 221, 223, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(41, 290, 157, 15);
		frame.getContentPane().add(lblDataDeNascimento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setActionCommand("1\n2\n3\n");
		comboBox.setBounds(39, 317, 70, 25);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Mês", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(109, 317, 70, 25);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Ano", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900"}));
		comboBox_2.setBounds(179, 317, 70, 25);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblGenro = new JLabel("Genêro:");
		lblGenro.setBounds(664, 152, 70, 15);
		frame.getContentPane().add(lblGenro);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(597, 184, 104, 23);
		frame.getContentPane().add(rdbtnMasculino);

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(701, 184, 94, 23);
		frame.getContentPane().add(rdbtnFeminino);
		
		JButton btnComparao = new JButton("Comparação");
		btnComparao.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
		
				String nome = textField.getText();
				String sobre_nome = textField_1.getText();
				String email = textField_2.getText();
				String repetir_email = textField_3.getText();
				
				String dia = (String) comboBox.getSelectedItem();
				String mes = (String) comboBox_1.getSelectedItem();
				String ano = (String) comboBox_2.getSelectedItem();
				
				
				
			//	System.out.println(nome);
			//	System.out.println(sobre_nome);
			//	System.out.println(email);
			//	System.out.println(repetir_email);
			//	System.out.println(dia);
			//	System.out.println(mes);
			//	System.out.println(ano);
				
			/*	if(email.equals(repetir_email)) {
					System.out.println("/nEmail correto");
					
				}	*/
				if(!email.equals(repetir_email)){
					System.out.println("Emails estão diferentes\n");
				}
				if(email == null || email.trim().equals("")) {
					System.out.println("Campo de Emails vazios");
				}
				if(dia == "Dia" ) {
					System.out.println("Campo do Dia não selecionado!");
				}
				if(mes == "Mês" ) {
					System.out.println("Campo do Mês não selecionado!");
				}
				if(ano == "Ano" ) {
					System.out.println("Campo do Ano não selecionado!");
				}

				
			}
		});
		btnComparao.setBounds(718, 450, 137, 25);
		frame.getContentPane().add(btnComparao);
		
		rdbtnMasculino.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					
				if(rdbtnMasculino.isSelected()) {
					rdbtnFeminino.setSelected(false);
					}
				
			}
		});
		
		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
					if(rdbtnFeminino.isSelected()) {
						rdbtnMasculino.setSelected(false);
					}
					
					}
				});
		
	
		
		
		
		
		btnFecharjanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//fechar_janela();
					Encapsulamento fechar = new Encapsulamento();
					fechar.fechar_janela();
				
				}
			});

	
		
		
		
	
	}
}



	

	/*public void setVisible(boolean b) {

		
	}*/

