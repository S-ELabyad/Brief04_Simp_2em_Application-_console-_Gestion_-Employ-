package com.Employee.app.models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Vendeur extends Employe{
	Conection con = new Conection();
	
	private int ID;
	private double SalaireVente;
	private int Date_Entre;
	
	public  Vendeur(String Nom,String Prenom,int Age ,double SalaireVente,int Date_Entre) {
		super(Nom, Prenom , Age  );
		//this.ID=id;
		this.SalaireVente=SalaireVente;
		this.Date_Entre=Date_Entre;
	
	}
	public Vendeur() {
		
	}
	
	
	
	//.......method get, set ID;

    public int getID() {
    	return ID;
    }

    public void setID(int ID) {
    	this.ID=ID;
    }
    
  //.......method get, set SalaireVente;

    public double getSalaireVente() {
    	return SalaireVente;
    }

    public void setSalaireVente(double SalaireVente) {
    	this.SalaireVente=SalaireVente;
    }

    //.......method get, set Date_Entre;

    public int getDate_Entre() {
     	return Date_Entre;
     }

     public void setDate_Entre(int Date_Entre) {
     	this.Date_Entre=Date_Entre;
     }
	public void create_data(String Nom, String Prenom, int Age, double SalaireVente , int Date_Entre) throws SQLException{
		// TODO Auto-generated method stub
		con.Connect();
		PreparedStatement ps = null;
		try {
			String query="INSERT INTO `Vendeur`(`Nom`,`Prenom`,`Age`,`SalaireVente`,`Date_Entre`) VALUES (?,?,?,?,?)";
			//ps=con.conn.prepareStatement(query);
			ps=con.conn.prepareStatement(query);
			ps.setString(1, Nom);
			ps.setString(2, Prenom);
			ps.setInt(3, Age);
			//ps.setString(4, Type);
			ps.setDouble(4, SalaireVente);
			ps.setInt(5, Date_Entre);
		
			ps.executeUpdate();
			System.out.println(" \n Vendeur Ajoute Avec Succes ");
		}catch (Exception e) {
			System.out.print(e);
		}
		
	}
	//update
		public void update_data(String Nom ,String Prenom,int Age,double SalaireVente,int Date_Entre) {
			//First f = new First();
			con.Connect();
			
			PreparedStatement ps = null;
			
			try {
				String query = "UPDATE `vendeur` SET `Nom`=?,`Prenom`=?, Age=? , SalaireVente=?, Date_Entre=?  WHERE `ID`=?";
				ps=con.conn.prepareStatement(query);
				ps.setString(1, Nom);
				ps.setString(2, Prenom);
				ps.setInt(3, Age);
				ps.setDouble(4, SalaireVente);
				ps.setInt(5, Date_Entre);
				ps.setInt(6, ID);
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
