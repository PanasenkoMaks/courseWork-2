package com.example.coursework2.service;

import com.example.coursework2.Question;

import java.util.Collection;

public interface QuestionService {
   boolean addQuestion(String question, String answer);

    boolean removeQuestion(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion ();

    int getSize ();
}
