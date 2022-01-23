package com.monetago.exercise.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.monetago.exercise.model.Orders;
import com.monetago.exercise.service.DataTransformService;


@RestController
public class DataTransfomController {

	
	@Autowired
	DataTransformService transformService;
	
	 @RequestMapping(value = "/data-transform", method = RequestMethod.POST)
	 public ResponseEntity getData(@RequestBody Orders order) throws IOException {
		 
		 return ResponseEntity.ok().body(transformService.execute(order));
	
	 }
}
