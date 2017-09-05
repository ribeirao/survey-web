package br.com.ribeirao.surveyweb.domain;

import br.com.ribeirao.surveyweb.application.survey.QuestionForm;
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

    public Survey saveQuestion(QuestionForm form) {
        Survey survey = surveyRepository.findOne(form.getSurveyId());

        Question question = new Question(survey, form.getAnimation(), form.getStatement(), form.getOptionA(), form.getAnimationA(), form.getOptionB(), form.getAnimationB(), form.getOptionC(), form.getAnimationC(), form.getOptionD(), form.getAnimationD(), form.getOptionE(), form.getAnimationE(), form.getCorrectAnswer());

        survey.getQuestions().add(question);

        return surveyRepository.save(survey);
    }
}
