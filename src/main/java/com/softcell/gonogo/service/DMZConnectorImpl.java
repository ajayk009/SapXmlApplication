package com.softcell.gonogo.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softcell.gonogo.model.request.SapResponse;
import com.softcell.gonogo.model.request.SettlementInfo;
import com.softcell.gonogo.repository.DMZRepository;

@Service
public class DMZConnectorImpl implements DMZConnector
{

	
    @Autowired
    private DMZRepository dmzRepository;
    
    
	@Override
	public SapResponse getSapXmlFullData(String refID) throws Exception
	{
		
		SettlementInfo settlementInfo = dmzRepository.getData(refID);
		SapResponse sapResponse = new SapResponse();
		if(Objects.nonNull(sapResponse))
		{
		sapResponse.setResponse(settlementInfo.getRawResponse());
		}
		return sapResponse;
	}

}
