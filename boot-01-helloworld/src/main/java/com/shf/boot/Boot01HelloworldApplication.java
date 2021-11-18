package com.shf.boot;

import com.shf.boot.bean.Car;
import com.shf.boot.bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(Car.class)
public class Boot01HelloworldApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Boot01HelloworldApplication.class, args);

//        for (String definitionName : run.getBeanDefinitionNames())
//            System.out.println(definitionName);

        Pet tom = run.getBean("tom", Pet.class);
        System.out.println(tom);
    }

}
