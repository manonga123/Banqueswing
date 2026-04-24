package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import View.Home;
import View.HomeView;
import View.PageLoginView;
import dao.UserDao;
import modele.UserModele;

public class UserController implements ActionListener {
	PageLoginView pageLoginView;

	public UserController(PageLoginView pageLoginView) {
		// TODO Auto-generated constructor stub
		this.pageLoginView = pageLoginView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object action = e.getSource();
		if(action == pageLoginView.btnReset) {
			pageLoginView.numero.setText("");
			pageLoginView.mdp.setText("");
		}
		if(action == pageLoginView.btnReset_1) {
			pageLoginView.nom.setText("");
			pageLoginView.sexe.setToolTipText("HOMME");
			pageLoginView.email.setText("");
			pageLoginView.password.setText("");
		}
		if(action == pageLoginView.btninscrit) {
			String nom = pageLoginView.nom.getText();
			String email = pageLoginView.email.getText();
			String sexe = pageLoginView.sexe.getSelectedItem().toString();
			String password = pageLoginView.password.getText();
			UserModele userModele = new UserModele();
			userModele.setNom(nom);
			userModele.setEmail(email);
			userModele.setSexe(sexe);
			userModele.setPassword(password);
			UserDao userDao = new UserDao();
			userDao.insert(userModele);
			JOptionPane.showMessageDialog(null, "VOUS ETES INSCRIT !");
			pageLoginView.nom.setText("");
			pageLoginView.sexe.setToolTipText("HOMME");
			pageLoginView.email.setText("");
			pageLoginView.password.setText("");
		}
		if(action == pageLoginView.btnConnecter) {
			String nom = pageLoginView.numero.getText();
			String password = pageLoginView.mdp.getText();
			UserModele userModele = new UserModele();
			
			userModele.setNom(nom);
			userModele.setPassword(password);
			UserDao userDao = new UserDao();
			try {
				boolean valid = userDao.login(userModele);
				if(valid == true) {
					JOptionPane.showMessageDialog(null, "VOUS ETES CONNECTER");
					pageLoginView.setVisible(false);
					HomeView home = new HomeView();
					
				}else {
					JOptionPane.showMessageDialog(null, "erreur, veuillez taper votre nouveu nom ou votre password est incorrect", "Authentification false ", JOptionPane.ERROR_MESSAGE);

				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
