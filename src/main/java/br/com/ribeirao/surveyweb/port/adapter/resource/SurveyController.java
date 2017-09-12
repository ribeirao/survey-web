package br.com.ribeirao.surveyweb.port.adapter.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ribeirao.surveyweb.application.SaveAnswerCommand;
import br.com.ribeirao.surveyweb.domain.Survey;
import br.com.ribeirao.surveyweb.domain.SurveyService;

@RestController
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @RequestMapping(value = "/surveys", method = RequestMethod.GET)
    public Survey getActiveSurvey() {
        return surveyService.retrieveActiveSurvey();
    }

    @RequestMapping(value = "/surveys", method = RequestMethod.POST)
    public boolean saveAnswer(SaveAnswerCommand command) {
        return surveyService.saveAnswer(command);
    }
}
