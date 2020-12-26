package com.Employee.app.models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Representeur extends Employe {
	
	Conection con = new Conection();
	
	private int IDrep;
	private double SalaireRep;
	private int Date_Entr;
	
	public  Representeur( String Nom,String Prenom,int Age,double SalaireRep, int Date_Entr) {
		super( Nom, Prenom , Age  );
		this.SalaireRep=SalaireRep;
		this.Date_Entr=Date_Entr;
	
	}
	public Representeur() {
		
	}
	
	//.......method get, set IDrep;

    public int getIDrep() {
    	return IDrep;
    }

    public void setIDrep(int IDrep) {
    	this.IDrep=IDrep;
    }
    
  //.......method get, set SalaireRep;

    public double getSalaireRep() {
    	return SalaireRep;
    }

    public void setSalaireRep(double SalaireRep) {
    	this.SalaireRep=SalaireRep;
    }
    //.......method get, set Date_Entre;

    public int getDate_Entr() {
     	return Date_Entr;
     }

     public void setDate_Entr(int  Date_Entr) {
     	this.Date_Entr=Date_Entr;
     }
     //method calculersalaire
     public double CalculerSalaire() {
     	return 0;
     }
     
     
 	//insert
     public void create_data(String Nom, String Prenom, int Age, double SalaireRep , int Date_Entr) throws SQLException{
 		// TODO Auto-generated method stub
 		con.Connect();
 		PreparedStatement ps = null;
 		try {
 			
 			//Representeur rep = new Representeur(Nom,Prenom,Age,SalaireRep,Date_Entr);
 			String query="INSERT INTO `Representeur`(`RepresenteurNom`,`RepresenteurPrenom`,`RepresenteurAge`,`SalaireRep`,`Date_Entr`) VALUES (?,?,?,?,?)";
 			ps=con.conn.prepareStatement(query);
 			ps.setString(1, Nom);
 			ps.setString(2, Prenom);
 			ps.setInt(3, Age);
 			ps.setDouble(4, SalaireRep);
 			ps.setInt(5, Date_Entr);
 		
 			ps.executeUpdate();
 			System.out.println(" \n Representeur Ajoute Avec Succes ");
 		}catch (Exception e) {
 			System.out.print(e);
 		}
 		
 	}
     
 	//update
		public void update_data(String RepresenteurNom ,String RepresenteurPrenom,int RepresenteurAge,double SalaireRep,int Date_Entr) {
			//First f = new First();
			con.Connect();
			
			PreparedStatement ps = null;
			
			try {
				String query = "UPDATE `representeur` SET `RepresenteurNom`=?,`RepresenteurPrenom`=?, `RepresenteurAge`=? , `SalaireRep`=?, `Date_Entr`=?  WHERE `IDrep`=?";
				ps=con.conn.prepareStatement(query);
				ps.setString(1, RepresenteurNom);
				ps.setString(2, RepresenteurPrenom);
				ps.setInt(3, RepresenteurAge);
				ps.setDouble(4, SalaireRep);
				ps.setInt(5, Date_Entr);
				ps.setInt(5, IDrep);
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
