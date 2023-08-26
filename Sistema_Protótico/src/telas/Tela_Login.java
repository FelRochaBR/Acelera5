package telas;

import telas.Tela_Cadastro;
import telas.Encapsulamento;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class Tela_Login {

	private JFrame frame;
	private JTextField Campo_Email;
	private JPasswordField Campo_senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Login window = new Tela_Login();
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
	public Tela_Login() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(241, 241, 241));
		frame.setBackground(new Color(119, 118, 123));
		// Imagem do Programa assim que estiver sendo executavel frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/samuel/Pictures/Tema para a aérea de trablaho.jpg"));
		frame.setBounds(100, 100, 955, 586);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			
			//Ação do botãoEntrar
			public void actionPerformed(ActionEvent e) {
				
				String senhaTexto = new String(Campo_senha.getPassword());

				String senha = "123456";
				
				//Campo para Email
				String email = "admin@admin.com";
				String comparacao_email = Campo_Email.getText();
				 
		
				if((comparacao_email.equals(email)) && (senhaTexto.equals(senha))) {
					
					
					
					System.out.println("Certo");
					
				}else{
					System.out.println("Errado!!! ");
			
			}
		}
});
			
	

		btnNewButton.setBounds(680, 310, 148, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		btnCadastrar.setBounds(694, 352, 117, 25);
		frame.getContentPane().add(btnCadastrar);
		btnCadastrar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCadastrar.addActionListener(new ActionListener() {
			
			//Ação do botão Cadastrar
			public void actionPerformed(ActionEvent e) {
			
			Tela_Cadastro main = new Tela_Cadastro();
			//System.out.println("Voce digitou");
			Tela_Cadastro.main(null);
			frame.dispose();
			
			
       
		
			}
			}) ;
		
		
		
		
		
		
		JLabel lblPhotofatec = new JLabel("Photo_fatec");
		lblPhotofatec.setIgnoreRepaint(true);
		lblPhotofatec.setIcon(new ImageIcon("/home/samuel/eclipse-workspace/Sistema_Protótico/src/Imagens/photo_system.png"));
		lblPhotofatec.setBounds(0, 62, 544, 380);
		frame.getContentPane().add(lblPhotofatec);
		
		Campo_Email = new JTextField();
		Campo_Email.setCaretColor(Color.DARK_GRAY);
		Campo_Email.setBounds(655, 188, 212, 19);
		frame.getContentPane().add(Campo_Email);
		Campo_Email.setColumns(10);
		
		
		JLabel lblEmail = new JLabel("");
		lblEmail.setIcon(new ImageIcon("/home/samuel/eclipse-workspace/Sistema_Protótico/src/Imagens/Screenshot from 2023-08-19 15-24-15.png"));
		lblEmail.setBounds(648, 170, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setIcon(new ImageIcon("/home/samuel/eclipse-workspace/Sistema_Protótico/src/Imagens/Screenshot from 2023-08-19 15-24-45.png"));
		lblSenha.setBounds(645, 223, 81, 15);
		frame.getContentPane().add(lblSenha);
		
		JRadioButton rdbtnMostrarSenha = new JRadioButton("Mostrar Senha");
		rdbtnMostrarSenha.setFont(new Font("Dialog", Font.BOLD, 11));
		rdbtnMostrarSenha.setBounds(655, 279, 149, 23);
		frame.getContentPane().add(rdbtnMostrarSenha);
		rdbtnMostrarSenha.addActionListener(new ActionListener() {
			
			//Ação do RadioButtom para ocultar o que sai do texto password
			public void actionPerformed(ActionEvent e) {
				 JRadioButton checkBox = (JRadioButton) e.getSource();
	                Campo_senha.setEchoChar(checkBox.isSelected() ? '\u0000' : '•');
							
		}
			}) ;
		
		
		Campo_senha = new JPasswordField();
		Campo_senha.setSelectionColor(new Color(255, 255, 255));
		Campo_senha.setBounds(655, 243, 212, 19);
		frame.getContentPane().add(Campo_senha);
		
		JButton btnFecharjanela = new JButton("X");
		btnFecharjanela.setFont(new Font("Dialog", Font.BOLD, 10));
		btnFecharjanela.setBounds(903, 0, 42, 25);
		frame.getContentPane().add(btnFecharjanela);
		
		JLabel Photo_login = new JLabel("New label");
		Photo_login.setIcon(new ImageIcon("/home/samuel/eclipse-workspace/Sistema_Protótico/src/Imagens/Screenshot from 2023-08-19 15-17-28.png"));
		Photo_login.setBounds(680, 97, 117, 49);
		frame.getContentPane().add(Photo_login);
		
		JLabel arch = new JLabel("New label");
		arch.setIcon(new ImageIcon("/home/samuel/eclipse-workspace/Sistema_Protótico/src/Imagens/Screenshot from 2023-08-19 15-51-08.png"));
		arch.setBounds(567, 56, 428, 399);
		frame.getContentPane().add(arch);
		btnFecharjanela.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				//fechar_janela();
				Encapsulamento fechar = new Encapsulamento();
				fechar.fechar_janela();
			
			}
		});
		
		
		
	}
	
	
}
