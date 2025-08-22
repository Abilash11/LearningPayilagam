package com.SpringBoot.LearningPayilagam;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import java.util.logging.Logger;

@SpringBootApplication
public class LearningPayilagamApplication {


//    Logger logger = LogFactory.getLog(LearningPayilagamApplication.class);

    private static final Log logger = LogFactory.getLog(LearningPayilagamApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LearningPayilagamApplication.class, args);
        logger.trace("Inside Micro detective :) TRACE method");
        logger.debug("Inside DE-BUG method");
        logger.info("Inside info :) method");
        logger.warn("Inside !!!!WARN METHOD !!! method");
        logger.error("|||||||This is Error|||||||||");


    }



}
