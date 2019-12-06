package com.softcell.gonogo.model.request;

import java.util.List;

public class MongoDiffHistoryEntry 
{
	
	  private String id;

	    /* reference to original entity */
	    private String objectId;

	    /* copy of original entity (first version) */
	    private Object originalObject;

	    /* differences collection */
	    private List<MongoDiffHistoryChange> differences;

	    /* delete flag */
	    private boolean deleted;

}
