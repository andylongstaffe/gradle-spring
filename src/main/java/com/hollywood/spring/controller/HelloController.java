package com.hollywood.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main controller for this project.
 * 
 * @author andy
 * 
 */
@Controller
public class HelloController {

  /**
   * The welcome page.
   * 
   * @param model
   * @return
   */
  @RequestMapping("test")
  public String loadHomePage(ModelMap model) {
    model.addAttribute("message", "Spring 3 MVC Hello World");
    // return the name of the view
    return "hello";
  }
}
