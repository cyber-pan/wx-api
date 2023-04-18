package com.wexin.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAsync
@EnableCaching
public class BootMnApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMnApplication.class, args);
    }
}
