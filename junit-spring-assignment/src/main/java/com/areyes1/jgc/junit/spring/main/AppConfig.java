package com.areyes1.jgc.junit.spring.main;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;



//import com.areyes1.jgc.junit.spring.service.SampleService;
//
//import com.areyes1.jgc.junit.spring.service.SampleServiceImpl;
import com.areyes1.jgc.junit.spring.service.Service;
import com.areyes1.jgc.junit.spring.service.ServiceImpl;

@Configuration
public class AppConfig 
{
	@Bean
	public Service getSampleService() 
	{
		return new ServiceImpl();
	}
}



