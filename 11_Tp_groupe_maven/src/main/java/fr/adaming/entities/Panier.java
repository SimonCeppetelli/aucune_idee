package fr.adaming.entities;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="paniers")

public class Panier {
	

	// Trad de l'assoc UML en JAVA unidirectionnelle Panier-LigneCommande
	// Le panier voit LigneComande mais pas l'inverse
	@OneToMany(mappedBy="panier")
	private List<LigneCommande> ligneCommandes;

	
	// Constructeur
	public Panier() {
		super();
	}

	// getters setters
	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}
	
	
	

}
