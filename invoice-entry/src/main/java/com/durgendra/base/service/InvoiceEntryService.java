package com.durgendra.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durgendra.base.entity.InvoiceEntry;
import com.durgendra.base.repository.InvoiceEntryRepository;

@Service
public class InvoiceEntryService {
	
	@Autowired
	private InvoiceEntryRepository repository;
	
	public InvoiceEntry save(InvoiceEntry invoiceEntry) {
		return repository.save(invoiceEntry);
	}
	public InvoiceEntry update(InvoiceEntry invoiceEntry) {
		return repository.save(invoiceEntry);
	}
	public List<InvoiceEntry> getAllInvoice(){
		return repository.findAll();
	}
	public InvoiceEntry getInvoiceById(Long id) {
		return repository.getById(id);
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}
	

}
