package com.hcl.dbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dbank.model.Publish;
import com.hcl.dbank.repository.PublishRepository;

@Service
public class PublishServiceImpl implements PublishService {
	
	@Autowired
	PublishRepository publishRepository; 

	@Override
	public Publish createPublish(Publish publish) {
		return publishRepository.save(publish);
	}
	
	
	
	

}
