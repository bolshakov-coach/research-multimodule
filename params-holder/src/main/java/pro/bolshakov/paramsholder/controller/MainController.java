package pro.bolshakov.paramsholder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.bolshakov.paramsholder.config.MyClass;
import pro.bolshakov.paramsholder.config.ParamHolder;
import pro.bolshakov.paramsholder.config.ValuesProperties;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

@RestController
public class MainController {

    @Autowired
    private Environment env;

    @Autowired
    private ValuesProperties valuesProperties;

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private MyClass myClass;

    @Autowired
    private ParamHolder paramHolder;

    @GetMapping
    public String getProperties(){
        StringBuilder builder = new StringBuilder();
        for(Iterator it = ((AbstractEnvironment) env).getPropertySources().iterator(); it.hasNext(); ) {
            PropertySource propertySource = (PropertySource) it.next();
            if (propertySource instanceof MapPropertySource) {
                builder.append("<br><b>Source from ").append(propertySource.getName()).append("</b><br><ul>");
                for (Map.Entry<String, Object> entry : ((MapPropertySource) propertySource).getSource().entrySet()) {
                    builder.append("<li>Key -> ")
                            .append(entry.getKey())
                            .append(" = ")
                            .append(entry.getValue())
                            .append("</li>");
                }
                builder.append("</ul>");
            }
        }
        return builder.toString();
    }

    @GetMapping("/values")
    public String getValuesProperties(){
        return valuesProperties.toString();
    }

    @GetMapping("/app")
    public String getAppName(){
        return appName;
    }

    @GetMapping("/myclass")
    public String getMyClass(){
        return myClass.getTestValue();
    }

    @GetMapping("/async")
    public String getAsync(){
        myClass.runAsyncMethod(UUID.randomUUID());
        return "Ok";
    }

    @PutMapping("/v1/external-services/change-lead-by-product-app")
    public ResponseEntity<String> testPkbIntegration(HttpServletRequest request){
        System.out.println("Got a request with body: \n");
        return ResponseEntity.ok("All are ok");
    }

}
