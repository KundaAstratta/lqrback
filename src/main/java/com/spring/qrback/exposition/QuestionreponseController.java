package com.spring.qrback.exposition;

import com.spring.qrback.application.QuestionreponseService;
import com.spring.qrback.domaine.Questionreponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class QuestionreponseController {

    @Autowired
    QuestionreponseService questionreponseService;

    @RequestMapping(method = RequestMethod.GET, path = {"/qr"})
    public List<Questionreponse> findAll() {
        return this.questionreponseService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/qr/{id}"})
    public Questionreponse findById(@PathVariable("id") Long id) {
        return this.questionreponseService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/qr"})
    public Long save(@Valid @RequestBody Questionreponse questionreponse) {
        return this.questionreponseService.save(questionreponse);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/qr"})
    public Long update (@Valid @RequestBody Questionreponse questionreponse) {
        return  this.questionreponseService.save(questionreponse);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/qr/{id}"})
    public void deleteById(@PathVariable("id") Long id) {
        this.questionreponseService.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = {"/qr"})
    public void deleteAll() {
        this.questionreponseService.deleteAll();
    }

}
