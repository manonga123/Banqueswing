package View;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import controller.UserController;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class PageLoginView extends JFrame{
	public JTextField numero;
	public JTextField nom;
	public JTextField email;
	public JPasswordField password;
	public JPasswordField mdp;
	public JComboBox sexe;
	public JButton btnConnecter; 
	public JButton btninscrit;
	public JButton btnReset_1; 
	public JButton btnReset;
	public PageLoginView() {
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 33, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 23, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -53, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 360, SpringLayout.WEST, getContentPane());
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 33, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 37, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -41, SpringLayout.EAST, getContentPane());
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(146, 40, 70, 15);
		panel.add(lblLogin);
		
		numero = new JTextField();
		numero.setBounds(140, 129, 164, 26);
		panel.add(numero);
		numero.setColumns(10);
		
		btnConnecter = new JButton("CONNECTER");
		btnConnecter.setBounds(210, 298, 117, 25);
		panel.add(btnConnecter);
		
		btnReset = new JButton("ANNULER");
		btnReset.setBounds(12, 298, 117, 25);
		panel.add(btnReset);
		
		JLabel lblNumero = new JLabel("Nom :");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumero.setBounds(12, 138, 95, 15);
		panel.add(lblNumero);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe:");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMotDePasse.setBounds(12, 199, 110, 15);
		panel.add(lblMotDePasse);
		
		mdp = new JPasswordField();
		mdp.setBounds(140, 197, 164, 26);
		panel.add(mdp);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblInscription = new JLabel("INSCRIPTION");
		lblInscription.setBounds(114, 34, 104, 15);
		panel_1.add(lblInscription);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(123, 75, 198, 31);
		panel_1.add(nom);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(123, 117, 198, 31);
		panel_1.add(email);
		
		password = new JPasswordField();
		password.setBounds(125, 203, 196, 31);
		panel_1.add(password);
		
		btninscrit = new JButton("CONNECTER");
		btninscrit.setBounds(217, 302, 117, 25);
		panel_1.add(btninscrit);
		
		btnReset_1 = new JButton("ANNULER");
		btnReset_1.setBounds(12, 302, 117, 25);
		panel_1.add(btnReset_1);
		
		JLabel lblMotDePasse_1 = new JLabel("Mot de passe:");
		lblMotDePasse_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMotDePasse_1.setBounds(12, 210, 110, 15);
		panel_1.add(lblMotDePasse_1);
		
		JLabel lblNumero_1 = new JLabel("E_mail ");
		lblNumero_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumero_1.setBounds(10, 123, 95, 15);
		panel_1.add(lblNumero_1);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNom.setBounds(12, 89, 95, 15);
		panel_1.add(lblNom);
		
		JLabel lblSexe = new JLabel("Sexe :");
		lblSexe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSexe.setBounds(12, 164, 95, 15);
		panel_1.add(lblSexe);
		
		sexe = new JComboBox();
		sexe.setModel(new DefaultComboBoxModel(new String[] {"HOMME\t", "FEMME"}));
		sexe.setBounds(123, 159, 198, 31);
		panel_1.add(sexe);
		
		init();
	}
	public void init() {
		UserController userController = new UserController(this);
		  btnConnecter.addActionListener(userController); 
		  btninscrit.addActionListener(userController);
		  btnReset_1.addActionListener(userController); 
		  btnReset.addActionListener(userController);
		//btnConnecter.addActionListener(this);
	}
	
}
