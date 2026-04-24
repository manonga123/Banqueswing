package test;

import java.sql.SQLException;

import Common.AccesBdd;
import dao.HistoriqueDao;
import dao.UserDao;
import java.time.LocalDate;
import java.time.LocalTime;
import modele.UserModele;

public class main {

    public static void main(String[] args) throws SQLException{
       UserDao dao = new UserDao();
       int un = 4637;
       UserModele user = new UserModele();
       user.setNumCompte(un);
      boolean e =dao.Compte(user);
      if(e==true){
          System.err.println("oko");
      }
      else{
          System.err.println("non");
      }
    }

}
