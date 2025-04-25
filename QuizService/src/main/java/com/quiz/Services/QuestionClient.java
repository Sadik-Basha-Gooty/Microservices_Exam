package com.quiz.Services;

import com.quiz.Entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClient {

    @GetMapping("question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable Long quizId);

}
