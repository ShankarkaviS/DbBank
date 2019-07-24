package com.hcl.dbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/viewPublish")
	public ResponseEntity<Publish> viewPublish()
	{
		return new ResponseEntity<>(publishService.viewPublish(),HttpStatus.OK);	
	}

	@GetMapping("/consumption")
	public ResponseEntity<List<Publish>> get()
	{
		return new ResponseEntity<>(publishService.getPublish(),HttpStatus.OK);	
	}

	
	@GetMapping("/reportByMonth")
	public ResponseEntity<Object> getReportByMonth()
	{
		return new ResponseEntity<>(publishService.getRecordByMonthWise(),HttpStatus.OK);	
	}
	
	
	@PostMapping("/createQueue")
	public ResponseEntity<Publish> createQueue(@RequestBody Publish publish)
	{ 
		return new ResponseEntity<>(publishService.createQueue(publish),HttpStatus.OK);	
	}
	
	
	@PostMapping("/createQueues")
	public ResponseEntity<Publish> viewQueue()
	{ Publish publish= new Publish();

		return new ResponseEntity<>(publishService.createQueue(publish),HttpStatus.OK);	
	}
}
