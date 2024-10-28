package com.workshopngine.platform.workshopnginebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WorkshopNGineBackEndApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkshopNGineBackEndApplication.class, args);
    }

}
