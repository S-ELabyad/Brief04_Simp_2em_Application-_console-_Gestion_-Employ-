package com.Employee.app.models;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manutentionaire extends Employe {
	
	Conection con = new Conection();
	    private int Date_Ent;
	    private double SalaireMent = 0;
		private int IDMent;
	    
	    
	    public  Manutentionaire( String Nom,String Prenom,int Age,double SalaireMent, int Date_Ent) {
			super( Nom, Prenom , Age  );
			this.SalaireMent=0;
			this.Date_Ent=Date_Ent;
		
		}
	public Manutentionaire() {
		
	}
	
	
	
	//.......method get, set IDMent;

   /* public int getIDMent() {
    	return IDMent;
    }

    public void setIDMent(int IDMent) {
    	this.IDMent=IDMent;
    }*/
    
  //.......method get, set SalaireMent;

    public double getSalaireMent() {
    	return SalaireMent;
    }

    public void setSalaireMent(double SalaireMent) {
    	this.SalaireMent=SalaireMent;
    }
    
    //.......method get, set Date_Entre;

     public int getDate_Ent() {
      	return Date_Ent;
      }

      public void setDate_Ent(int Date_Ent) {
      	this.Date_Ent=Date_Ent;
      }

  	//insert
      public void create_data(String Nom, String Prenom, int Age, double SalaireMent , int Date_Ent) throws SQLException {
  		// TODO Auto-generated method stub
  		con.Connect();
  		PreparedStatement ps = null;
  		try {
  			//Manutentionaire ment = new Manutentionaire(Nom,Prenom,Age,SalaireRep,Date_Entr);
  			String query="INSERT INTO `Manutentionaire`(`ManutentionaireNom`,`ManutentionairePrenom`,`ManutentionaireAge`,`SalaireMent`,`Date_Ent`) VALUES (?,?,?,?,?)";
  			ps=con.conn.prepareStatement(query);
  			ps.setString(1, Nom);
  			ps.setString(2, Prenom);
  			ps.setInt(3, Age);
  			ps.setDouble(4, SalaireMent);
  			//ps.setDouble(4, ment.CalculerSalaire());
  			ps.setInt(5, Date_Ent);
  		
  			ps.executeUpdate();
  			System.out.println(" \n Manutentionaire Ajoute Avec Succes ");
  		}catch (Exception e) {
  			System.out.print(e);
  		}
  		
  	}
  	//update
		public void update_data(String ManutentionaireNom ,String ManutentionairePrenom,int ManutentionaireAge,double SalaireMent,int Date_Ent) {
			//First f = new First();
			con.Connect();
			
			PreparedStatement ps = null;
			
			try {
				String query = "UPDATE `manutentionaire` SET `ManutentionaireNom`=?,`ManutentionairePrenom`=?, `ManutentionaireAge`=? , `SalaireMent`=?, `Date_Ent`=?  WHERE `IDMent`=?";
				ps=con.conn.prepareStatement(query);
				ps.setString(1, ManutentionaireNom);
				ps.setString(2, ManutentionairePrenom);
				ps.setInt(3, ManutentionaireAge);
				ps.setDouble(4, SalaireMent);
				ps.setInt(5, Date_Ent);
				ps.setInt(6, IDMent);
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
