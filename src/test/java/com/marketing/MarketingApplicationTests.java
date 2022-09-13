package com.marketing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.marketing.repositories.LeadRepository;
import com.marketing.services.LeadService;

@SpringBootTest
class MarketingApplicationTests {

	@Autowired
	private LeadRepository leadRepo;
	
	@Autowired
	private LeadService leadService;
	@Test
	void checkClassname(){
		System.out.println(leadRepo.getClass().getName());
        System.out.println(leadService.getClass().getName());
	}

}
