package com.vault.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponse;

@SpringBootApplication
@EnableConfigurationProperties
public class VaultTestApplication implements CommandLineRunner {

    @Autowired
    VaultTemplate vaultTemplate;

    public static void main(String[] args) {
        SpringApplication.run(VaultTestApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        VaultResponse response = vaultTemplate.read("secret/spring-native-example");
        System.out.println(response.getData().get("password"));
    }
}
