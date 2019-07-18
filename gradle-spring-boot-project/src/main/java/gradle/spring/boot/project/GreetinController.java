package gradle.spring.boot.project;

import org.springframework.beans.factory.annotation.Value;
import service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class GreetinController {

//    @Autowired
//    @Qualifier(value="service1")
//    TransferService service;

    @Autowired
    @Qualifier(value="service2")
    TransferService sqqq;

    @Resource(name="service3")
    TransferService s3;

    @Resource(name="object")
    SomeObject object;

    @Value("${server.port}")
    String serverPort;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="firstname", required=false, defaultValue="dear") String firstName,
                           @RequestParam(name="surname", required=false, defaultValue="World") String surName,
                           Model model) {
        model.addAttribute("firstname", firstName);
        model.addAttribute("surname", surName);

        //service.doSomething();
        sqqq.doSomething();
        s3.doSomething();
        object.showDummy();
        System.out.println(serverPort);
        return "greeting";
    }
}
