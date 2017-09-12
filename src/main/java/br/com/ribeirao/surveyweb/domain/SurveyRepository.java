package br.com.ribeirao.surveyweb.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository<Survey, Integer> {

    Survey findOneByActive(boolean active);

    List<Survey> findAll();

    List<Survey> findById(Integer... questions);


}
