package com.spring.qrback.application;

import com.spring.qrback.domaine.Questionreponse;
import com.spring.qrback.domaine.QuestionreponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Queue;

@Service
@Transactional
public class QuestionreponseService {

    @Autowired
    QuestionreponseRepository questionreponseRepository;

    public List<Questionreponse> findAll() {
        return this.questionreponseRepository.findAll();
    }

    public Questionreponse findById(Long id) {
        return this.questionreponseRepository.findById(id);
    }

    public Long save (Questionreponse questionreponse) {
       return this.questionreponseRepository.save(questionreponse);
    }

    public Long update (Questionreponse questionreponse) {
        return  this.questionreponseRepository.save(questionreponse);
    }

    public void deleteById(Long id) {
        this.questionreponseRepository.deleteById(id);
    }

    public void deleteAll () {
        this.questionreponseRepository.deleteAll();
    }

}
