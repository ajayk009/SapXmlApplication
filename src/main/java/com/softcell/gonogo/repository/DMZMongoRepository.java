package com.softcell.gonogo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.softcell.gonogo.model.request.SettlementInfo;



@Repository
public class DMZMongoRepository implements DMZRepository
{
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public SettlementInfo getData(String refId) throws Exception {



		try {

			Query query = new Query();
			query.addCriteria(Criteria.where("gonogoRefId").is(refId));


			return mongoTemplate.findOne(query, SettlementInfo.class);

		} catch (Exception e) {

			throw new Exception("");
		}
	}

}
