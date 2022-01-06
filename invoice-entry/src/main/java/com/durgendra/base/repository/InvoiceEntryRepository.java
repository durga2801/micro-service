package com.durgendra.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.durgendra.base.entity.InvoiceEntry;

@Repository
public interface InvoiceEntryRepository extends JpaRepository<InvoiceEntry, Long>{

}
