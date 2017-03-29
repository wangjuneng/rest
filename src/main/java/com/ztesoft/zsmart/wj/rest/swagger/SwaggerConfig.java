/**************************************************************************************** 
 Copyright © 2003-2012 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.wj.rest.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/** 
 * <Description> <br> 
 *  
 * @author xu.hong<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate Oct 24, 2016 <br>
 * @since V8.1<br>
 * @see com.ztesoft.zsmart.bss.crm.rest.impl <br>
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 
     * Description: <br> 
     *  
     * @author xu.hong<br>
     * @taskId <br>
     * @return <br>
     */
    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API Management")
            .description("No description provided")
            .license("")
            .licenseUrl("")
            .termsOfServiceUrl("")
            .version("2.0")
            //.contact(new Contact("","", ""))
            .build();
    }

    /**
     * 
     * Description: <br> 
     *  
     * @author xu.hong<br>
     * @taskId <br>
     * @return <br>
     */
    @Bean
    public Docket customImplementation() {
       return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.ztesoft.zsmart.wj.rest"))
        .paths(PathSelectors.any())
        .build();
    }
}
