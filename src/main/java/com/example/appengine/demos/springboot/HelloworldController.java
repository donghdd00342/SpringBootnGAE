package com.example.appengine.demos.springboot;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
  private static final Logger log = Logger.getLogger(HelloworldController.class.getName());

  @GetMapping("/")
  public String hello() {
    log.info("info=============================================================");
    log.warning("warning-------------------------------------------------------");
    return "Hello world!";
  }
}
