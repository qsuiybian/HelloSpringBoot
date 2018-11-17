package com.example.gqy.hellospringboot.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: HelloSpringBoot
 * @description:
 * @author: Cady
 * @create: 2018-11-17 23:04
 **/
@RestController
public class HelloWorld {
    /**
    * @Description:
    * @Param: []
    * @return: java.lang.String
    * @Author: Cady
    * @Date: 2018/11/17
    */
    @GetMapping("/helloWorld")
    public String print(){
        return "Hello World!";
    }
}
