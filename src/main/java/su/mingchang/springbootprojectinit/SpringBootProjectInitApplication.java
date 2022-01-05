package su.mingchang.springbootprojectinit;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.spring.initializr.web.support.SaganInitializrMetadataUpdateStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProjectInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProjectInitApplication.class, args);
    }

    @Bean
    SaganInitializrMetadataUpdateStrategy saganInitializrMetadataUpdateStrategy(RestTemplateBuilder restTemplateBuilder,
                                                                                ObjectMapper objectMapper) {
        return new SaganInitializrMetadataUpdateStrategy(restTemplateBuilder.build(), objectMapper);
    }

}
