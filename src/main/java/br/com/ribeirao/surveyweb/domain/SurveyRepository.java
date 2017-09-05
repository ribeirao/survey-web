package br.com.ribeirao.surveyweb.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SurveyRepository extends CrudRepository<Survey, Integer> {

    Survey findOneByActive(boolean active);

    List<Survey> findAll();

    List<Survey> findById(Integer ...questions);


}
