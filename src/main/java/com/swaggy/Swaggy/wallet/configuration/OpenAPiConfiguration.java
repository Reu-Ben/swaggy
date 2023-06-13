package com.swaggy.Swaggy.wallet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@OpenAPIDefinition(info = @Info(title = "SWAGGY", description = "SWAGGY Wallet, A Spring boot application that exposes a set of API's respecting the RESTFUL architecture to perform CRUD operations on user and view realtime currency exchange data", version = "v1.0", license = @License(name = "Softmelon Engineering", url = "www.softmelonengineering.com"), contact = @Contact(email = "Reuflams@gmail.com", name = "REUBEN MENSAH", url = "https://www.linkedin.com/in/reuben-mensah-0a3306205")))
@Configuration
public class OpenAPiConfiguration {

	final String securitySchemeName = "bearerAuth";

	@Bean
	public OpenAPI customizeOpenAPI() {
		return new OpenAPI().addSecurityItem(new SecurityRequirement().addList(securitySchemeName)).components(
				new Components().addSecuritySchemes(securitySchemeName, new SecurityScheme().name(securitySchemeName)
						.type(SecurityScheme.Type.HTTP).scheme("Bearer ").bearerFormat("JWT")));
	}
}
