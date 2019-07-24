package com.hcl.dbank.service;

import java.util.List;

import com.hcl.dbank.dto.ReportByMonth;
import com.hcl.dbank.model.Publish;

public interface PublishService {
	public Publish createPublish(Publish publish);
	public Publish viewPublish();
	public List<Publish> getPublish();
	public  ReportByMonth getRecordByMonthWise();
	
	public Publish createQueue(Publish publish);

	
	

}
