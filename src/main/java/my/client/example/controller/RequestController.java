package my.client.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
  @RequestMapping("/")
  public String index() {
    return "Welcome to my client example!";
  }

}
