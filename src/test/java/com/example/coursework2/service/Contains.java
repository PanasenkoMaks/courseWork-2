package com.example.coursework2.service;

import com.example.coursework2.Question;

import java.util.Set;

public class Contains {
    public static final String QUESTION1 = "ONE?";
    public static final String QUESTION2 = "TWO?";
    public static final String QUESTION3 = "THREE?";

    public static final String ANSWER1 = "ANSWER_ONE";
    public static final String ANSWER2 = "ANSWER_TWO";
    public static final String ANSWER3 = "ANSWER_THERE";

    public static final Question FULL_QUESTION1 = new Question(QUESTION1, ANSWER1);
    public static final Question FULL_QUESTION2 = new Question(QUESTION2, ANSWER2);
    public static final Question FULL_QUESTION3 = new Question(QUESTION3, ANSWER3);

    public static final Set<Question> TEST_QUESTION_SET_1 = Set.of(FULL_QUESTION1,
            FULL_QUESTION2, FULL_QUESTION3);
    public static final Set<Question> TEST_QUESTION_SET_2 = Set.of(FULL_QUESTION1);


}
