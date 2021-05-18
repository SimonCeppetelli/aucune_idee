package fr.adaming.entities;

import java.util.Arrays;

public class Categorie {

	private int idCategorie;
	private String nomCategorie;
	private byte[] photo;
	private String description;
	
	//constructeurs
	public Categorie(int idCategorie, String nomCategorie, byte[] photo, String description) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
	}
	public Categorie(String nomCategorie, byte[] photo, String description) {
		super();
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
	}
	public Categorie() {
		super();
	}
	
	//getters et setters
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", photo="
				+ Arrays.toString(photo) + ", description=" + description + "]";
	}
	
	
}
