package com.lloyds.ida.atmlocatorservice.controller;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lloyds.ida.atmlocatorservice.beans.ATM;
import com.lloyds.ida.atmlocatorservice.beans.Atms;
import com.lloyds.ida.atmlocatorservice.beans.Datum;
import com.lloyds.ida.atmlocatorservice.exception.IdentificationNotFoundException;

@RestController
public class AtmsController {
	
	 private static final Logger logger = LoggerFactory.getLogger(AtmsController.class);
	
	@GetMapping("atm-locator-service/atmdetails")
	public ATM retrieveAtmDetails(@RequestParam("url") String url, @RequestParam("identification") String identification) throws Exception {
		
		//	url = "https://api.lloydsbank.com/open-banking/v2.2/atms";
			URL urls = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) urls.openConnection();
			connection.setRequestProperty("accept", "application/json");
			InputStream responseStream = connection.getInputStream();
			ObjectMapper mapper = new ObjectMapper();
			Atms atms = mapper.readValue(responseStream, Atms.class);

			List<Datum> datas = atms.getData();
			ATM res = datas.stream()
					  .flatMap(d-> d.getBrand().stream())
					  .flatMap(b->b.getATM().stream())
					  .filter(a->a.getIdentification().equalsIgnoreCase(identification))
					  .findFirst()
					  .orElse(null);
			  
			  if (res== null)
					throw new IdentificationNotFoundException("identification- " + identification);
			
			  logger.info("success return of atm details");
			  return res;
	}
	
}
