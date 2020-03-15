package com.spring.qrback.infrastructure;

import com.spring.qrback.domaine.Questionreponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionreponseDAO extends JpaRepository<Questionreponse, Long> {

    List<Questionreponse> findByOrderByIdAsc();

}
