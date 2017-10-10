package br.com.ribeirao.surveyweb.port.adapter.web.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.ribeirao.surveyweb.domain.Answer;
import br.com.ribeirao.surveyweb.domain.SurveyService;

@Controller
public class AnswerController {

    Logger log = Logger.getLogger("SearchSurveyController");

    @Autowired
    private SurveyService surveyService;



    @GetMapping(value = "/listAnswer/{surveyId}")
    public String listAllAnswers(@PathVariable("surveyId") Integer surveyId, Model model) {

        List<Answer> answers = surveyService.retrieveAnswerBySurveyId(surveyId);

        log.info(answers.toString());

        model.addAttribute("answers", answers);

        return "listAnswer";
    }
}
