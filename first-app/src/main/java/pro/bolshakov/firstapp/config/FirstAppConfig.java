package pro.bolshakov.firstapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.bolshakov.firstapp.beans.InternalAppBean;

@Configuration
public class FirstAppConfig {

    @Bean
    public InternalAppBean internalAppBean(){
        return new InternalAppBean();
    }

}
