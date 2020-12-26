package com.Employee.app.models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Producteur_risque  extends Employe {
	
	private static final int iDRisq = 0;

	Conection con = new Conection();	

	    private double SalaireProdrisque = 0;
		private int Date_Entreerisque;

	public Producteur_risque () {
		
	}
	
    
  //.......method get, set SalaireProd;

    public double getSalaireProdrisque() {
    	return SalaireProdrisque;
    }

    public void setSalaireProdrisque(double SalaireProdrisque) {
    	this.SalaireProdrisque=SalaireProdrisque;
    }
    
    //.......method get, set Date_Entre;

    public int getDate_Entreerisque() {
     	return Date_Entreerisque;
     }

     public void setDate_Entreerisque(int Date_Entreerisque) {
     	this.Date_Entreerisque=Date_Entreerisque;
     }
     
     
 	//insert
     public void create_data(String Nom, String Prenom, int Age, double SalaireProdrisque , int Date_Entreerisque)throws SQLException {
 		// TODO Auto-generated method stub
 		con.Connect();
 		PreparedStatement ps = null;
 		try {
 			//Producteur prod = new Producteur(Nom,Prenom,Age,SalaireProd,Date_Entree);
 			String query="INSERT INTO `producteurrisq`(`ProducteurNomrisque`,`ProducteurPrenomrisque`,`ProducteurAgerisque`,`salairetotal`,`Date_Entreerisque`) VALUES (?,?,?,?,?)";
 			ps=con.conn.prepareStatement(query);
 			ps.setString(1, Nom);
 			ps.setString(2, Prenom);
 			ps.setInt(3, Age);
 			//ps.setString(4, Type);
 			ps.setDouble(4, SalaireProdrisque);
 			//ps.setDouble(4, rep.CalculerSalaire());
 			ps.setInt(5, Date_Entreerisque);
 		
 			ps.executeUpdate();
 			System.out.println(" \n Producteur à risque Ajoute Avec Succes ");
 		}catch (Exception e) {
 			System.out.print(e);
 		}
 		
 	}


 	//update
		public void update_data(String ProducteurNomrisque ,String ProducteurPrenomrisque,int 	ProducteurAgerisque,double 	SalaireProdrisque,int 	Date_Entreerisque) {
			//First f = new First();
			con.Connect();
			
			PreparedStatement ps = null;
			
			try {
				String query = "UPDATE `producteurrisq` SET `ProducteurNomrisque`=?,`ProducteurPrenomrisque`=?, `ProducteurAgerisque`=? , `	SalaireProdrisque`=?, `	Date_Entreerisque`=?  WHERE `iDRisq`=?";
				ps=con.conn.prepareStatement(query);
				ps.setString(1, ProducteurNomrisque);
				ps.setString(2, ProducteurPrenomrisque);
				ps.setInt(3, 	ProducteurAgerisque);
				ps.setDouble(4, 	SalaireProdrisque);
				ps.setInt(5, 	Date_Entreerisque);
				ps.setInt(6, iDRisq);
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

