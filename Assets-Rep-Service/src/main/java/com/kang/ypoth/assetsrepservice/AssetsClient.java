package com.kang.ypoth.assetsrepservice;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient("assetsservice")
public interface AssetsClient {
	
	@GetMapping(value = "/assets", produces = { "application/json" } )
	public List<Assets> getAllAssets();
	
	@GetMapping(value = "/assets/{socialSecNum}", produces = { "application/json" })
	public List<Assets> getAssets(@PathVariable("socialSecNum") String socialSecNum);

}
