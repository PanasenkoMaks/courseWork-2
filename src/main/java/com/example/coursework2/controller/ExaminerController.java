package com.example.coursework2.controller;

import com.example.coursework2.Question;
import com.example.coursework2.service.ExaminerService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping()
public class ExaminerController {
    private final ExaminerService examinerService;
    public ExaminerController (ExaminerService examinerService){
        this.examinerService = examinerService;
    }

    @GetMapping("get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount){
        return examinerService.getQuestions(amount);
    }

}
