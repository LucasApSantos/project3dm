package com.lucasapds.dmvendas.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasapds.dmvendas.dto.SaleDTO;
import com.lucasapds.dmvendas.entities.Sale;
import com.lucasapds.dmvendas.repositories.SellerRepository;


@Service
public class SaleService {

	@Autowired
	private SellerRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result =  repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
}