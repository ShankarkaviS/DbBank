package com.hcl.dbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dbank.model.Publish;
import com.hcl.dbank.service.PublishServiceImpl;

@RestController
public class PublishController {
	
	@Autowired
	PublishServiceImpl publishService;
	
	@PostMapping("/createPublish")
	public ResponseEntity<Publish> createPublish(@RequestBody Publish publish)
	{
		return new ResponseEntity<>(publishService.createPublish(publish),HttpStatus.OK);	
	}
	

}
