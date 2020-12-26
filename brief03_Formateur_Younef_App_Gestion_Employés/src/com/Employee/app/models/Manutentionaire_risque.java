package com.Employee.app.models;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manutentionaire_risque  extends Employe {
	
	private static final int iDRisqe = 0;

	Conection con = new Conection();	

	    private double SalaireMentrisque = 0;
		private int Date_Entrisque;

	public Manutentionaire_risque () {
		
	}
	
    
  //.......method get, set SalaireProd;

    public double getSalaireMentrisque() {
    	return SalaireMentrisque;
    }

    public void setSalaireMentrisque(double SalaireMentrisque) {
    	this.SalaireMentrisque=SalaireMentrisque;
    }
    
    //.......method get, set Date_Entre;

    public int getDate_Entrisque() {
     	return Date_Entrisque;
     }

     public void setDate_Entrisque(int Date_Entrisque) {
     	this.Date_Entrisque=Date_Entrisque;
     }
     
     
 	//insert
     public void create_data(String Nom, String Prenom, int Age, double SalaireMentrisque , int Date_Entreerisque)throws SQLException {
 		// TODO Auto-generated method stub
 		con.Connect();
 		PreparedStatement ps = null;
 		try {
 			//Producteur prod = new Producteur(Nom,Prenom,Age,SalaireProd,Date_Entree);
 			String query="INSERT INTO `manutentionaireRisq`(`ManutentionaireNomrisque`,`ManutentionairePrenomrisque`,`ManutentionaireAgerisque`,`SalaireMentrisque`,`Date_Entrisque`) VALUES (?,?,?,?,?)";
 			ps=con.conn.prepareStatement(query);
 			ps.setString(1, Nom);
 			ps.setString(2, Prenom);
 			ps.setInt(3, Age);
 			//ps.setString(4, Type);
 			ps.setDouble(4, SalaireMentrisque);
 			//ps.setDouble(4, rep.CalculerSalaire());
 			ps.setInt(5, Date_Entreerisque);
 		
 			ps.executeUpdate();
 			System.out.println(" \n Manutentionaire_risque à risque Ajoute Avec Succes ");
 		}catch (Exception e) {
 			System.out.print(e);
 		}
 		
 	}

 	//update
		public void update_data(String ManutentionaireNomrisque ,String ManutentionairePrenomrisque	,int ManutentionaireAgerisque,double SalaireMentrisque,int Date_Entrisque) {
			//First f = new First();
			con.Connect();
			
			PreparedStatement ps = null;
			
			try {
				String query = "UPDATE `manutentionairerisq` SET `ManutentionaireNomrisque`=?,`ManutentionairePrenomrisque	`=?, ManutentionaireAgerisque=? , SalaireMentrisque=?, Date_Entrisque=?  WHERE `iDRisqe`=?";
				ps=con.conn.prepareStatement(query);
				ps.setString(1, ManutentionaireNomrisque);
				ps.setString(2, ManutentionairePrenomrisque	);
				ps.setInt(3, ManutentionaireAgerisque);
				ps.setDouble(4, SalaireMentrisque);
				ps.setInt(5, Date_Entrisque);
				ps.setInt(6, iDRisqe);
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


