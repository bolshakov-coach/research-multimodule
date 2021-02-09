package pro.bolshakov.paramsholder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("${api.path}")
public interface IMainController {
    @GetMapping("/values")
    String getValuesProperties();
}
