package fr.adaming.controllers;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import fr.adaming.entities.Produit;
import fr.adaming.service.ProduitServiceImpl;

@Controller
@RequestMapping("/ctrl")
public class MonController {

	@Autowired
	private ProduitServiceImpl pService;

	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public String afficherListe(ModelMap modeleMVC) {

		// récupérer la liste des étudiants d'un formateur

		List<Produit> liste = pService.getAllProduitsSer();

		// ajouter la liste dans le modele MVC
		modeleMVC.addAttribute("produit", liste);

		return "accueil";
	}

	// 1: afficher le formulaire et lui associé un objet de modele mvc
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView afficherFormulaire() {

		return new ModelAndView("ajout", "pAdd", new Produit());
	}

	// 2: traiter le formulaire soumis
	@PostMapping("/submitAdd")
	public String soumettreAjout(ModelMap modeleMVC, @RequestParam("photo") CommonsMultipartFile file){ 
		
		// convertion du format jpg en byte
		//
		// BufferedImage bufferedImage = ImageIO.read(file);
		//
		// // get DataBufferBytes from Raster
		// WritableRaster raster = bufferedImage.getRaster();
		// DataBufferByte data = (DataBufferByte) raster.getDataBuffer();
		// produit.setPhoto(data.getData());
		//produit.setPhoto(file.getContents());
		
		Produit produit = new Produit();
		produit.setPhoto(file.getBytes());

		// appel de la méthode service
		Produit pr = pService.addProduitSer(produit);

		if (pr.getIdProduit() != 0) {
			return "redirect:liste";

		} else {
			return "redirect:add";
		}

	}

}
