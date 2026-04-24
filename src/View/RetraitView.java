package View;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import controller.HomeController;
import controller.RetraitController;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RetraitView extends JFrame{
	public JButton accueil;
	public JButton depot;
	public JButton retrait;
	public JButton transfert;
	public JButton achat;
	public JButton admin;
	public JPanel panel_1;
	public JLabel lblRetrait;
	public JLabel lblMontant;
	public JTextField volaRetrait;
	public JLabel lblMotDePasse;
	public JTextField numeroRetrait;
	public JButton valideRetrait;
	public RetraitView() {

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
				RetraitView.super.dispose();
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
				RetraitView.super.dispose();
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
				RetraitView.super.dispose();
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
				RetraitView.super.dispose();
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
		
		panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 34, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 85, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -44, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -152, SpringLayout.EAST, getContentPane());
		panel_1.setBackground(new Color(222, 221, 218));
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblRetrait = new JLabel("RETRAIT");
		lblRetrait.setForeground(new Color(51, 204, 0));
		lblRetrait.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblRetrait.setBounds(207, 11, 185, 49);
		panel_1.add(lblRetrait);
		
		lblMontant = new JLabel("Montant :");
		lblMontant.setForeground(new Color(51, 204, 0));
		lblMontant.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMontant.setBounds(10, 106, 108, 22);
		panel_1.add(lblMontant);
		
		volaRetrait = new JTextField();
		volaRetrait.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		volaRetrait.setBounds(207, 102, 247, 37);
		panel_1.add(volaRetrait);
		volaRetrait.setColumns(10);
		
		lblMotDePasse = new JLabel("Votre num_compte");
		lblMotDePasse.setForeground(new Color(51, 204, 0));
		lblMotDePasse.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMotDePasse.setBounds(10, 182, 185, 22);
		panel_1.add(lblMotDePasse);
		
		numeroRetrait = new JTextField();
		numeroRetrait.setColumns(10);
		numeroRetrait.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		numeroRetrait.setBounds(207, 178, 247, 37);
		panel_1.add(numeroRetrait);
		
		valideRetrait = new JButton("VALIDER");
		valideRetrait.setBackground(new Color(102, 153, 204));
		valideRetrait.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		valideRetrait.setBounds(337, 260, 117, 31);
		panel_1.add(valideRetrait);
		
		init();
	}
	public void init() {
		RetraitController retraitController = new RetraitController(this);
		valideRetrait.addActionListener(retraitController);
	}
}
