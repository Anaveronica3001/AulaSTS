package org.generation.blogPessoal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				//METODO API PARA SELECIONAR A PASTA CONTROLLER
				.select()
				.apis(RequestHandlerSelectors.basePackage
						("org.generation.blogPessoal.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	//INFORMAÇOES DO SITE(O QUE APARECE LOGO DE CARA)
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Blog Pessoal")
				.description("API do projeto de Blog Pessoal")
				.version("1.0")
				.contact(contact())
				.build();
	}
	//COLOCAR INFORMAÇOES DE CONTATO DO CRIADOR DO SITE
	private Contact contact() {
		return new Contact ("Lucas Santos Gonçalves",
							"https://github.com/LucasSG00",
							"Desenvolvedor Java Full Stack Jr");
	}
}