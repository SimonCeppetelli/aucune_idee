package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.ProduitDaoImpl;
import fr.adaming.entities.Produit;

@Service
@Transactional
public class ProduitServiceImpl {
	
	@Autowired
	private ProduitDaoImpl pDao;
	
	public List<Produit> getAllProduitsSer(){
		
		return pDao.getAllProduits();
	}
	
	public Produit addProduitSer(Produit pAdd) {
		
		return pDao.addProduit(pAdd);
	}

}
