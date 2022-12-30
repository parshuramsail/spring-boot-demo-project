package com.dailycoder.controller;

import com.dailycoder.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
        @RequestMapping("/")
        public String home(){
            return "hello world!";
        }

        @GetMapping("/user")
        public User user(){
            User user=new User();
            user.setId("1");
            user.setName("Paresh");
            user.setEmailId("parshusail416@gmail.com");
            return user;
        }

        @GetMapping("/{id}/{id2}")
        public  String pathVariable(@PathVariable String id,@PathVariable("id2") String id2){
            return "the path variable is:"+ id +"and"+ id2;
        }

        @GetMapping("/requestParam")
        public String requestParams(@RequestParam String name, @RequestParam(name="email", required = false, defaultValue = "") String emailId){
            return "Your name is :"+ name +" and email id is :"+ emailId;
        }

}
