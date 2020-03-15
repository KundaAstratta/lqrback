package com.spring.qrback.domaine;

import org.aspectj.weaver.patterns.TypePatternQuestions;

import java.util.List;

public interface QuestionreponseRepository {

    List<Questionreponse> findAll();
    Questionreponse findById(Long id);
    Long save (Questionreponse questionreponse);
    Long update(Long id, Questionreponse questionreponse);
    void deleteById(Long id);
    void deleteAll();

}
