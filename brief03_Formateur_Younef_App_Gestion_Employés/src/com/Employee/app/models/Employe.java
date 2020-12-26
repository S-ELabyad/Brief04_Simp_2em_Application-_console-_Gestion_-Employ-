package com.Employee.app.models;

import java.sql.SQLException;

public abstract class Employe {
	Conection con = new Conection();

	private String Nom;
	private String Prenom;
	private int Age;
	
	
    public Employe(String Nom,String Prenom,int Age) {
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.Age=Age;
		
	}
    
   public Employe() {
		
	}
   
    
  //.......method get, set Nom;

    public String getNom() {
    	return Nom;
    }

    public void setNom(String Nom) {
    	this.Nom=Nom;
    }
  //.......method get, set Prenom;

    public String getPrenom() {
    	return Prenom;
    }

    public void setPrenom(String Prenom) {
    	this.Prenom=Prenom;
    }
  //.......method get, set Age;

    public int getAge() {
    	return Age;
    }

    public void setAge(int Age) {
    	this.Age=Age;
    }

    
    //........method..getNom;
    
    public void getNome() {
    	
    }
    
    public abstract double CalculerSalaire(double valeur,int type) ;
    public abstract void ModifierEmployer() throws SQLException;
    public abstract void AfficherEmployer() throws SQLException ;
    	
    
    
}
