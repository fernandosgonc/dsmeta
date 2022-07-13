package com.fernandosgonc.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandosgonc.dsmeta.entities.Sale;
import com.fernandosgonc.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
		
	}
	
	
	
}
