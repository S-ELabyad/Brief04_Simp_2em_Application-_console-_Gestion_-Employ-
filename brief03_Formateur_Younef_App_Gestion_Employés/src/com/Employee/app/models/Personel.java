package com.Employee.app.models;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;


public class Personel  extends Employe implements Manutentionaire_rique , Producteur_rique{
	

	private static final String ID = null;
	Conection con = new Conection();
	Scanner scanner= new Scanner(System.in);
	
	public  Personel( String Nom,String Prenom,int Age) {
		super( Nom, Prenom , Age  );
	
	}
	public Personel() {
		
	}
	//....methode...AjouterEmployer;
	
	public void AjouterEmployer() {
		
	}
	//....methode...ModifierEmployer;
	
		public  void ModifierEmployer() {
	
		}
	
	//debut..methode...SalaireMoyen;
	
	public void SalaireMoyen() {
		
	}
	@Override
	public double CalculerSalaire(double vleurAjoute,int type) {

		int a = 0;
		double valeurtotal = 0;
		 if (type == 1) {
             valeurtotal = (20 * vleurAjoute) / 100;
             valeurtotal = valeurtotal + 1500 ;
         }else if (type == 2) {
             valeurtotal = (20 * vleurAjoute) / 100;
             valeurtotal = valeurtotal + 2500 ;
         }else if (type == 3) {
             valeurtotal = vleurAjoute * 5 ;
         }else if (type == 4) {
             valeurtotal = vleurAjoute * 50 ;
         }else if (type == 5) {
             valeurtotal = vleurAjoute * 5 ;
             valeurtotal = valeurtotal + salaireFixeProducteur ;

         }else if (type == 6) {
             valeurtotal = vleurAjoute * 50 ;
             //valeurtotal = valeurtotal + 200 ;
             valeurtotal = valeurtotal + salaireFixeMentionaire ;
             
         }
		return valeurtotal;
		
	}
	
	
	//.......fin de method
	//debut method afficher
	public static void tt() {
		}
	public void AfficherEmployer() throws SQLException {
		 System.out.println(" Choisir  le type d'employer pour Afficher "
			 		+ " \n Vendeur : .................1 "
			 		+ "\n Representeur  :..............2"
			 		+ "\n Producteur  :................ 3"
			 		+  "\n Manutentionaire  :.............. 4\"");
		 String method2=scanner.next();
		 switch(method2) {
		 case "1":
			 System.out.println("\n List Vendeur :");
			 //1
			 //SELECT * FROM `vendeur`
			//select
		    
	        //First f = new First();
	        con.Connect();
	        con.stat = con.conn.createStatement();
	        con.rs = con.stat.executeQuery("SELECT * FROM `vendeur`");
	        while(con.rs.next()) {
	            System.out.println(" -------> ID:  " + "\t" +con.rs.getInt("ID") + "\n \t Name: " + con.rs.getString("Nom") + " \n \t Prenom:  " + con.rs.getString("Prenom") + " \n \t Age:   " + con.rs.getInt("Age") + " \n \t SalaireVente:   " + con.rs.getDouble("SalaireVente") + " \n \t Date Entre:   " + con.rs.getInt("Date_Entre"));
	        }
			 break;
			 
		//..........
		 case "2":
			 System.out.println("\n List Representeur :");
			//2
			//select
		
	        con.Connect();
	        con.stat = con.conn.createStatement();
	        con.rs = con.stat.executeQuery("SELECT * FROM `representeur`");
	        while(con.rs.next()) {
	            System.out.println(" -------> ID:  " + "\t" +con.rs.getInt("IDrep") + "\n \t Name: " + con.rs.getString("RepresenteurNom") + " \n \t Prenom:  " + con.rs.getString("RepresenteurPrenom") + " \n \t Age:   " + con.rs.getInt("RepresenteurAge") + " \n \t SalaireRepresenteur:   " + con.rs.getDouble("SalaireRep") + " \n \t Date Entre:   " + con.rs.getInt("Date_Entr"));
	        }
			 break;
			 //........
		 case "3":
			 
			 System.out.println(" Choisir un Producteur pour AfficHer "
						
							 		+ "\n Producteur  :.............1"
							 		+ "\n Producteur a risque  :................ 2\"");
			 String choice=scanner.next();
			 switch(choice) {
			 case "1":
				 System.out.println("\n List Producteur :");
					//2
					//select
				
			        con.Connect();
			        con.stat = con.conn.createStatement();
			        con.rs = con.stat.executeQuery("SELECT * FROM `producteur`");
			        while(con.rs.next()) {
			            System.out.println(" -------> ID:  " + "\t" +con.rs.getInt("IDProd") + "\n \t Name: " + con.rs.getString("ProducteurNom") + " \n \t Prenom:  " + con.rs.getString("ProducteurPrenom") + " \n \t Age:   " + con.rs.getInt("ProducteurAge") + " \n \t Salaire Producteur :   " + con.rs.getDouble("SalaireProd") + " \n \t Date Entre:   " + con.rs.getInt("Date_Entree"));
			        }
				 break;
				
			 case "2":
				 System.out.println("\n List Producteur a risque :");
					//2
					//select
				
			        con.Connect();
			        con.stat = con.conn.createStatement();
			        con.rs = con.stat.executeQuery("SELECT * FROM `producteurrisq`");
			        while(con.rs.next()) {
			        	System.out.println(" -------> ID:  " + "\t" +con.rs.getInt("iDRisq") + "\n \t Name: " + con.rs.getString("ProducteurNomrisque") + " \n \t Prenom:  " + con.rs.getString("ProducteurPrenomrisque") + " \n \t Age:   " + con.rs.getInt("ProducteurAgerisque") + " \n \t Salaire Producteur a risque :   " + con.rs.getDouble("SalaireProdrisque") + " \n \t Date Entre:   " + con.rs.getInt("Date_Entreerisque"));
			        }
				 break;
			 }
			 break;
			 //........
		 case "4":
			 System.out.println(" Choisir un Manutentionaire pour Afficher"
						
							 		+ "\n Manutentionaire  :1"
							 		+ "\n Manutentionaire a risque  : 2\"");
			 
			 String Choix=scanner.next();
			 switch(Choix) {
			 case "1":
				 System.out.println("\n List Manutentionaire :");
					//select
				
			        con.Connect();
			        con.stat = con.conn.createStatement();
			        con.rs = con.stat.executeQuery("SELECT * FROM `manutentionaire`");
			        while(con.rs.next()) {
			            System.out.println(" -------> ID:  " + "\t" +con.rs.getInt("IDMent") + "\n \t Name: " + con.rs.getString("ManutentionaireNom") + " \n \t Prenom:  " + con.rs.getString("ManutentionairePrenom") + " \n \t Age:   " + con.rs.getInt("ManutentionaireAge") + " \n \t Salaire Manutentionaire :   " + con.rs.getDouble("SalaireMent") + " \n \t Date Entre:   " + con.rs.getInt("Date_Ent"));
			        }
				 break;
			 case "2":
				 
				 System.out.println("\n List Manutentionaire a risque   :");
					//2
					//select
				
			        con.Connect();
			        con.stat = con.conn.createStatement();
			        con.rs = con.stat.executeQuery("SELECT * FROM `manutentionairerisq`");
			        while(con.rs.next()) {
			            System.out.println(" -------> ID:  " + "\t" +con.rs.getInt("iDRisqe") + "\n \t Name: " + con.rs.getString("ManutentionaireNomrisque") + " \n \t Prenom:  " + con.rs.getString("ManutentionairePrenomrisque") + " \n \t Age:   " + con.rs.getInt("ManutentionaireAgerisque") + " \n \t Salaire Manutentionaire a risque :   " + con.rs.getDouble("SalaireMentrisque") + " \n \t Date Entre:   " + con.rs.getInt("Date_Entrisque"));
			        }
				 break;
			 }
			 
			 break;
			 
		 }
	}
	//fin..methode 
	//debut..methode..Suprimmer------------------------------------

	public static void nn() {
	}
public void SuprimmerEmployer() throws SQLException {
	 System.out.println(" Choisir  le type d'employer pour Supprimer "
		 		+ " \n Vendeur : .................1 "
		 		+ "\n Representeur  :..............2"
		 		+ "\n Producteur  :................ 3"
		 		+  "\n Manutentionaire  :.............. 4\"");
	 String method2=scanner.next();
		con.Connect();
		PreparedStatement ps = null;
	 switch(method2) {
	 case "1":
		 System.out.println("\n List Vendeur :");
		 scanner.nextLine();
		 System.out.println("Entre le ID :");
		 int ID =scanner.nextInt();

		
		try {
	         String query = "DELETE FROM `vendeur` WHERE ID=?";
	         ps=con.conn.prepareStatement(query);
	         ps.setInt(1, ID);
	         ps.executeUpdate();
	         System.out.println(" \t Supression avec succes");

	     }catch (Exception e){}
		
		 break;
		 
	//..........
	 case "2":
		 System.out.println("\n List Representeur :");
		 scanner.nextLine();
		 System.out.println("Entre le ID :");
		 int IDrep =scanner.nextInt();

		
		try {
	         String query = "DELETE FROM `representeur` WHERE IDrep=?";
	         ps=con.conn.prepareStatement(query);
	         ps.setInt(1, IDrep);
	         ps.executeUpdate();
	         System.out.println(" \t Supression avec succes");

	     }catch (Exception e){}
      
		 break;
		 //........
	 case "3":
		 
		 System.out.println(" Choisir un Producteur pour AfficHer "
					
						 		+ "\n Producteur  :.............1"
						 		+ "\n Producteur a risque  :................ 2\"");
		 String choice=scanner.next();
		 switch(choice) {
		 case "1":
			 System.out.println("\n List Producteur :");
			 scanner.nextLine();
			 System.out.println("Entre le ID :");
			 int IDProd =scanner.nextInt();

			
			try {
		         String query = "DELETE FROM `producteur` WHERE IDProd=?";
		         ps=con.conn.prepareStatement(query);
		         ps.setInt(1, IDProd);
		         ps.executeUpdate();
		         System.out.println(" \t Supression avec succes");

		     }catch (Exception e){}
		       
			 break;
			
		 case "2":
			 System.out.println("\n List Producteur a risque :");
			
			 scanner.nextLine();
			 System.out.println("Entre le ID :");
			 int iDRisq =scanner.nextInt();

			
			try {
		         String query = "DELETE FROM `producteurrisq` WHERE iDRisq=?";
		         ps=con.conn.prepareStatement(query);
		         ps.setInt(1, iDRisq);
		         ps.executeUpdate();
		         System.out.println(" \t Supression avec succes");

		     }catch (Exception e){}
		    		       
			 break;
		 }
		 break;
		 //........
	 case "4":
		 System.out.println(" Choisir un Manutentionaire pour Afficher"
					
						 		+ "\n Manutentionaire  :1"
						 		+ "\n Manutentionaire a risque  : 2\"");
		 
		 String Choix=scanner.next();
		 switch(Choix) {
		 case "1":
			 System.out.println("\n List Manutentionaire :");
			 scanner.nextLine();
			 System.out.println("Entre le ID :");
			 int IDMent =scanner.nextInt();
			  System.out.println(" \t Supression avec succes");
			
			try {
		         String query = "DELETE FROM `manutentionaire` WHERE IDMent=?";
		         ps=con.conn.prepareStatement(query);
		         ps.setInt(1, IDMent);
		         ps.executeUpdate();

		     }catch (Exception e){}      
			 break;
		 case "2":
			 
			 System.out.println("\n List Manutentionaire a risque   :");
			 scanner.nextLine();
			 System.out.println("Entre le ID :");
			 int iDRisqe =scanner.nextInt();

			
			try {
		         String query = "DELETE FROM `manutentionairerisq` WHERE iDRisqe=?";
		         ps=con.conn.prepareStatement(query);
		         ps.setInt(1, iDRisqe);
		         ps.executeUpdate();
		         System.out.println(" \t Supression avec succes");

		     }catch (Exception e){} 
			 break;
		 }
		 
		 break;
		 
	 }
}
	//fin..methode

//fin..methode
//annuler
	  /* 	public void delete_data(int id) throws SQLException {
		   con.Connect();
		   con.stat = con.conn.createStatement();
		con.rs = con.stat.executeQuery("SELECT AVG(SalaireVente) AS Moyene , ID FROM info_salaire WHERE ID ="+ID);
		while(con.rs.next()) {
		    System.out.println(" -------> ID:  " + "\t" +con.rs.getInt("ID") + "\n \t La Moyene: " + con.rs.getString("Moyene"));
		}
}*/

}

