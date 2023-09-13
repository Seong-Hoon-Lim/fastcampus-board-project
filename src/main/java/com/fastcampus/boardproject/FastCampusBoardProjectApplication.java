package com.fastcampus.boardproject;

import com.fastcampus.boardproject.config.ThymeleafConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(ThymeleafConfig.Thymeleaf3Properties.class)
@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusBoardProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastCampusBoardProjectApplication.class, args);
    }

}
