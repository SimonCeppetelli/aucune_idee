package fr.adaming.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="produits")

public class Produit {
	@Id
	@GeneratedValue
	private int idProduit;
	@Lob
	private byte[] photo;
	@Transient
	private String img;
	

	public Produit(byte[] photo, String img) {
		super();
		this.photo = photo;
		this.img = img;
	}

	public Produit(int idProduit, byte[] photo, String img) {
		super();
		this.idProduit = idProduit;
		this.photo = photo;
		this.img = img;
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

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	


}
