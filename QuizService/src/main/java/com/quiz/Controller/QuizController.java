package com.quiz.Controller;

import com.quiz.Entities.Quiz;
import com.quiz.Services.QuestionClient;
import com.quiz.Services.QuizService;
import java.util.List ;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService ;



    public QuizController ( QuizService quizService ){
        this.quizService = quizService ;
    }

    //create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    //Get All
    @GetMapping
    public List <Quiz> getAll(){
        return quizService.getAll() ;
    }

    // Get by ID
    @GetMapping("/{id}")
    public Quiz getById( @PathVariable  Long id){
        return quizService.get(id) ;
    }
}
