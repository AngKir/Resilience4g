package com.kang.ypoth.assetsrepservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.bulkhead.annotation.Bulkhead.Type;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AssetsReportService {
	
	
//@Autowired
//private MessageSource messages;

//@Autowired
private AssetsClient assetsClient;

//@Autowired
private IndexClient indexClient;


@Autowired
public AssetsReportService(AssetsClient assetsClient,IndexClient indexClient) {
	this.assetsClient=assetsClient;
	this.indexClient=indexClient;
}


	@CircuitBreaker(name = "indexService")
	@Bulkhead(name = "bulkheadAssetsRepService")
	public List<Index> getAllRegisters(){
		
		return this.indexClient.getAllRegisters();
	}
	
		
	
	
	
	@CircuitBreaker(name = "indexService")
	@Bulkhead(name = "bulkheadAssetsRepService")
	public Index getRegister(String socialSecNum){
		return  this.indexClient.getRegister(socialSecNum);
	}
	
	
	
	
	
	@CircuitBreaker(name = "assetsService")
	@Bulkhead(name = "bulkheadAssetsRepService")
	public List<Assets> getAllAssets(){
		
		return this.assetsClient.getAllAssets();
	}
	
	
	
	@CircuitBreaker(name = "assetsService", fallbackMethod = "buildFallbackReportList")
	@Bulkhead(name = "bulkheadAssetsRepService", fallbackMethod = "buildFallbackReportList")
	public List<Assets> getAssets(String socialSecNum){
		
		return this.assetsClient.getAssets(socialSecNum);
	}
	
	@SuppressWarnings("unused")
	private AssetsReport buildFallbackReportList(String socialSecNum, Throwable t){
		AssetsReport fallbackList = new AssetsReport();
		Index index = new Index();
		index.setId(00000000000000);
		index.setSocialSecNum(socialSecNum);
		index.setFirstName("Sorry no information currently available");
		fallbackList.setIndex(index);
		fallbackList.setAssets(null);
		
		return fallbackList;
	}
	
	
	
	
	private AssetsReport getAssetsList(String socialSecNum){ //kai 2 parametroi
		
		
		Index register = getRegister(socialSecNum);
		List<Assets> assets =  getAssets(socialSecNum);
		
		
		/**if(register == null || assets == null) {
			throw new IllegalArgumentException(String.format(messages.getMessage("license.search.error.message", null, null)));	
			
		}else {*/
		
		
			AssetsReport reportelement = new AssetsReport();
		
			reportelement.setIndex(register);
		
			reportelement.setAssets(assets);
					
	

		
		
		return reportelement;
		}
		
		
		
	//}
	
	
	public AssetsReport getReport(String socialSecNum ) {
		AssetsReport report = getAssetsList(socialSecNum);
		
		return report;
		
	}
	
	
	
	
	
	
	}
	

