package com.softcell.gonogo.repository;

import com.softcell.gonogo.model.request.SettlementInfo;

public interface DMZRepository
{
	
    SettlementInfo getData(String refId) throws Exception;

}
