package study.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;
import java.util.UUID;

@EnableJpaAuditing //updatetime과 startdate base entity를 넣어주기 위해
@SpringBootApplication
public class DataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaApplication.class, args);
    }

    @Bean  //lastModifiedBy 실행시키기 위해 uuid를 넣어준다
    public AuditorAware<String> auditorProvider(){
        return () -> Optional.of(UUID.randomUUID().toString());
    }

}
