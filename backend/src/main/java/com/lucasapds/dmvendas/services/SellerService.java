package com.lucasapds.dmvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasapds.dmvendas.dto.SellerDTO;
import com.lucasapds.dmvendas.entities.Seller;
import com.lucasapds.dmvendas.repositories.SaleRepository;

@Service
public class SellerService {

	@Autowired
	private SaleRepository repository;
	
	public List<SellerDTO> findAll(){
		
		List<Seller> result =  repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}
