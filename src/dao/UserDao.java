package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import Common.AccesBdd;
import modele.Autres;
import modele.UserModele;

public class UserDao{
	 
	//insertion user
	long num_compte=(long) Math.floor(Math.random()*9999)+198;
	public void insert(UserModele userModele) {
		String sql = "INSERT INTO user(id_user,nom,email,sexe,password,num_compte) VALUES('"+userModele.getId_user()+"','"+userModele.getNom()+"','"+userModele.getEmail()+"','"+userModele.getSexe()+"','"+userModele.getPassword()+"','"+num_compte+"')";
		AccesBdd accesBdd = new AccesBdd();
		accesBdd.loadDriver();
		accesBdd.executeUpdate(sql);
		accesBdd.closeConnection();
	}
	//maka ilai num compte nu olona
	public int num_compte(UserModele userModele) throws SQLException{
		int num_compte1=0;
		 AccesBdd accesBdd = new AccesBdd();
	        accesBdd.loadDriver();
		String sql1 ="select * from user where nom='"+userModele.getNom()+ "' and password='"+ userModele.getPassword() +"'";
        ResultSet rs = accesBdd.executeSelect(sql1);
        while(rs.next()){
        num_compte1=rs.getInt("num_compte");
        }
        accesBdd.closeConnection();
        return num_compte1;
	}
	//verifiaction login
	 public boolean login(UserModele userModele) throws SQLException{		
	        boolean valid = false;
	        String sql = "select * from user where nom='"+userModele.getNom()+ "' and password='"+ userModele.getPassword() +"'";
	        AccesBdd accesBdd = new AccesBdd();
	        accesBdd.loadDriver();
	        ResultSet executeSelect = accesBdd.executeSelect(sql);
	            while(executeSelect.next()){
	                valid = true;
	            }
	            
	        accesBdd.closeConnection();
	        return valid;
	    }
	 
	 ///depot d'argent
	 public void volaDepot(UserModele userModele) {
		 AccesBdd accesBdd = new AccesBdd();
		 accesBdd.loadDriver();
		 String select = "SELECT * FROM user WHERE num_compte = '"+userModele.getNumCompte()+"'";
		 ResultSet resultSet = accesBdd.executeSelect(select);
		 try {
			while(resultSet.next()) {
				 int volaSolde = userModele.getVolaDepot();
				 int volaDepote = resultSet.getInt("solde");
				 int newSolde = volaSolde + volaDepote;
				 String sql = "UPDATE user SET volaDepot = '"+ userModele.getVolaDepot()+"' WHERE num_compte = '"+userModele.getNumCompte()+"'";
				 String totalSolde = "UPDATE user SET solde = '"+ newSolde +"' WHERE num_compte = '"+userModele.getNumCompte()+"'";
				
				 accesBdd.executeSelect(sql);
				 accesBdd.executeUpdate(totalSolde);
				 accesBdd.closeConnection();
				

			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
	 
	 //retrait d'argent
	 public void volaRetrait(UserModele userModele) {

		// String sql = "UPDATE user SET volaRetrait = '"+userModele.getVolaRetrait()+"' WHERE num_compte = '"+userModele.getNumCompte()+"'";
		 AccesBdd accesBdd = new AccesBdd();
		 accesBdd.loadDriver();
		 String select = "SELECT * FROM user WHERE num_compte = '"+userModele.getNumCompte()+"'";
		 ResultSet resultSet = accesBdd.executeSelect(select);
		 try {
			while(resultSet.next()) {
				 int volaSolde = resultSet.getInt("solde");
				 int volaRetrait = userModele.getVolaRetrait();
				 int newSolde = volaSolde - volaRetrait;
				 if(volaSolde>volaRetrait) {
				 String totalSolde = "UPDATE user SET solde = '"+newSolde+"' WHERE num_compte = '"+userModele.getNumCompte()+"'";
				 accesBdd.executeUpdate(totalSolde);
				 
				 accesBdd.closeConnection();
				 }else {
					 JOptionPane.showMessageDialog(null, " Le solde dans votre compte est insuffisant");
				 }
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 } 
	 /*fonction de retrait tous */
	 public int volaAmpina(Autres plus) throws SQLException{
		 int vola1=0;
		 AccesBdd acces = new AccesBdd();
		 acces.loadDriver();
		 String sql ="select * from user where num_compte ='"+plus.getNum_comptePlus()+"'";
		 ResultSet resultat = acces.executeSelect(sql);
		 while(resultat.next()){
			vola1 = resultat.getInt("solde"); 
		 }
		 acces.closeConnection();
		 return vola1;
	 }
	 public void volaMiampy(Autres user){
		 AccesBdd acces = new AccesBdd();
		 acces.loadDriver();
		 String sql = "update user set solde = '"+user.getVolaMiampi()+"' where num_compte='"+user.getNum_comptePlus()+"'";
		 acces.executeUpdate(sql);
		 acces.closeConnection();
	 }
	 public int volaMoins(UserModele user) throws SQLException{
		 int vola=0;
		 AccesBdd acces = new AccesBdd();
		 acces.loadDriver();
		 String sql ="select * from user where num_compte ='"+user.getNumMandef()+"'";
		 ResultSet resultat = acces.executeSelect(sql);
		 while(resultat.next()){
			vola = resultat.getInt("solde"); 
		 }
		 acces.closeConnection();
		 return vola;
	 }
	 
	 public void TransfertFini(UserModele user , Autres plus){
		 AccesBdd acces = new AccesBdd();
		 acces.loadDriver();
		 String sql = "update user set solde = '"+plus.getVolaNiala()+"' where num_compte='"+user.getNumCompte()+"'";
		 acces.executeUpdate(sql);
		 acces.closeConnection();
	 }
         //verification num compte
         public boolean Compte(UserModele user) throws SQLException{
             boolean solution = false;
              AccesBdd acces = new AccesBdd();
		 acces.loadDriver();
                 String sql = "select * from user where num_compte='"+user.getNumCompte()+"'";
                 ResultSet rs = acces.executeSelect(sql);
                 while(rs.next()){
                     solution = true;
                 }
             acces.closeConnection();
             return  solution;
         } 
          public boolean CompteMdp(UserModele user) throws SQLException{
             boolean solution = false;
              AccesBdd acces = new AccesBdd();
		 acces.loadDriver();
                 String sql = "select * from user where num_compte='"+user.getNumCompte()+"' and password='"+user.getPassword()+"'";
                 ResultSet rs = acces.executeSelect(sql);
                 while(rs.next()){
                     solution = true;
                 }
             acces.closeConnection();
             return  solution;
         } 
          //consultation solde
          public int SoldeConsult(UserModele user) throws SQLException{
              AccesBdd acces = new AccesBdd();
              int solde  = 0;
              String sql = "select * from user where num_compte = '"+user.getNumCompte()+"' and password ='"+user.getPassword()+"'";
              acces.loadDriver();
              ResultSet rs = acces.executeSelect(sql);
              while(rs.next()){
                  solde = rs.getInt("solde");
              }
              acces.closeConnection();
              return solde;
          }
}