package com.softcell.gonogo.model.request;

public class MongoDiffHistoryChangeItem {

	/* path to changed property (PropertyPath) */
	private String path;

	/*
	 * change state (NEW, CHANGED, REMOVED etc.) private Node.State state;
	 */

	/* original value (empty for NEW) */
	private Object base;

	/* new value (empty for REMOVED) */
	private Object modified;

}
