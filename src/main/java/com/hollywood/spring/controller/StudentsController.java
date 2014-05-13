package com.hollywood.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hollywood.spring.datasource.Classroom;

@Controller
public class StudentsController {
  public static final String STUDENTS_VIEW_KEY = "studentsView";

  @RequestMapping(method = RequestMethod.GET, value = "/students")
  public final ModelAndView showStudentsPage() {
    Classroom classOfStudents = new Classroom("Class One");
    ModelAndView mav = new ModelAndView(STUDENTS_VIEW_KEY);
    mav.addObject("classRoom", classOfStudents);
    return mav;
  }

}
