package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Produit;

@Service
public class ProduitMockServiceImpl implements IProduitService{
	
	private List<Produit> PRODUITS;
	
	ProduitMockServiceImpl(){
		PRODUITS = new ArrayList<Produit>();
		
		PRODUITS.add(new Produit("Livre", 50, 20));
		PRODUITS.add(new Produit("Cahier", 200, 5.25f));
		PRODUITS.add(new Produit("Stylo", 500, 2.10f));
	}
	
	
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return PRODUITS;
	}


	@Override
	public void addProduit(Produit produit) {
		PRODUITS.add(produit);
	}


	@Override
	public void updateProduit(Produit produit) {
		PRODUITS.remove(produit);
		PRODUITS.add(produit);
	}


	@Override
	public void deleteProduit(String ref) {
		Produit produit = new Produit();
		produit.setRef(ref);
		PRODUITS.remove(produit);
	}

}
