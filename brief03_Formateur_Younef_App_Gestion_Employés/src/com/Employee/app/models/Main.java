package com.Employee.app.models;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		Conection con = new Conection();
		con.Connect();
		
		
		Personel personel = new Personel();
		Vendeur vendeur = new Vendeur();
		Representeur representeur = new Representeur();
		Producteur producteur = new Producteur();
		Producteur_risque producteurrisq = new Producteur_risque();
		Manutentionaire manutentionaire = new Manutentionaire();
		Manutentionaire_risque manutentionaireRisq = new Manutentionaire_risque();
	

		//..................................
		boolean Quit = false;
		
		while (Quit != true) {
		
			System.out.println(" _________________________________\n "
							 + "Ajouter Employe: ...............1 \n"
							 + " Afficher Employer: ........2 \n"
							 + "Supprimer Employer:.........3 \n"
							 + "Modifier Employer:..........4 \n"
							 + "Annuler Programme:..........5 \n");
							
			String method=scanner.next();
			switch(method) {
			
			case "1":
				//add
				 System.out.println(" Ajouter le type d'employer "
					 		+ " \n Vendeur : .................1 "
					 		+ "\n Representeur  :..............2"
					 		+ "\n Producteur  :................ 3"
					 		+  "\n Manutentionaire  :.............. 4\"");
				 
				 String method2=scanner.next();
				 double salairetotal = 0;
				 switch(method2) {
				  case "1":
					 //add Vendeur
						
					   System.out.println("Entrer Votre nom " );
					
						String Nom=scanner.next();
						scanner.nextLine();
						
						System.out.println("Entrer Votre prenom " );
						String Prenom=scanner.nextLine();
				
						
						System.out.println("Entrer Votre Age " );
						int Age=scanner.nextInt();
						scanner.nextLine();
						
						System.out.println("Entrer Votre SalaireVente " );
						double SalaireVente=scanner.nextDouble();
						
						
						System.out.println("Entrer Votre Date_Entre " );
						int Date_Entre=scanner.nextInt();
						scanner.nextLine();
						//YA BISMILAAH
						salairetotal = personel.CalculerSalaire(SalaireVente,1);
						System.out.println("ha taman:"+salairetotal);
						
						vendeur.create_data(Nom,Prenom,Age,salairetotal,Date_Entre);
						//LAH YKHLEF
					 // employee.create_data();
					  
					  break;
				  case "2":
					  //add Representeur
	
					  System.out.println("Entrer Votre nom " );
					  
						 String RepresenteurNom =scanner.next();
						 scanner.nextLine();
						
						System.out.println("Entrer Votre prenom " );
						String RepresenteurPrenom=scanner.nextLine();
											
						System.out.println("Entrer Votre Age " );
						int RepresenteurAge=scanner.nextInt();
						 scanner.nextLine();
						
						
						System.out.println("Entrer Votre SalaireRep " );
						double SalaireRep=scanner.nextDouble();
						 scanner.nextLine();
						
						
						System.out.println("Entrer Votre Date_Entr " );
						int Date_Entr=scanner.nextInt();
						
						//YA BISMILAAH
						salairetotal = personel.CalculerSalaire(SalaireRep,2);
						System.out.println("ha taman:"+salairetotal);
						
						
						representeur.create_data(RepresenteurNom,RepresenteurPrenom,RepresenteurAge,salairetotal,Date_Entr);
						//LAH YKHLEF

					
					  
					  break;
				  case "3":
					  //add Producteur
						 System.out.println(" Ajouter le type Producteur "
				
							 		+ "\n Producteur  :.............1"
							 		+ "\n Producteur a risque  :................ 2\"");
						 
						 String choix=scanner.next();
						 switch(choix) {
						 case "1":
							 //add Producteur
							  
							  System.out.println("Entrer Votre nom " );
								String ProducteurNom =scanner.next();
								 scanner.nextLine();
								
								System.out.println("Entrer Votre prenom " );
								String ProducteurPrenom=scanner.nextLine();
								
								
								System.out.println("Entrer Votre Age " );
								int ProducteurAge=scanner.nextInt();
								 scanner.nextLine();
								
								System.out.println("Entrer Votre SalaireProd " );
								double SalaireProd=scanner.nextDouble();
								 scanner.nextLine();
								
								
								System.out.println("Entrer Votre Date_Entree " );
								int Date_Entree=scanner.nextInt();
								//YA BISMILAAH
								salairetotal = personel.CalculerSalaire(SalaireProd,3);
								System.out.println("ha taman:"+salairetotal);
								
								producteur.create_data(ProducteurNom,ProducteurPrenom,ProducteurAge,salairetotal,Date_Entree);
								//LAH YKHLEF
								
								
							 
						 break;	
						 
						 //.........producteur a risque
						 case "2":
							 
							 //.........producteur a risque 
							 
				
							  
							  System.out.println("Entrer Votre nom " );
								String ProducteurNomrisque =scanner.next();
								 scanner.nextLine();
								
								System.out.println("Entrer Votre prenom " );
								String ProducteurPrenomrisque=scanner.nextLine();
								
								
								System.out.println("Entrer Votre Age " );
								int ProducteurAgerisque=scanner.nextInt();
								 scanner.nextLine();
								
								System.out.println("Entrer Votre SalaireProd " );
								double SalaireProdrisque=scanner.nextDouble();
								 scanner.nextLine();
								
								
								System.out.println("Entrer Votre Date_Entree " );
								int Date_Entreerisque=scanner.nextInt();
								//YA BISMILAAH
								salairetotal = personel.CalculerSalaire(SalaireProdrisque,5);
								System.out.println("ha taman:"+salairetotal);
								
								producteurrisq.create_data(ProducteurNomrisque,ProducteurPrenomrisque,ProducteurAgerisque,salairetotal,Date_Entreerisque);
								//LAH YKHLEF
						 break;	 
						 
						 }
											 	
					  break;
					  
				  case "4":
					  //add Manutentionaire
						 System.out.println(" Ajouter le type Manutentionaire "
				
							 		+ "\n Manutentionaire  :1"
							 		+ "\n Manutentionaire a risque  : 2\"");
						 
						 String choix2=scanner.next();
						 switch(choix2) {
						 case "1":
							
							  
							  System.out.println("Entrer Votre nom " );
								String ManutentionaireNom=scanner.next();
								scanner.nextLine();
								
								System.out.println("Entrer Votre prenom " );
								String ManutentionairePrenom=scanner.nextLine();
								
								System.out.println("Entrer Votre Age " );
								int ManutentionaireAge=scanner.nextInt();
								scanner.nextLine();
								
								System.out.println("Entrer Votre SalaireMent " );
								double SalaireMent=scanner.nextDouble();
								scanner.nextLine();
								
								
								System.out.println("Entrer Votre Date_Ent " );
								int Date_Ent=scanner.nextInt();
								
								//YA BISMILAAH
								salairetotal = personel.CalculerSalaire(SalaireMent,4);
								System.out.println("ha taman:"+salairetotal);
								
								manutentionaire.create_data(ManutentionaireNom,ManutentionairePrenom,ManutentionaireAge,salairetotal,Date_Ent);
								//LAH YKHLEF
								
								
							 
						 break;	
						 
						 //.........Manutentionaire a risque
						 case "2":
							 
							 //.........Manutentionaire a risque
							 
							 
							 System.out.println("Entrer Votre nom " );
								String ManutentionaireNomrisque=scanner.next();
								scanner.nextLine();
								
								System.out.println("Entrer Votre prenom " );
								String ManutentionairePrenomrisque=scanner.nextLine();
								
								System.out.println("Entrer Votre Age " );
								int ManutentionaireAgerisque=scanner.nextInt();
								scanner.nextLine();
								
								System.out.println("Entrer Votre SalaireMent " );
								double SalaireMentrisque=scanner.nextDouble();
								scanner.nextLine();
								
								
								System.out.println("Entrer Votre Date_Ent " );
								int Date_Entrisque=scanner.nextInt();
								
								//YA BISMILAAH
								salairetotal = personel.CalculerSalaire(SalaireMentrisque,6);
								System.out.println("ha taman:"+salairetotal);
								
								manutentionaireRisq.create_data(ManutentionaireNomrisque,ManutentionairePrenomrisque,ManutentionaireAgerisque,salairetotal,Date_Entrisque);
								//LAH YKHLEF
								
						 break;	 
						 
						 }
											 	
					  break;
					  default:
				 }
				 break;
				 // end case 1 Add
			 case "2":
				 //select
			     personel.AfficherEmployer();
				 Personel.tt();
				 break;
			     //end case 2 Affiche
				 
			 case "3":
				 //delete
				 personel.SuprimmerEmployer();
				 Personel.nn();
				 break;
				 //end case 3 delete
				 
			 case "4":
				 //update
				// personel.ModifierEmployer();
				 //Personel.kk();
				 //break;
				 //end case 4 update
			
					 System.out.println(" Choisir  le type d'employer pour Modiffier "
						 		+ " \n Vendeur : .................1 "
						 		+ "\n Representeur  :..............2"
						 		+ "\n Producteur  :................ 3"
						 		+  "\n Manutentionaire  :.............. 4\"");
					 
						con.Connect();
						PreparedStatement ps = null;
						
						 String method3=scanner.next();
					 switch(method3) {
					 case "1":
						    System.out.println("Entrer Votre ID " );
							int ID=scanner.nextInt();
							scanner.nextInt();
							
						    System.out.println("Entrer Votre nom " );
							String Nom=scanner.next();
							scanner.nextLine();
							
							System.out.println("Entrer Votre prenom " );
							String Prenom=scanner.nextLine();

							
							System.out.println("Entrer Votre Age " );
							int Age=scanner.nextInt();
							scanner.nextLine();
							
							System.out.println("Entrer Votre SalaireVente " );
							double SalaireVente=scanner.nextDouble();
							
							
							System.out.println("Entrer Votre Date_Entre " );
							int Date_Entre=scanner.nextInt();
							scanner.nextLine();
							//YA BISMILAAH
							salairetotal = personel.CalculerSalaire(SalaireVente,1);
							System.out.println("ha taman:"+salairetotal);
							
							vendeur.update_data(Nom,Prenom,Age,salairetotal,Date_Entre);
						 break;
						 
					//..........
					 case "2":
							   System.out.println("Entrer Votre IDrep " );
							   int IDrep=scanner.nextInt();
							   scanner.nextInt();
							   
						 System.out.println("Entrer Votre nom " );
						  
						 String RepresenteurNom =scanner.next();
						 scanner.nextLine();
						
						System.out.println("Entrer Votre prenom " );
						String RepresenteurPrenom=scanner.nextLine();
											
						System.out.println("Entrer Votre Age " );
						int RepresenteurAge=scanner.nextInt();
						 scanner.nextLine();
						
						
						System.out.println("Entrer Votre SalaireRep " );
						double SalaireRep=scanner.nextDouble();
						 scanner.nextLine();
						
						
						System.out.println("Entrer Votre Date_Entr " );
						int Date_Entr=scanner.nextInt();
						
						//YA BISMILAAH
						salairetotal = personel.CalculerSalaire(SalaireRep,2);
						System.out.println("ha taman:"+salairetotal);
						
						
						representeur.update_data(RepresenteurNom,RepresenteurPrenom,RepresenteurAge,salairetotal,Date_Entr);
					  
						 break;
						 //........
					 case "3":
						 
						 System.out.println(" Ajouter le type Producteur "
									
												 		+ "\n Producteur  :.............1"
												 		+ "\n Producteur a risque  :................ 2\"");
											 
											 String choix=scanner.next();
											 switch(choix) {
											 case "1":
												 //add Producteur
												  
												   System.out.println("Entrer Votre IDrep " );
												   int IDProd=scanner.nextInt();
												   scanner.nextInt();
												   
												  System.out.println("Entrer Votre nom " );
													String ProducteurNom =scanner.next();
													 scanner.nextLine();
													
													System.out.println("Entrer Votre prenom " );
													String ProducteurPrenom=scanner.nextLine();
													
													
													System.out.println("Entrer Votre Age " );
													int ProducteurAge=scanner.nextInt();
													 scanner.nextLine();
													
													System.out.println("Entrer Votre SalaireProd " );
													double SalaireProd=scanner.nextDouble();
													 scanner.nextLine();
													
													
													System.out.println("Entrer Votre Date_Entree " );
													int Date_Entree=scanner.nextInt();
													//YA BISMILAAH
													salairetotal = personel.CalculerSalaire(SalaireProd,3);
													System.out.println("ha taman:"+salairetotal);
													
													producteur.update_data(ProducteurNom,ProducteurPrenom,ProducteurAge,salairetotal,Date_Entree);
													//LAH YKHLEF
													
													
												 
											 break;	
											 
											 //.........producteur a risque
											 case "2":
												 
												 //.........producteur a risque 
												 
												  
												   System.out.println("Entrer Votre IDrep " );
												   int iDRisq=scanner.nextInt();
												   scanner.nextInt();
												  
												  System.out.println("Entrer Votre nom " );
													String ProducteurNomrisque =scanner.next();
													 scanner.nextLine();
													
													System.out.println("Entrer Votre prenom " );
													String ProducteurPrenomrisque=scanner.nextLine();
													
													
													System.out.println("Entrer Votre Age " );
													int ProducteurAgerisque=scanner.nextInt();
													 scanner.nextLine();
													
													System.out.println("Entrer Votre SalaireProd " );
													double SalaireProdrisque=scanner.nextDouble();
													 scanner.nextLine();
													
													
													System.out.println("Entrer Votre Date_Entree " );
													int Date_Entreerisque=scanner.nextInt();
													//YA BISMILAAH
													salairetotal = personel.CalculerSalaire(SalaireProdrisque,5);
													System.out.println("ha taman:"+salairetotal);
													
													producteurrisq.update_data(ProducteurNomrisque,ProducteurPrenomrisque,ProducteurAgerisque,salairetotal,Date_Entreerisque);
													//LAH YKHLEF
											 break;	 
											 
											 }
																 	
										  break;
										  
							
						 case "4":
							 System.out.println(" Ajouter le type Manutentionaire "
										
												 		+ "\n Manutentionaire  :1"
												 		+ "\n Manutentionaire a risque  : 2\"");
											 
											 String choix2=scanner.next();
											 switch(choix2) {
											 case "1":
												
												  System.out.println("Entrer Votre IDrep " );
												   int IDMent=scanner.nextInt();
												   scanner.nextInt();
												   
												  System.out.println("Entrer Votre nom " );
													String ManutentionaireNom=scanner.next();
													scanner.nextLine();
													
													System.out.println("Entrer Votre prenom " );
													String ManutentionairePrenom=scanner.nextLine();
													
													System.out.println("Entrer Votre Age " );
													int ManutentionaireAge=scanner.nextInt();
													scanner.nextLine();
													
													System.out.println("Entrer Votre SalaireMent " );
													double SalaireMent=scanner.nextDouble();
													scanner.nextLine();
													
													
													System.out.println("Entrer Votre Date_Ent " );
													int Date_Ent=scanner.nextInt();
													
													//YA BISMILAAH
													salairetotal = personel.CalculerSalaire(SalaireMent,4);
													System.out.println("ha taman:"+salairetotal);
													
													manutentionaire.update_data(ManutentionaireNom,ManutentionairePrenom,ManutentionaireAge,salairetotal,Date_Ent);
													//LAH YKHLEF
													
													
												 
											 break;	
											 
											 //.........Manutentionaire a risque
											 case "2":
												 
												 //.........Manutentionaire a risque

												  System.out.println("Entrer Votre iDRisqe " );
												   int iDRisqe=scanner.nextInt();
												   scanner.nextInt();
												 
												 
												 System.out.println("Entrer Votre nom " );
													String ManutentionaireNomrisque=scanner.next();
													scanner.nextLine();
													
													System.out.println("Entrer Votre prenom " );
													String ManutentionairePrenomrisque=scanner.nextLine();
													
													System.out.println("Entrer Votre Age " );
													int ManutentionaireAgerisque=scanner.nextInt();
													scanner.nextLine();
													
													System.out.println("Entrer Votre SalaireMent " );
													double SalaireMentrisque=scanner.nextDouble();
													scanner.nextLine();
													
													
													System.out.println("Entrer Votre Date_Ent " );
													int Date_Entrisque=scanner.nextInt();
													
													//YA BISMILAAH
													salairetotal = personel.CalculerSalaire(SalaireMentrisque,6);
													System.out.println("ha taman:"+salairetotal);
													
													manutentionaireRisq.update_data(ManutentionaireNomrisque,ManutentionairePrenomrisque,ManutentionaireAgerisque,salairetotal,Date_Entrisque);
													//LAH YKHLEF
													

						    		       
							 break;
											 }

					}
					

				
			 case "5":
				 System.out.println("thanks for using Employee application");
					Quit = true;
				 break;
				
				 

			}
	}
		//..................................
	}

}
