package com.ztesoft.zsmart.wj.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * <Description> <br>
 * 
 * @author wang.jun<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年3月29日 <br>
 * @since V7.3<br>
 * @see com.ztesoft.zsmart.wj.rest <br>
 */

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
    DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class
})
@ComponentScan(basePackages = {
    "com.ztesoft.zsmart.wj.rest"
})
public class RestApplicationController {

    public static void main(String[] args) {
        SpringApplication.run(RestApplicationController.class, args);

    }

}
