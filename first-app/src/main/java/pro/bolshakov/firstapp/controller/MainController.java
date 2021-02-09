package pro.bolshakov.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.bolshakov.common.beans.SomeBean;
import pro.bolshakov.firstapp.beans.InternalAppBean;
import pro.bolshakov.firstapp.mapper.MyMapper;

import java.util.Iterator;
import java.util.Map;

@RestController
public class MainController {

    @Autowired
    private Environment env;

    @Value("${change.value:missing}")
    private String value;

    @Value("${common.value}")
    private String commonValue;

    @Value("${additional.value:default}")
    private String additionalValue;

    private final SomeBean someBean;
    private final InternalAppBean internalAppBean;
    private final MyMapper myMapper;

    public MainController(SomeBean someBean,
                          InternalAppBean internalAppBean,
                          MyMapper myMapper) {
        this.someBean = someBean;
        this.internalAppBean = internalAppBean;
        this.myMapper = myMapper;
    }

    @GetMapping
    public String getBean(){
        return someBean.toString();
    }

    @GetMapping("/internal")
    public String getInternalBean(){
        return internalAppBean.toString();
    }

    @GetMapping("/properties")
    public String getProperties(){
        System.out.println("commonValue -> " + commonValue);
        System.out.println("change.value -> " + value);
        System.out.println("additional.value -> " + additionalValue);
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


}
