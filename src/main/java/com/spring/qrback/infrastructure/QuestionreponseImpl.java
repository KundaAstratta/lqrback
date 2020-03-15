package com.spring.qrback.infrastructure;

import com.spring.qrback.domaine.Questionreponse;
import com.spring.qrback.domaine.QuestionreponseRepository;
import com.spring.qrback.domaine.exception.ErrorCodes;
import com.spring.qrback.domaine.exception.MyProjectException500;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.stream.Collectors;

@Repository
public class QuestionreponseImpl implements QuestionreponseRepository {

   @Autowired
    QuestionreponseDAO questionreponseDAO;


    @Override
    public List<Questionreponse> findAll() {
        return this.questionreponseDAO.findByOrderByIdAsc().stream().collect(Collectors.toList());
    }

    @Override
    public Questionreponse findById(Long id) {
        return this.questionreponseDAO.findById(id).orElseThrow(() -> new MyProjectException500(ErrorCodes.NOT_FOUND));
    }

    @Override
    public Long save(Questionreponse questionreponse) {
        this.questionreponseDAO.save(questionreponse);
        return questionreponse.getId();
    }

    @Override
    public Long update(Long id, Questionreponse questionreponse) {
        this.questionreponseDAO.save(questionreponse);
        return questionreponse.getId();
    }

    @Override
    public void deleteById(Long id) {
        this.questionreponseDAO.deleteById(id);
    }

    @Override
    public void deleteAll() {
        this.questionreponseDAO.deleteAll();
    }

}
