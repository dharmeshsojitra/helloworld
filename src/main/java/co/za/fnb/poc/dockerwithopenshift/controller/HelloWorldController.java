package co.za.fnb.poc.dockerwithopenshift.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller @EnableAutoConfiguration public class HelloWorldController {

    @RequestMapping("/hello") @ResponseBody public String sayHello() {
        return "Hello World fot the 4th time";
    }
}
