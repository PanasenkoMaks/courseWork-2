package com.example.coursework2.service;

import com.example.coursework2.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    public Set<Question> questionsStorage = new HashSet<>();
    private Random random = new Random();

    public void setRandom (Random random){
        this.random = random;
    }

    @Override
    public boolean addQuestion(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        return questionsStorage.add(newQuestion);
    }

    @Override
    public boolean removeQuestion(String question, String answer) {
        return questionsStorage.remove(new Question(question, answer));
    }

    @Override
    public Collection<Question> getAll() {
        return Set.copyOf(questionsStorage);
    }

    public Question getRandomQuestion() {
        return List.copyOf(questionsStorage).get(random.nextInt(questionsStorage.size()));

    }

    public int getSize() {
        return questionsStorage.size();
    }

}



