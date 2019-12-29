package pl.michalskiba.KsiazkiREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
@SpringBootApplication
public class KsiazkiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KsiazkiRestApplication.class, args);
	}

//	@Bean
//	public View spittles() {
//		return new MappingJackson2JsonView();
//	}

}
