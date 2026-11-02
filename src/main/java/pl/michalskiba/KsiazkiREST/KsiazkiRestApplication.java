package pl.michalskiba.KsiazkiREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KsiazkiRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(KsiazkiRestApplication.class, args);
    }
}
