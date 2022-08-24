package buem.pro.summerschool.config;
/*
  @author   george
  @project   summerschool
  @class  SwaggerConfig
  @version  1.0.0 
  @since 23.08.22 - 19.42
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("buem.pro.summerschool"))
                .paths(PathSelectors.any())
                .build();
    }

}
