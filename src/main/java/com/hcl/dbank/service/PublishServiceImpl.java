package com.hcl.dbank.service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dbank.dto.ReportByMonth;
import com.hcl.dbank.model.Publish;
import com.hcl.dbank.repository.PublishRepository;

@Service
public class PublishServiceImpl implements PublishService {
	
	Queue<Publish> queue = new LinkedList<Publish>();
	
	@Autowired
	PublishRepository publishRepository; 
	
	@Autowired
	private EntityManager entityManager;
	
	private Session getSession()
	{
		return entityManager.unwrap(Session.class);
	}
	
	

	@Override
	public Publish createPublish(Publish publish) {
		
		
		
		return publishRepository.save(publish);
	}

	@Override
	public Publish viewPublish() {
		return publishRepository.viewPublish();
	}

	@Override
	public List<Publish> getPublish() {
		return publishRepository.findAll();
	}

	@Override
	public ReportByMonth getRecordByMonthWise() {
	
	/*	 getSession().beginTransaction();
	CriteriaBuilder builder= getSession().getCriteriaBuilder();
	CriteriaQuery<Publish> criteriaQuery=builder.createQuery(.class);
	Root<Publish> root=criteriaQuery.from(Publish.class);
	//builder.and(root.get("date").)
	 * 
	 * 
*/		 
	Object[] obj=publishRepository.getReportByMonth();
	System.out.println(Long.parseLong(obj[0].toString()));
		
		
		return null;
	}



	@Override
	public Publish createQueue(Publish publish) {
	        
	  
	        if(publish.getpName()!=null)
	        {
	        	 queue.add(new Publish(publish.getpId(),publish.getpName(),publish.getpVersion(),publish.getDate()));   
		            queue.add(publish);	
	        }else
	        {Publish published= new Publish();
	        published = queue.poll();
	        	publishRepository.save(published);
	        	publish=publishRepository.findById(published.getpId()).get(); 
	        }
	            
		return publish;
	}




	
	
	
	

}
