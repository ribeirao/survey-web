package br.com.ribeirao.surveyweb.port.adapter.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ribeirao.surveyweb.application.survey.QuestionForm;
import br.com.ribeirao.surveyweb.application.survey.SurveyForm;
import br.com.ribeirao.surveyweb.domain.Survey;
import br.com.ribeirao.surveyweb.domain.SurveyService;

@Controller
public class CreateSurveyController {

    Logger log = LoggerFactory.getLogger(CreateSurveyController.class);

    @Autowired
    private SurveyService surveyService;

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public String initCreation(Model model) {
        model.addAttribute("surveyForm", new SurveyForm());
        return "create";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String create(@ModelAttribute SurveyForm surveyForm, Model model) {
        Survey survey = surveyService.saveSurvey(surveyForm.getSurveyName());
        QuestionForm form = new QuestionForm();
        form.setSurveyId(survey.getId());
        model.addAttribute("questionForm", form);

        return "createQuestion";
    }

    @RequestMapping(value = "/addQuestion", method = RequestMethod.POST)
    public String addQuestion(@ModelAttribute QuestionForm form, Model model) {
        Survey survey = surveyService.saveQuestion(form);
        form = new QuestionForm();
        form.setSurveyId(survey.getId());
        model.addAttribute("questionForm", form);

        return "createQuestion";
    }

}
