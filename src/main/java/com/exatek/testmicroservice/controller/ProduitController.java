package com.exatek.testmicroservice.controller;


import com.exatek.testmicroservice.model.Produit;
import com.exatek.testmicroservice.repository.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ProduitController {

    @Autowired
    private ProduitRepo produitRepo;


    @GetMapping("/produits")
    public List<Produit> getAllProduits()
    {
        return (produitRepo.findAll());
    }
    @GetMapping(value = "/produits/{id}")
    public Optional<Produit> getProduit(@PathVariable(value="id") int id)
    {
        return(produitRepo.findById(id));
    }
    @DeleteMapping(value="/produits/{id}")
    public void deleteProduit(@PathVariable(value="id") int id)
    {
         Produit produit= produitRepo.getOne(id);
         produitRepo.delete(produit);
    }
    @PostMapping("/produits")
    public Produit addProduit( @RequestBody Produit produit)
    {
        return(produitRepo.save(produit));
    }




}

