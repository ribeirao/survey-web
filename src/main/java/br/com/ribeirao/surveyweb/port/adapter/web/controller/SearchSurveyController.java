package br.com.ribeirao.surveyweb.port.adapter.web.controller;

import br.com.ribeirao.surveyweb.domain.Survey;
import br.com.ribeirao.surveyweb.domain.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class SearchSurveyController {

    Logger log = Logger.getLogger("SearchSurveyController");

    @Autowired
    private SurveyService surveyService;



    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listAll(Model model) {

        List<Survey> surveys = surveyService.retrieveAllSurveys();

        log.info(surveys.toString());

        model.addAttribute("surveys", surveys);

        return "listSurvey";
    }
}
