package com.durgendra.base.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackMethodController {
	
	@GetMapping("/invoiceEntryFallBackMethod")
	public String invoiceEntryFallBackMethod() {
		return "Invoice Entry is taking longer then Usual. Please try again later";
	}

	@GetMapping("/applyFinanceFallBackMethod")
	public String applyFinanceFallBackMethod() {
		return "Apply Finance is taking longer then Usual. Please try again later";
	}
}