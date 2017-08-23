package br.com.ribeirao.surveyweb.domain;

import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository<Survey, Integer> {

    Survey findOneByActive(boolean active);

}
