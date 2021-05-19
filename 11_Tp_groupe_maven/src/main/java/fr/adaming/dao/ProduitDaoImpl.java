package fr.adaming.dao;

import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.entities.Produit;

@Repository
public class ProduitDaoImpl {

	@Autowired // pas besoin de setter car autowired va aller chercher dans tout les fichiers
	// s'il existe
	private SessionFactory sf;

	public List<Produit> getAllProduits() {
		// récupérer la session d'hibernate
		Session s = sf.getCurrentSession();

		// Construire la requête HQL
		String req = "FROM Produit as p";

		// récupérer l'objet query
		Query query = s.createQuery(req);

		List<Produit> listep = query.list();

		for (Produit p : listep) {
			p.setImg("data:image/png;base64," + Base64.encodeBase64String(p.getPhoto()));
		}

		// recup list
		return listep;
	}

	public Produit addProduit(Produit pAdd) {
		// récupérer la session d'hibernate
		Session s = sf.getCurrentSession();

		// envois de la requête
		s.save(pAdd);

		// récupération de l'étudiant
		return pAdd;
	}

}
