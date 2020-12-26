package com.Employee.app.models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Producteur extends Employe {
	
	private static final int IDProd = 0;

	Conection con = new Conection();	

	    private double SalaireProd = 0;
		private int Date_Entree;

	public Producteur() {
		
	}
	
    
  //.......method get, set SalaireProd;

    public double getSalaireProd() {
    	return SalaireProd;
    }

    public void setSalaireProd(double SalaireProd) {
    	this.SalaireProd=SalaireProd;
    }
    
    //.......method get, set Date_Entre;

    public int getDate_Entree() {
     	return Date_Entree;
     }

     public void setDate_Entree(int Date_Entree) {
     	this.Date_Entree=Date_Entree;
     }
     
     
 	//insert
     public void create_data(String Nom, String Prenom, int Age, double SalaireProd , int Date_Entree)throws SQLException {
 		// TODO Auto-generated method stub
 		con.Connect();
 		PreparedStatement ps = null;
 		try {
 			//Producteur prod = new Producteur(Nom,Prenom,Age,SalaireProd,Date_Entree);
 			String query="INSERT INTO `Producteur`(`ProducteurNom`,`ProducteurPrenom`,`ProducteurAge`,`SalaireProd`,`Date_Entree`) VALUES (?,?,?,?,?)";
 			ps=con.conn.prepareStatement(query);
 			ps.setString(1, Nom);
 			ps.setString(2, Prenom);
 			ps.setInt(3, Age);
 			//ps.setString(4, Type);
 			ps.setDouble(4, SalaireProd);
 			//ps.setDouble(4, rep.CalculerSalaire());
 			ps.setInt(5, Date_Entree);
 		
 			ps.executeUpdate();
 			System.out.println(" \n Producteur Ajoute Avec Succes ");
 		}catch (Exception e) {
 			System.out.print(e);
 		}
 		
 	}

 	//update
		public void update_data(String ProducteurNom ,String ProducteurPrenom,int ProducteurAge,double SalaireProd,int Date_Entree) {
			//First f = new First();
			con.Connect();
			
			PreparedStatement ps = null;
			
			try {
				String query = "UPDATE `producteur` SET `ProducteurNom`=?,`ProducteurPrenom`=?, `ProducteurAge`=? , `SalaireProd`=?, `Date_Entree`=?  WHERE `IDProd`=?";
				ps=con.conn.prepareStatement(query);
				ps.setString(1, ProducteurNom);
				ps.setString(2, ProducteurPrenom);
				ps.setInt(3, ProducteurAge);
				ps.setDouble(4, SalaireProd);
				ps.setInt(5, Date_Entree);
				ps.setInt(6, IDProd);
				ps.executeUpdate();
				System.out.println(" \t modification avec succes");

				
			}catch (Exception e){
				
			}
		}
		



	@Override
	public double CalculerSalaire(double valeur, int type) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void AfficherEmployer() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ModifierEmployer() throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
