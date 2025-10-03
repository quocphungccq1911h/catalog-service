package com.catalog.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.catalog.api",
        "com.ecommerce.common"
})
public class CatalogApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatalogApiApplication.class, args);
    }
}
