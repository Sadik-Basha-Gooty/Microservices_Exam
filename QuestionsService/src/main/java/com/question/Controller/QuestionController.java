package com.question.Controller;

import com.question.Entities.Question;
import com.question.Services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService ;

    public QuestionController ( QuestionService questionService){
        this.questionService = questionService ;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question) ;
    }

    //Get All
    @GetMapping
    public List<Question> getAll(){
        return questionService.get() ;
    }

    // Get by ID
    @GetMapping("/{questionId}")
    public Question getById( @PathVariable  Long questionId){
        return questionService.getOne(questionId) ;
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsById( @PathVariable Long quizId){
        return questionService.getQuestionsByQuizId(quizId);
    }
}
