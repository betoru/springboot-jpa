package com.test.dylan.study;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index() {
    return "어서오소.";
  }
}