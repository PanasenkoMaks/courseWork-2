package com.example.coursework2.controller;

import com.example.coursework2.Question;
import com.example.coursework2.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {
    private final QuestionService javaQuestionService;

    public JavaQuestionController(QuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }
    @GetMapping("/java/add")
    public void addQuestionJava(@RequestParam String question,
                                @RequestParam String answer){
       javaQuestionService.addQuestion(question, answer);
    }
    @GetMapping("/java/remove")
    public void removeQuestionJava(@RequestParam String question,
                                   @RequestParam String answer){
        javaQuestionService.removeQuestion(question,answer);
    }
    @GetMapping("/java/getAll")
    public Collection<Question> getAllQuestionJava (){
        return javaQuestionService.getAll();
    }
}
