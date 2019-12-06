package com.softcell.gonogo.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softcell.gonogo.model.request.ApplicationRequest;
import com.softcell.gonogo.model.request.MongoDiffHistoryChange;
import com.softcell.gonogo.model.request.MongoDiffHistoryChangeItem;
import com.softcell.gonogo.model.request.MongoDiffHistoryEntry;
import com.softcell.gonogo.repository.ApplicantRepository;



@Service
public class ApplicantServiceImpl implements ApplicantService {

	@Autowired
	private ApplicantRepository applicantRepository;

	@Override
	public void addApplicant(ApplicationRequest applicantRequest) {
		// TODO Auto-generated method stub
		applicantRepository.save(applicantRequest);

	}

	@Override
	public void updateApplicant(ApplicationRequest applicantRequest) {
		// TODO Auto-generated method stub
		
		applicantRepository.save(applicantRequest);

	}
	
	
	/*
	 * private void saveChangeHistory(Object working, Object base) { assert working
	 * != null && base != null; assert working.getClass().equals(base.getClass());
	 * 
	 * String baseId = ObjectUtil.getPrimaryKeyValue(base).toString(); String
	 * workingId = ObjectUtil.getPrimaryKeyValue(working).toString(); assert baseId
	 * != null && workingId != null && baseId.equals(workingId);
	 * 
	 * MongoDiffHistoryEntry entry = getObjectHistory(base.getClass(), baseId); if
	 * (entry == null) { //throw new RuntimeException("history not found: " +
	 * base.getClass().getName() + "#" + baseId);
	 * logger.warn("history lost - create new base history record: {}#{}",
	 * base.getClass().getName(), baseId); saveNewHistory(base);
	 * saveHistory(working, base); return; }
	 * 
	 * final MongoDiffHistoryChange change = new MongoDiffHistoryChange();
	 * change.setHistoryDate(new Date()); change.setItems(new
	 * ArrayList<MongoDiffHistoryChangeItem>());
	 * 
	 * ObjectDiffer differ = ObjectDifferFactory.getInstance(); Node root =
	 * differ.compare(working, base); root.visit(new
	 * MongoDiffHistoryChangeVisitor(change, working, base));
	 * 
	 * if (entry.getDifferences() == null) entry.setDifferences(new
	 * ArrayList<MongoDiffHistoryChange>()); entry.getDifferences().add(change);
	 * 
	 * mongoTemplate.save(entry, getHistoryCollectionName(working.getClass())); }
	 */

}
