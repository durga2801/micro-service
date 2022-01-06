package com.durgendra.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durgendra.base.entity.InvoiceEntry;
import com.durgendra.base.service.InvoiceEntryService;

@RestController
@RequestMapping("/invoice-entry")
public class InvoiceEntryController {
	
	@Value("${app.name.profile}")
	private String val;
	
	@Autowired
	private InvoiceEntryService service;
	
	@GetMapping("/find/{id}")
	public InvoiceEntry getById(@PathVariable("id") Long id) {
		return service.getInvoiceById(id);
	}
	
	@PostMapping("/create")
	public InvoiceEntry create(@RequestBody InvoiceEntry invoiceEntry) {
		return service.update(invoiceEntry);
	}
	
	@PutMapping("/update")
	public InvoiceEntry update(@RequestBody InvoiceEntry invoiceEntry) {
		return service.update(invoiceEntry);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		service.delete(id);
		return "Success";
	}
	
	@GetMapping("/getAll")
	public List<InvoiceEntry> findAll(){
		return service.getAllInvoice();
	}

}
