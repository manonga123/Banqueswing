/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Common.AccesBdd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import modele.Autres;
import modele.UserModele;

/**
 *
 * @author PCc
 */
public class HistoriqueDao {
    //depot
   public void depot(UserModele user){
       LocalDate daty = LocalDate.now();
       LocalTime temps = LocalTime.now();
       LocalTime heureMoinUn = temps.minusHours(1);
       
   AccesBdd bdd = new AccesBdd();
   bdd.loadDriver();
   String sql = "insert into depot (num_compte,Depot,date,time) values ('"+user.getNumCompte()+"','"+user.getVolaDepot()+"','"+daty+"','"+heureMoinUn+"')";
bdd.executeUpdate(sql);
bdd.closeConnection();
   }
   //retrait
   public void retrait(UserModele user){
       LocalDate daty = LocalDate.now();
       LocalTime temps = LocalTime.now();
       LocalTime heureMoinUn = temps.minusHours(1);
   AccesBdd bdd = new AccesBdd();
   bdd.loadDriver();
   String sql = "insert into retrait (num_compte,retrait,date,time) values('"+user.getNumCompte()+"','"+user.getVolaRetrait()+"','"+daty+"','"+heureMoinUn+"')";
bdd.executeUpdate(sql);
bdd.closeConnection();
   }
    //transfert Mandray
    
    public void transferte(UserModele user, Autres plus){
       LocalDate daty = LocalDate.now();
       LocalTime temps = LocalTime.now();
       LocalTime heureMoinUn = temps.minusHours(1);
   AccesBdd bdd = new AccesBdd();
   bdd.loadDriver();
   String sql = "insert into transfert (num_compteMiala,num_compteAmpina,transfert,date,time) values('"+user.getNumCompte()+"','"+plus.getNum_comptePlus()+"','"+user.getVolaTransfert()+"','"+daty+"','"+heureMoinUn+"')";
bdd.executeUpdate(sql);
bdd.closeConnection();
   }
    //affichage des base
    public void affichage(UserModele user) throws SQLException{
        UserModele users = new UserModele();
        AccesBdd bdd = new AccesBdd();
        bdd.loadDriver();
        String sql = "select * from retrait where num_compte='"+user.getNumCompte()+"'";
        ResultSet rs= bdd.executeSelect(sql);
        while(rs.next()){
            users.setNumCompte(rs.getInt("num_compte"));
            users.setVolaRetrait(rs.getInt("transfert"));
            users.setDate(rs.getString("date"));
            users.setTime(rs.getString("times"));
        }
        bdd.closeConnection();
    }
}
