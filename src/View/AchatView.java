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

public class AchatView extends JFrame{
	public JButton accueil;
	public JButton depot;
	public JButton retrait;
	public JButton transfert;
	public JButton achat;
	public JButton admin;
	public JLabel lblAchat;
	
	public AchatView() {
		getContentPane().setBackground(new Color(204, 204, 204));
		
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
				AchatView.super.dispose();
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
				AchatView.super.dispose();
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
				AchatView.super.dispose();
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
		
		
		achat = new JButton("ACHAT");
		achat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AchatView.super.dispose();
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
		
		
		
		
	}
}
