package com.proyecto.b.s.service.serviceImpl;

import com.proyecto.b.s.entity.Answer;
import com.proyecto.b.s.exception.InvalidResourceException;
import com.proyecto.b.s.repository.AnswerRepository;
import com.proyecto.b.s.service.service.AnswerService;
import com.proyecto.b.s.utils.HelperValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public Answer findById(Long id) throws Exception {
        return answerRepository.findById(id).orElseThrow(() -> new InvalidResourceException("Answer not found -" + this.getClass().getName()));
    }

    @Override
    public boolean existById(Long id) {
        return answerRepository.existsById(id);
    }

    @Override
    public List<Answer> listAnswer() {
        List<Answer> answerList = answerRepository.findAll();
        HelperValidator.isEmptyList(answerList);
        return answerList;
    }

}
