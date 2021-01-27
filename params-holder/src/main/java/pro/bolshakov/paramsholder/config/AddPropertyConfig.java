package pro.bolshakov.paramsholder.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:additional/property_from-configuration.properties")
public class AddPropertyConfig {
}
