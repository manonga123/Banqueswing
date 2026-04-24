package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import View.RetraitView;
import dao.HistoriqueDao;
import dao.UserDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.UserModele;

public class RetraitController implements ActionListener {

    RetraitView retraitView;

    public RetraitController(RetraitView retraitView) {
        // TODO Auto-generated constructor stub
        this.retraitView = retraitView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object action = e.getSource();
            HistoriqueDao dao = new HistoriqueDao();
            UserDao userDao = new UserDao();
            int numCompte = Integer.parseInt(retraitView.numeroRetrait.getText());
            int volaRetrait = Integer.parseInt(retraitView.volaRetrait.getText());
            UserModele userModele = new UserModele();
            boolean solution = userDao.Compte(userModele);
            if (solution == true) {
                if (action == retraitView.valideRetrait) {
                    userModele.setVolaRetrait(volaRetrait);
                    userModele.setNumCompte(numCompte);                    
                    userDao.volaRetrait(userModele);
                    dao.retrait(userModele);
                    JOptionPane.showMessageDialog(null, "votre retrait est en succées");
                    retraitView.volaRetrait.setText("");
                    retraitView.numeroRetrait.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "votre retrait est en echec veuillez verifier votre numero de compte");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RetraitController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
