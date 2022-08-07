package com.dio.projeto.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("homolog")
public class ConfigDB {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigDB.class);

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            LOGGER.info("Rodando banco de desenvolvimento ");
        };
    }
}
