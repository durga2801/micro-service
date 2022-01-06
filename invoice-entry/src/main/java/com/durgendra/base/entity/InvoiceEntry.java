package com.durgendra.base.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "invoice_entry")
public class InvoiceEntry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "invoice_number")
	private String invoiceNumber;
	@Column(name = "transaction_id")
	private String transactionId;
	@Column(name = "amount")
	private Double amount;
	@Column(name = "invoice_date")
	private Date invoiceDate;
	@Column(name = "invoice_expiry_date")
	private Date invoiceExpiryDate;

}
