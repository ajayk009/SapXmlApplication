package com.springmongorest.repository;


import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.mongodb.repository.MongoRepository;


import com.softcell.gonogo.model.request.ApplicationRequest;


@JaversSpringDataAuditable
public interface ApplicantRepository extends MongoRepository<ApplicationRequest, String>
{


}
