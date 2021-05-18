package fr.adaming.entities;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="produits")

public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pr")
	private int idProduit;
	private String designation;
	private String description;
	private double prix;
	private int quantite;
	private boolean selectionne;
	private byte[] photo;
	
	// Traduction de l'assocaition UML en java
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="tab_association",joinColumns=@JoinColumn(name="id_pr"), inverseJoinColumns=@JoinColumn(name="co_id"))
	private List<Commande> commandes;
	
	@ManyToOne
	@JoinColumn(name="ca_id", referencedColumnName="id_ca")
	private Categorie categorie;
	
	
	public Produit(int idProduit, String designation, String description, double prix, int quantite,
			boolean selectionne, byte[] photo) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
	}




	public Produit(String designation, String description, double prix, int quantite, boolean selectionne,
			byte[] photo) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
	}




	public Produit() {
		super();
	}




	public int getIdProduit() {
		return idProduit;
	}




	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}




	public String getDesignation() {
		return designation;
	}




	public void setDesignation(String designation) {
		this.designation = designation;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public double getPrix() {
		return prix;
	}




	public void setPrix(double prix) {
		this.prix = prix;
	}




	public int getQuantite() {
		return quantite;
	}




	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}




	public boolean isSelectionne() {
		return selectionne;
	}




	public void setSelectionne(boolean selectionne) {
		this.selectionne = selectionne;
	}




	public byte[] getPhoto() {
		return photo;
	}




	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}




	public List<Commande> getCommandes() {
		return commandes;
	}




	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}




	public Categorie getCategorie() {
		return categorie;
	}




	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}




	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", designation=" + designation + ", description=" + description
				+ ", prix=" + prix + ", quantite=" + quantite + ", selectionne=" + selectionne + ", photo="
				+ Arrays.toString(photo) + "]";
	}
	
	

}
