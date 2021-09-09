package com.lucasapds.dmvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasapds.dmvendas.entities.Seller;

public interface SaleRepository  extends JpaRepository<Seller, Long>{

}
