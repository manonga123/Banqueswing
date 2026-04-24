package View;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;

import controller.TransfertController;

import javax.swing.border.BevelBorder;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransfertView extends JFrame{
	public JButton accueil;
	public JButton depot;
	public JButton retrait;
	public JButton transfert;
	public JButton achat;
	public JButton admin;
	public JLabel lblTransfert;
	public JLabel lblNumero;
	public JTextField numeroTransfert;
	public JLabel lblMontant;
	public JLabel lblMotDePasse;
	public JButton valideTransfert;
	public JButton btnTransferer;
	public JTextField volaTransfert;
	public JTextField passwordTransfert;
	public JTextField numTompony;
	public TransfertView() {
		
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel, 1100, SpringLayout.WEST, getContentPane());
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(102, 0, 51));
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 51, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 65, SpringLayout.NORTH, getContentPane());
		getContentPane().add(panel);
		panel.setLayout(null);
		
		accueil = new JButton("ACCUEIL");
		accueil.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		accueil.setForeground(new Color(255, 255, 255));
		accueil.setBackground(new Color(102, 0, 51));
		accueil.setBounds(26, 12, 117, 31);
		panel.add(accueil);
		
		depot = new JButton("DEPOT");
		depot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransfertView.super.dispose();
				DepotView depotView = new DepotView();
				depotView.setVisible(true);
				depotView.setSize(1200, 700);
				depotView.setResizable(false);
				depotView.setLocationRelativeTo(null);
			}
		});
		depot.setForeground(Color.WHITE);
		depot.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		depot.setBackground(new Color(102, 0, 51));
		depot.setBounds(182, 12, 117, 31);
		panel.add(depot);
		
		retrait = new JButton("RETRAIT");
		retrait.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransfertView.super.dispose();
				RetraitView depotView = new RetraitView();
				depotView.setVisible(true);
				depotView.setSize(1200, 700);
				depotView.setResizable(false);
				depotView.setLocationRelativeTo(null);
			}
		});
		retrait.setForeground(Color.WHITE);
		retrait.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		retrait.setBackground(new Color(102, 0, 51));
		retrait.setBounds(331, 12, 117, 31);
		panel.add(retrait);
		
		transfert = new JButton("TRANSFERT");
		transfert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransfertView.super.dispose();
				TransfertView depotView = new TransfertView();
				depotView.setVisible(true);
				depotView.setSize(1200, 700);
				depotView.setResizable(false);
				depotView.setLocationRelativeTo(null);
			}
		});
		transfert.setForeground(Color.WHITE);
		transfert.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		transfert.setBackground(new Color(102, 0, 51));
		transfert.setBounds(480, 12, 117, 31);
		panel.add(transfert);
		
		
		achat = new JButton("HISTORIQUE");
		achat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransfertView.super.dispose();
				AchatView depotView = new AchatView();
				depotView.setVisible(true);
				depotView.setSize(1200, 700);
				depotView.setResizable(false);
				depotView.setLocationRelativeTo(null);
			}
		});
		achat.setForeground(Color.WHITE);
		achat.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		achat.setBackground(new Color(102, 0, 51));
		achat.setBounds(628, 12, 117, 31);
		panel.add(achat);
		
		admin = new JButton("ADMIN");
		admin.setForeground(Color.WHITE);
		admin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		admin.setBackground(new Color(102, 0, 51));
		admin.setBounds(920, 12, 117, 31);
		panel.add(admin);
		
		lblTransfert = new JLabel("TRANSFERT");
		springLayout.putConstraint(SpringLayout.NORTH, lblTransfert, 35, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, lblTransfert, 267, SpringLayout.WEST, getContentPane());
		lblTransfert.setForeground(new Color(51, 204, 0));
		lblTransfert.setFont(new Font("Times New Roman", Font.BOLD, 40));
		getContentPane().add(lblTransfert);
		
		lblNumero = new JLabel("Num compte de transfert");
		springLayout.putConstraint(SpringLayout.WEST, lblNumero, 10, SpringLayout.WEST, getContentPane());
		lblNumero.setForeground(new Color(51, 204, 0));
		lblNumero.setFont(new Font("Times New Roman", Font.BOLD, 20));
		getContentPane().add(lblNumero);
		
		numeroTransfert = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, numeroTransfert, 6, SpringLayout.SOUTH, lblTransfert);
		springLayout.putConstraint(SpringLayout.SOUTH, numeroTransfert, -288, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNumero, 7, SpringLayout.NORTH, numeroTransfert);
		springLayout.putConstraint(SpringLayout.WEST, numeroTransfert, 0, SpringLayout.WEST, lblTransfert);
		springLayout.putConstraint(SpringLayout.EAST, numeroTransfert, 0, SpringLayout.EAST, lblTransfert);
		numeroTransfert.setBorder(new LineBorder(UIManager.getColor("Button.foreground"), 2, true));
		getContentPane().add(numeroTransfert);
		numeroTransfert.setColumns(10);
		
		lblMontant = new JLabel("Montant :");
		springLayout.putConstraint(SpringLayout.WEST, lblMontant, 0, SpringLayout.WEST, lblNumero);
		lblMontant.setForeground(new Color(51, 204, 0));
		lblMontant.setFont(new Font("Times New Roman", Font.BOLD, 20));
		getContentPane().add(lblMontant);
		
		lblMotDePasse = new JLabel("Votre mot de passe :");
		springLayout.putConstraint(SpringLayout.WEST, lblMotDePasse, 0, SpringLayout.WEST, lblNumero);
		lblMotDePasse.setForeground(new Color(51, 204, 0));
		lblMotDePasse.setFont(new Font("Times New Roman", Font.BOLD, 20));
		getContentPane().add(lblMotDePasse);
		
		valideTransfert = new JButton("VALIDER");
		springLayout.putConstraint(SpringLayout.NORTH, valideTransfert, 205, SpringLayout.SOUTH, lblNumero);
		springLayout.putConstraint(SpringLayout.WEST, valideTransfert, 160, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, valideTransfert, -61, SpringLayout.SOUTH, getContentPane());
		valideTransfert.setBounds(new Rectangle(1, 2, 4, 2));
		valideTransfert.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		valideTransfert.setForeground(Color.WHITE);
		valideTransfert.setBackground(Color.BLUE);
		getContentPane().add(valideTransfert);
		
		volaTransfert = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblMontant, 5, SpringLayout.NORTH, volaTransfert);
		springLayout.putConstraint(SpringLayout.NORTH, volaTransfert, 6, SpringLayout.SOUTH, numeroTransfert);
		springLayout.putConstraint(SpringLayout.WEST, volaTransfert, 0, SpringLayout.WEST, lblTransfert);
		springLayout.putConstraint(SpringLayout.SOUTH, volaTransfert, -242, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, volaTransfert, 0, SpringLayout.EAST, lblTransfert);
		volaTransfert.setColumns(10);
		volaTransfert.setBorder(new LineBorder(UIManager.getColor("Button.foreground"), 2, true));
		getContentPane().add(volaTransfert);
		
		passwordTransfert = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblMotDePasse, 5, SpringLayout.NORTH, passwordTransfert);
		springLayout.putConstraint(SpringLayout.WEST, passwordTransfert, 0, SpringLayout.WEST, lblTransfert);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordTransfert, -144, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, passwordTransfert, 0, SpringLayout.EAST, lblTransfert);
		passwordTransfert.setColumns(10);
		passwordTransfert.setBorder(new LineBorder(UIManager.getColor("Button.foreground"), 2, true));
		getContentPane().add(passwordTransfert);
		
		JButton valideTransfert = new JButton("Transferer");
		springLayout.putConstraint(SpringLayout.EAST, valideTransfert, -283, SpringLayout.WEST, valideTransfert);
		springLayout.putConstraint(SpringLayout.NORTH, valideTransfert, 27, SpringLayout.SOUTH, valideTransfert);
		springLayout.putConstraint(SpringLayout.WEST, valideTransfert, 405, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, valideTransfert, -81, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, valideTransfert, 0, SpringLayout.EAST, lblTransfert);
		valideTransfert.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		getContentPane().add(valideTransfert);
		
		JLabel lblVotreNumcompte = new JLabel("Votre num_compte");
		springLayout.putConstraint(SpringLayout.NORTH, lblVotreNumcompte, 23, SpringLayout.SOUTH, lblMontant);
		springLayout.putConstraint(SpringLayout.WEST, lblVotreNumcompte, 0, SpringLayout.WEST, lblNumero);
		lblVotreNumcompte.setForeground(new Color(51, 204, 0));
		lblVotreNumcompte.setFont(new Font("Times New Roman", Font.BOLD, 20));
		getContentPane().add(lblVotreNumcompte);
		
		numTompony = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordTransfert, 7, SpringLayout.SOUTH, numTompony);
		springLayout.putConstraint(SpringLayout.NORTH, numTompony, 6, SpringLayout.SOUTH, volaTransfert);
		springLayout.putConstraint(SpringLayout.WEST, numTompony, 97, SpringLayout.EAST, lblVotreNumcompte);
		springLayout.putConstraint(SpringLayout.SOUTH, numTompony, 51, SpringLayout.SOUTH, volaTransfert);
		springLayout.putConstraint(SpringLayout.EAST, numTompony, 0, SpringLayout.EAST, lblTransfert);
		numTompony.setColumns(10);
		numTompony.setBorder(new LineBorder(UIManager.getColor("Button.foreground"), 2, true));
		getContentPane().add(numTompony);
		init();
	}
	public void init() {
		TransfertController tran = new TransfertController(this);
		valideTransfert.addActionListener(tran);
	}
}
