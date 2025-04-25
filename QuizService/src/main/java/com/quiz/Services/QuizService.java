package com.quiz.Services;

import com.quiz.Entities.Quiz;

import java.util.List;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> getAll();

    Quiz get(Long id) ;


}
