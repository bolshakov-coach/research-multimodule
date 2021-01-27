package pro.bolshakov.paramsholder.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyClass extends AbstractMyClass{

    @Bean
    @ConfigurationProperties(prefix = "values.source")
    public ParamHolder paramHolder(){
        return new ParamHolder();
    }

}
