package fr.adaming.entities;

public class CompteCourant {
	
	private int id;
	private String numeroCompte;
	private double Solde;
	private double Decouvert;
	
	
	public CompteCourant() {
		super();
	}


	public CompteCourant(String numeroCompte, double solde, double decouvert) {
		super();
		this.numeroCompte = numeroCompte;
		Solde = solde;
		Decouvert = decouvert;
	}


	public CompteCourant(int id, String numeroCompte, double solde, double decouvert) {
		super();
		this.id = id;
		this.numeroCompte = numeroCompte;
		Solde = solde;
		Decouvert = decouvert;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNumeroCompte() {
		return numeroCompte;
	}


	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}


	public double getSolde() {
		return Solde;
	}


	public void setSolde(double solde) {
		Solde = solde;
	}


	public double getDecouvert() {
		return Decouvert;
	}


	public void setDecouvert(double decouvert) {
		Decouvert = decouvert;
	}
	
	
	
	
	

}
