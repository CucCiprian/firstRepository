package gradle.spring.boot.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class HelloGradleController {

    @GetMapping
    public String helloGradle(){
        return "Hello gradle!";
    }
}
