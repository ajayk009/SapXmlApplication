package com.springmongorest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.softcell.gonogo.model.request.ApplicationRequest;
import com.softcell.gonogo.model.request.Audit;

public interface AuditRepository extends MongoRepository<Audit, String>
{
	

}
