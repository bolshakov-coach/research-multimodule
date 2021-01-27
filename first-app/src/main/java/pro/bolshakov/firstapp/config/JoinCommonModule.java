package pro.bolshakov.firstapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pro.bolshakov.common.CommonConst;

@Configuration
@ComponentScan(CommonConst.MODULE_CONFIG_PATH)
public class JoinCommonModule{
}
