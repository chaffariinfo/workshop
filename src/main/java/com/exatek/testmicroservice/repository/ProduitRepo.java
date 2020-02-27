package com.exatek.testmicroservice.repository;

import com.exatek.testmicroservice.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepo extends JpaRepository<Produit, Integer> {

}
