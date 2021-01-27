package pro.bolshakov.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.bolshakov.common.beans.SomeBean;

@Configuration
public class CommonConfig {

    @Bean
    public SomeBean myBean(){
        return new SomeBean();
    }

}
