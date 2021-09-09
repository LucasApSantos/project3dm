package com.lucasapds.dmvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasapds.dmvendas.entities.Sale;

public interface SellerRepository  extends JpaRepository<Sale, Long>{

}
