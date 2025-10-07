package com.catalog.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.catalog",
        "com.ecommerce.common"
})
@MapperScan({
        "com.catalog.persistence.mapper",
        "com.catalog.persistence.mapper.ext"
})
public class CatalogApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatalogApiApplication.class, args);
    }
}
