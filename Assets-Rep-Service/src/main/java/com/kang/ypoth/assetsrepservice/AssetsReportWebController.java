package com.kang.ypoth.assetsrepservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/assets-report")

public class AssetsReportWebController {


	//@Autowired
	private AssetsReportService assetsRepServc;
	
	
	@Autowired
	public AssetsReportWebController(AssetsReportService assetsRepServ) {
		this.assetsRepServc=assetsRepServ;
	}
	
	
	@GetMapping(value = "/registers", produces = { "application/json" })
	public ResponseEntity<List<Index>> getAllRegisters(){
		
		List<Index> allIndex =  assetsRepServc.getAllRegisters();
		
		
		return ResponseEntity.ok(allIndex);
	}
	
		
		
	@GetMapping(value = "/registers/{socialSecNum}", produces = { "application/json" })
	public ResponseEntity<Index> getTheRegister(@PathVariable("socialSecNum") String socialSecNum){
		
		Index index = assetsRepServc.getRegister(socialSecNum);
		
		return ResponseEntity.ok(index);
	}
	
	
	@GetMapping(value = "/assets", produces = { "application/json" })
	public ResponseEntity<List<Assets>> getAllAssets(){
		
		List<Assets> allAssets = assetsRepServc.getAllAssets();
		
		return ResponseEntity.ok(allAssets);
	}
	
	
	//optional
	@GetMapping(value = "/assets/{socialSecNum}", produces = { "application/json" })
	public ResponseEntity<List<Assets>> getAssets(@PathVariable("socialSecNum") String socialSecNum){
		List<Assets> specificAssets = assetsRepServc.getAssets(socialSecNum);
		
		return ResponseEntity.ok(specificAssets);
	}
	
	
	@GetMapping(value ="/{socialSecNum}/assets", produces = { "application/json" })
   
	public ResponseEntity<AssetsReport> getAssetsList(@PathVariable("socialSecNum") String socialSecNum){ //kai 2 parametroi
		
		AssetsReport assetsReport = assetsRepServc.getReport(socialSecNum);
		
		return ResponseEntity.ok(assetsReport);

	}

	
}
