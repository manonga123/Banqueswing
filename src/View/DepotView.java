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

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import controller.HomeController;
import javax.swing.UIManager;

public class DepotView extends JFrame{
	public JButton accueil;
	public JButton depot;
	public JButton retrait;
	public JButton transfert;
	public JButton achat;
	public JButton admin;
	public JTextField volaDepot;
	public JButton valideDepot;
	public JTextField numeroDepot;
	public DepotView() {
		// TODO Auto-generated constructor stub
	
		
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
		accueil.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		accueil.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		accueil.setForeground(new Color(255, 255, 255));
		accueil.setBackground(new Color(102, 0, 51));
		accueil.setBounds(26, 12, 117, 31);
		panel.add(accueil);
		
		depot = new JButton("DEPOT");
		depot.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		depot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepotView.super.dispose();
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
		retrait.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		retrait.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepotView.super.dispose();
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
		transfert.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		transfert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepotView.super.dispose();
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
		achat.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		achat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepotView.super.dispose();
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
		achat.setBounds(627, 12, 117, 31);
		panel.add(achat);
		
		admin = new JButton("ADMIN");
		admin.setForeground(Color.WHITE);
		admin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		admin.setBackground(new Color(102, 0, 51));
		admin.setBounds(920, 12, 117, 31);
		panel.add(admin);
		
		JLabel lblDepot = new JLabel("DEPOT D' ARGENT");
		lblDepot.setForeground(new Color(51, 204, 102));
		springLayout.putConstraint(SpringLayout.NORTH, lblDepot, 28, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, lblDepot, -246, SpringLayout.EAST, getContentPane());
		lblDepot.setFont(new Font("Times New Roman", Font.BOLD, 40));
		getContentPane().add(lblDepot);
		
		JLabel lblMontant = new JLabel("Montant :");
		lblMontant.setForeground(new Color(51, 204, 0));
		lblMontant.setFont(new Font("Times New Roman", Font.BOLD, 20));
		getContentPane().add(lblMontant);
		
		volaDepot = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, volaDepot, 71, SpringLayout.SOUTH, lblDepot);
		springLayout.putConstraint(SpringLayout.NORTH, lblMontant, 3, SpringLayout.NORTH, volaDepot);
		springLayout.putConstraint(SpringLayout.WEST, volaDepot, 309, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, volaDepot, -305, SpringLayout.EAST, getContentPane());
		volaDepot.setBorder(new LineBorder(new Color(51, 51, 0), 2, true));
		volaDepot.setBackground(Color.WHITE);
		getContentPane().add(volaDepot);
		volaDepot.setColumns(10);
		
		valideDepot = new JButton("VALIDER");
		springLayout.putConstraint(SpringLayout.WEST, valideDepot, 461, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, valideDepot, -96, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, valideDepot, 0, SpringLayout.EAST, volaDepot);
		valideDepot.setBorder(new LineBorder(new Color(204, 204, 204), 2, true));
		valideDepot.setForeground(Color.BLACK);
		valideDepot.setBackground(Color.WHITE);
		getContentPane().add(valideDepot);
		
		JLabel lblNumero = new JLabel("Votre num_compte :");
		springLayout.putConstraint(SpringLayout.NORTH, lblNumero, 37, SpringLayout.SOUTH, lblMontant);
		springLayout.putConstraint(SpringLayout.WEST, lblMontant, 0, SpringLayout.WEST, lblNumero);
		springLayout.putConstraint(SpringLayout.WEST, lblNumero, 10, SpringLayout.WEST, getContentPane());
		lblNumero.setForeground(new Color(51, 204, 0));
		lblNumero.setFont(new Font("Times New Roman", Font.BOLD, 20));
		getContentPane().add(lblNumero);
		
		numeroDepot = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, valideDepot, 14, SpringLayout.SOUTH, numeroDepot);
		springLayout.putConstraint(SpringLayout.NORTH, numeroDepot, 262, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, volaDepot, -14, SpringLayout.NORTH, numeroDepot);
		springLayout.putConstraint(SpringLayout.EAST, numeroDepot, 0, SpringLayout.EAST, volaDepot);
		springLayout.putConstraint(SpringLayout.SOUTH, numeroDepot, -147, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, numeroDepot, 309, SpringLayout.WEST, getContentPane());
		numeroDepot.setColumns(10);
		numeroDepot.setBorder(new LineBorder(new Color(51, 51, 0), 2, true));
		numeroDepot.setBackground(UIManager.getColor("Button.disabledToolBarBorderBackground"));
		getContentPane().add(numeroDepot);
		
		
		
		init();
	}
	public void init() {
		HomeController homeController = new HomeController(this);
		valideDepot.addActionListener(homeController);
	}
}
