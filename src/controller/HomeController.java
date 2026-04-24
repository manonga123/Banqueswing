package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Common.AccesBdd;
import View.DepotView;
import View.RetraitView;
import dao.HistoriqueDao;
import dao.UserDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.UserModele;

public class HomeController implements ActionListener {

    DepotView depotView;

    public HomeController(DepotView depotView) {
        // TODO Auto-generated constructor stub
        this.depotView = depotView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // TODO Auto-generated method stub
            Object action = e.getSource();
            HistoriqueDao dao = new HistoriqueDao();
            UserDao userDao = new UserDao();
            int numCompte = Integer.parseInt(depotView.numeroDepot.getText());
            int volaDepot = Integer.parseInt(depotView.volaDepot.getText());
            UserModele userModele = new UserModele();
            userModele.setVolaDepot(volaDepot);
            userModele.setNumCompte(numCompte);
            boolean solution = userDao.Compte(userModele);
            if(solution == true){
                if (action == depotView.valideDepot) {
                    userDao.volaDepot(userModele);
                    dao.depot(userModele);
                    JOptionPane.showMessageDialog(null, "Argent deposer avec succees");
                    depotView.volaDepot.setText("");
                    depotView.numeroDepot.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "votre depot est en echec veuillez verifier votre numero de compte");
            }} catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
