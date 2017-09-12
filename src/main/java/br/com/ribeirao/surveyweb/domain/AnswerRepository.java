package br.com.ribeirao.surveyweb.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Answer, Integer> {

    List<Answer> findAll();

    List<Answer> findById(Integer... questions);


}
