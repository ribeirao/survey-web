package br.com.ribeirao.surveyweb.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

    List<Question> findAll();

    Question findOne(Integer questionId);

}
