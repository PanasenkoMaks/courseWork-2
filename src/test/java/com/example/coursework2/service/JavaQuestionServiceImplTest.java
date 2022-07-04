package com.example.coursework2.service;

import com.example.coursework2.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static com.example.coursework2.service.Contains.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceImplTest {

    private final JavaQuestionServiceImpl out = new JavaQuestionServiceImpl();

    @Test
    void shouldAddQuestion(){
        out.addQuestion(QUESTION1, ANSWER1);
        assertTrue(out.getAll().contains(FULL_QUESTION1));
    }
    @Test
    void remove(){
        out.removeQuestion(QUESTION1, ANSWER1);
        assertFalse(out.getAll().contains(FULL_QUESTION1));
    }

    @Test
    void getALL(){
        out.addQuestion(QUESTION1, ANSWER1);
        out.addQuestion(QUESTION2, ANSWER2);
        out.addQuestion(QUESTION3, ANSWER3);
        assertTrue(out.getAll().containsAll(List.of(FULL_QUESTION1, FULL_QUESTION2, FULL_QUESTION3)));
    }
    @Test
    void getRandomQuestion(){
        out.addQuestion(QUESTION1, ANSWER1);
        Random random = mock(Random.class, withSettings().withoutAnnotations());
        when(random.nextInt(anyInt())).thenReturn(0);
       out.setRandom(random);
       assertEquals(FULL_QUESTION1, out.getRandomQuestion());
    }


}