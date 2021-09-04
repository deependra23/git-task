package com.mycompany.gittask;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {
    @RequestMapping("/message")
    public String getMessage(){
    return "Hello People";
   }

}
