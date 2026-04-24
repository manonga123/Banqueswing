package View;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import Common.AccesBdd;
import controller.HomeController;
import javax.swing.UIManager;

import modele.UserModele;

import dao.UserDao;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;

public class Home extends JFrame{
	private static final String solde = null;
	public JButton accueil;
	public JButton depot;
	public JButton retrait;
	public JButton transfert;
	public JLabel lblTest;
	public JButton achat;
	public JButton admin;
	public JTextField numcompte;
	public JButton valideDepot;
	private JPanel panel_1;
	private JPasswordField mdp;
	public Home() {
		// TODO Auto-generated constructor stub
	
		
		final SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		final JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel, 1100, SpringLayout.WEST, getContentPane());
		panel.setForeground(Color.GRAY);
		panel.setBackground(Color.BLUE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 51, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 65, SpringLayout.NORTH, getContentPane());
		getContentPane().add(panel);
		panel.setLayout(null);
		
		accueil = new JButton("ACCUEIL");
		accueil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home.super.dispose();
				Home depotView = new Home();
				depotView.setVisible(true);
				depotView.setSize(1200, 700);
				depotView.setResizable(false);
				depotView.setLocationRelativeTo(null);
			}
		});
		accueil.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		accueil.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		accueil.setForeground(Color.GRAY);
		accueil.setBackground(Color.WHITE);
		accueil.setBounds(26, 12, 117, 31);
		panel.add(accueil);
		
		depot = new JButton("DEPOT");
		depot.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		depot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.super.dispose();
				DepotView depotView = new DepotView();
				depotView.setVisible(true);
				depotView.setSize(1200, 700);
				depotView.setResizable(false);
				depotView.setLocationRelativeTo(null);
			}
		});
		depot.setForeground(Color.GRAY);
		depot.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		depot.setBackground(Color.WHITE);
		depot.setBounds(182, 12, 117, 31);
		panel.add(depot);
		
		retrait = new JButton("RETRAIT");
		retrait.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		retrait.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.super.dispose();
				RetraitView depotView = new RetraitView();
				depotView.setVisible(true);
				depotView.setSize(1200, 700);
				depotView.setResizable(false);
				depotView.setLocationRelativeTo(null);
			}
		});
		retrait.setForeground(Color.GRAY);
		retrait.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		retrait.setBackground(Color.WHITE);
		retrait.setBounds(331, 12, 117, 31);
		panel.add(retrait);
		
		transfert = new JButton("TRANSFERT");
		transfert.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		transfert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.super.dispose();
				TransfertView depotView = new TransfertView();
				depotView.setVisible(true);
				depotView.setSize(1200, 700);
				depotView.setResizable(false);
				depotView.setLocationRelativeTo(null);
			}
		});
		transfert.setForeground(Color.GRAY);
		transfert.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		transfert.setBackground(Color.WHITE);
		transfert.setBounds(480, 12, 117, 31);
		panel.add(transfert);
		
		
		achat = new JButton("HISTORIQUE");
		achat.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		achat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.super.dispose();
				AchatView depotView = new AchatView();
				depotView.setVisible(true);
				depotView.setSize(1200, 700);
				depotView.setResizable(false);
				depotView.setLocationRelativeTo(null);
			}
		});
		achat.setForeground(Color.GRAY);
		achat.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		achat.setBackground(Color.WHITE);
		achat.setBounds(627, 12, 117, 31);
		panel.add(achat);
		
		admin = new JButton("ADMIN");
		admin.setForeground(Color.GRAY);
		admin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		admin.setBackground(Color.WHITE);
		admin.setBounds(821, 13, 117, 31);
		panel.add(admin);
		
		JLabel lblDepot = new JLabel("FORMULAIRE DE CONSULTAION D' ARGENT");
		springLayout.putConstraint(SpringLayout.NORTH, lblDepot, 38, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, lblDepot, 0, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.EAST, lblDepot, -131, SpringLayout.EAST, getContentPane());
		lblDepot.setForeground(Color.BLACK);
		lblDepot.setFont(new Font("Times New Roman", Font.BOLD, 32));
		getContentPane().add(lblDepot);
		
		
			//String h="okok";
			
			
			panel_1 = new JPanel();
			springLayout.putConstraint(SpringLayout.NORTH, panel_1, 58, SpringLayout.SOUTH, lblDepot);
			springLayout.putConstraint(SpringLayout.WEST, panel_1, 123, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -26, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, panel_1, -33, SpringLayout.WEST, lblTest);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			numcompte = new JTextField("ok");
			numcompte.setBounds(211, 32, 172, 37);
			panel_1.add(numcompte);
			springLayout.putConstraint(SpringLayout.NORTH, numcompte, 71, SpringLayout.SOUTH, lblDepot);
			springLayout.putConstraint(SpringLayout.WEST, numcompte, 309, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, numcompte, -305, SpringLayout.EAST, getContentPane());
			numcompte.setBorder(new LineBorder(new Color(51, 51, 0), 2, true));
			numcompte.setBackground(Color.WHITE);
			numcompte.setColumns(10);
			
			valideDepot = new JButton("VALIDER");
			valideDepot.setFont(new Font("Tahoma", Font.PLAIN, 16));
			valideDepot.setBounds(211, 135, 172, 41);
			panel_1.add(valideDepot);
			springLayout.putConstraint(SpringLayout.WEST, valideDepot, 461, SpringLayout.WEST, getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, valideDepot, -96, SpringLayout.SOUTH, getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, valideDepot, -305, SpringLayout.EAST, getContentPane());
			valideDepot.setBorder(new LineBorder(new Color(204, 204, 204), 2, true));
			valideDepot.setForeground(Color.BLUE);
			valideDepot.setBackground(Color.WHITE);
			springLayout.putConstraint(SpringLayout.NORTH, valideDepot, 57, SpringLayout.SOUTH, panel_1);
			
			JLabel lblNumero = new JLabel("Votre num_compte :");
			lblNumero.setBounds(11, 35, 172, 24);
			panel_1.add(lblNumero);
			springLayout.putConstraint(SpringLayout.WEST, lblNumero, 10, SpringLayout.WEST, getContentPane());
			lblNumero.setForeground(Color.BLUE);
			lblNumero.setFont(new Font("Times New Roman", Font.BOLD, 20));
			
			JLabel lblMontant = new JLabel("Votre Mot de passe :");
			lblMontant.setBounds(11, 90, 190, 24);
			panel_1.add(lblMontant);
			springLayout.putConstraint(SpringLayout.NORTH, lblMontant, 149, SpringLayout.SOUTH, panel);
			springLayout.putConstraint(SpringLayout.WEST, lblMontant, 10, SpringLayout.WEST, getContentPane());
			lblMontant.setForeground(Color.BLUE);
			lblMontant.setFont(new Font("Times New Roman", Font.BOLD, 20));
			springLayout.putConstraint(SpringLayout.NORTH, lblNumero, 37, SpringLayout.SOUTH, lblMontant);
			
			mdp = new JPasswordField();
			mdp.setBounds(211, 80, 172, 35);
			panel_1.add(mdp);
			
	}
}
