package pro.bolshakov.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.bolshakov.common.beans.SomeBean;
import pro.bolshakov.firstapp.beans.InternalAppBean;

@RestController
public class MainController {

    private final SomeBean someBean;
    private final InternalAppBean internalAppBean;

    public MainController(SomeBean someBean, InternalAppBean internalAppBean) {
        this.someBean = someBean;
        this.internalAppBean = internalAppBean;
    }

    @GetMapping
    public String getBean(){
        return someBean.toString();
    }

    @GetMapping("/internal")
    public String getInternalBean(){
        return internalAppBean.toString();
    }


}
