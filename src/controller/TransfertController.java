package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import View.TransfertView;
import dao.HistoriqueDao;
import dao.UserDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Autres;
import modele.UserModele;

public class TransfertController implements ActionListener {

    TransfertView transfertView;

    public TransfertController(TransfertView transfertView) {
        // TODO Auto-generated constructor stub
        this.transfertView = transfertView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object action = e.getSource();
        if (action == transfertView.valideTransfert) {
            try {
                UserModele userModele = new UserModele();
                HistoriqueDao dao1 = new HistoriqueDao();
                Autres plus = new Autres();
                UserDao dao = new UserDao();
                int volaTransfert = Integer.parseInt(transfertView.volaTransfert.getText());
                int numCompteAmpina = Integer.parseInt(transfertView.numeroTransfert.getText());
                int numTompony = Integer.parseInt(transfertView.numTompony.getText());
                String password = transfertView.passwordTransfert.getText();
                userModele.setPassword(password);
                userModele.setVolaTransfert(volaTransfert);
                userModele.setNumCompte(numTompony);
                plus.setNum_comptePlus(numCompteAmpina);
                userModele.setNumMandef(numTompony);
                boolean solution = dao.CompteMdp(userModele);
                if (solution == true) {
                    //maka ilay vola ampina
                    try {
                        int volaPresent = dao.volaMoins(userModele);
                        int volaAmpina = dao.volaAmpina(plus);
                        if (volaPresent >= volaTransfert) {
                            int soldeApresTm = volaPresent - volaTransfert;
                            int soldeApresTp = volaTransfert + volaAmpina;
                            plus.setVolaMiampi(soldeApresTp);
                            plus.setVolaNiala(soldeApresTm);
                            dao.volaMiampy(plus);
                            dao.TransfertFini(userModele, plus);
                            dao1.transferte(userModele, plus);
                            JOptionPane.showMessageDialog(null, "Transfert effectuer");
                            transfertView.volaTransfert.setText("");
                            transfertView.numeroTransfert.setText("");
                            transfertView.numTompony.setText("");
                            transfertView.passwordTransfert.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "Votre solde est insufisant ,Veuillez consulter votre solde");
                            transfertView.volaTransfert.setText("");
                        }
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "votre transfert est en echec veuillez verifier votre numero de compte");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TransfertController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
