package com.wesleyleocadioa.api.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

	@Bean
	public String applicationName() {
		return "Sistema de Vendas";
	}
	
}
