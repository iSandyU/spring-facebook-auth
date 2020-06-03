package com.sandeepmane.springfacebookauth.rest.hello;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class HelloController {
    
    @RequestMapping("/hello")
    public String sayHello()
    {
        return "Hello There!" ;
    }

}