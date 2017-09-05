package br.com.ribeirao.surveyweb.port.adapter.web.controller;

import br.com.ribeirao.surveyweb.application.survey.QuestionForm;
import br.com.ribeirao.surveyweb.application.survey.SurveyForm;
import br.com.ribeirao.surveyweb.domain.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CreateSurveyController {

    @Autowired
    private SurveyService surveyService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String initCreation(Model model) {
        model.addAttribute("surveyForm", new SurveyForm());
        return "create";
    }

    @RequestMapping(value = "/addQuestion", method = RequestMethod.POST)
    public String create(@ModelAttribute SurveyForm surveyForm) {

        surveyService.saveSurvey(surveyForm.getSurveyName());

        return "create";
    }


}
