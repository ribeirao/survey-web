package br.com.ribeirao.surveyweb.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public Survey retrieveActiveSurvey() {
        return surveyRepository.findOneByActive(true);
    }

    public Survey saveSurvey(String name) {
        Survey survey = new Survey(name);

        return surveyRepository.save(survey);
    }
}
