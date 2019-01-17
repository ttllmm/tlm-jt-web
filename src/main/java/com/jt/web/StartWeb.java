package com.jt.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class StartWeb {
public static void main(String[] args) {
	SpringApplication.run(StartWeb.class, args);
}
@RequestMapping("/")
public String GoIndex(){
	
	return "index";
	
	
}
}
