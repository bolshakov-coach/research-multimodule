package pro.bolshakov.paramsholder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import pro.bolshakov.paramsholder.config.ValuesProperties;

@SpringBootApplication
@ConfigurationPropertiesScan({"pro.bolshakov.paramsholder.config"})
@EnableScheduling
@EnableAsync
public class ParamsApp {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ParamsApp.class);
        springApplication.setAdditionalProfiles("dev");
        springApplication.run(args);
    }

}
