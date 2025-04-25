package com.question.Services.Impl;

import com.question.Entities.Question;
import com.question.Repositories.QuestionRepository;
import com.question.Services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository ;

    public QuestionServiceImpl(QuestionRepository questionRepository){
        this.questionRepository = questionRepository ;
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(" No question found with the given ID"));
    }

    @Override
    public List<Question> getQuestionsByQuizId(Long quizId) {
        return questionRepository.findByquizId(quizId);
    }
}
