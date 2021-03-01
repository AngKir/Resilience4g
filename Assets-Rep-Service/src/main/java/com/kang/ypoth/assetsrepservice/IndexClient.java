package com.kang.ypoth.assetsrepservice;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient("indexservice")
public interface IndexClient {
	
	 @RequestMapping(method= RequestMethod.GET,value="/index",consumes="application/json")
	public List<Index> getAllRegisters();
	
	@GetMapping(value = "/index/{socialSecNum}", produces = { "application/json" })
	public Index getRegister(@PathVariable("socialSecNum") String socialSecNum);
	

}
