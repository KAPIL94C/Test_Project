package org.cap.flightmgt.flightms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


/**
 * this is equal to three annotations
 * 1) @Configuration
 * 2)@ComponentScan
 * 3)@EnableAutoConfiguration
 */
/*
 * 
 * 
 * @EnableTransactionManagement
 * 
 * @EnableDiscoveryClient
 */
@SpringBootApplication
public class FlightManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagementApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	/**
	 *
	 * for handling cross origin requests
	 */
	/*
	 * @Bean public CorsFilter corsFilter(){ UrlBasedCorsConfigurationSource src=new
	 * UrlBasedCorsConfigurationSource(); CorsConfiguration configuration=new
	 * CorsConfiguration(); configuration.setAllowCredentials(true);
	 * configuration.addAllowedHeader("*"); configuration.addAllowedOrigin("*");
	 * configuration.addAllowedMethod("*");
	 * src.registerCorsConfiguration("/**",configuration); return new
	 * CorsFilter(src); }
	 */

}
