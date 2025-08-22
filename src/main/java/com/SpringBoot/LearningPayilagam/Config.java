package com.SpringBoot.LearningPayilagam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
  @Bean
    public Certifications certifications()
    {
        return new Certifications("Java", "Payilagam");
    }

}
