package com.question.Services;

import com.question.Entities.Question;
import com.question.Repositories.QuestionRepository;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getOne( Long id);

    List<Question> getQuestionsByQuizId( Long quizId) ;

}
