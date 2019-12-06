package com.softcell.gonogo.service;

import com.softcell.gonogo.model.request.SapResponse;

public interface DMZConnector
{
	  SapResponse getSapXmlFullData(String refID ) throws Exception;

}
